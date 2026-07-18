import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class HospitalService {

    // ── Singleton Pattern ──
    // Step 1: Static instance তৈরি করো
    private static final HospitalService instance = new HospitalService();

    // private constructor + public static HospitalService getInstance()
    // Step 2: Constructor private করো
    private HospitalService() {
    }

    // Step 3: getInstance() method এটাই সবাই call করে object পাবে।
    public static HospitalService getInstance() {
        return instance;
    }

    // ── ডেটা রাখার জায়গা (Generics + Collection) ──
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();
    private List<Prescription> prescriptionHistory = new ArrayList<>();
    //
    // চাইলে raw List-এর বদলে নিজের বানানো generic Repository<Appointment, String>
    // ব্যবহার করতে
    // পারো (দেখো Repository.java) — Spring Data JPA-র Repository<T, ID> ঠিক এভাবেই
    // কাজ করে

    // ── Set/Map practice (topic 13) ──
    private Set<String> specializations = new HashSet<>();
    // — addDoctor()-এ doctor-এর specialization add হয়, duplicate থাকবে না (Set-এর বৈশিষ্ট্য)
    private Map<String, List<Appointment>> scheduleByDoctor = new HashMap<>();
    // — doctorId অনুযায়ী appointment group করে রাখা হয়, doctor-এর নিজের schedule বের করতে কাজে লাগবে

    // ── মূল Method গুলো ──

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        specializations.add(doctor.specialization);
        scheduleByDoctor.putIfAbsent(doctor.id, new ArrayList<>());
    }

    void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Threads bonus (ConcurrentBookingDemo.java দেখো): দুইটা Thread একসাথে call করলে race
    // condition হতে পারে, তাই "synchronized" keyword যোগ করা হলো। এটা সরিয়ে ConcurrentBookingDemo
    // চালিয়ে দেখতে পারো race condition কেমন দেখতে হয়।
    @AuditLog(action = "BOOK")
    synchronized String bookAppointment(String appointmentId, String patientId, String doctorId, LocalDate date)
            throws SlotAlreadyBookedException {
        // CANCELLED appointment-এর slot আবার খালি ধরা হচ্ছে, কিন্তু BOOKED বা COMPLETED —
        // দুটোই মানে doctor-এর ওই date-এর slot আগেই ব্যবহার হয়ে গেছে
        boolean slotTaken = appointments.stream()
                .anyMatch(a -> a.getDoctorId().equals(doctorId) && a.getDate().equals(date)
                        && a.getStatus() != AppointmentStatus.CANCELLED);
        if (slotTaken) {
            String doctorLabel = doctors.stream()
                    .filter(d -> d.id.equals(doctorId))
                    .map(d -> d.name)
                    .findFirst()
                    .orElse(doctorId);
            throw new SlotAlreadyBookedException("Slot already booked for " + doctorLabel + " on " + date);
        }

        Appointment appointment = new Appointment(appointmentId, patientId, doctorId, date, AppointmentStatus.BOOKED);
        appointments.add(appointment);
        scheduleByDoctor.computeIfAbsent(doctorId, k -> new ArrayList<>()).add(appointment);
        patients.stream()
                .filter(p -> p.id.equals(patientId))
                .findFirst()
                .ifPresent(p -> p.appointmentIds.add(appointmentId));
        return "Appointment booked: " + appointmentId;
    }

    void completeAppointment(String appointmentId) throws AppointmentNotFoundException {
        Appointment appointment = findAppointmentById(appointmentId)
                .orElseThrow(() -> new AppointmentNotFoundException("Appointment not found: " + appointmentId));
        appointment.setStatus(AppointmentStatus.COMPLETED);
        prescriptionHistory.add(new Prescription(appointment.getPatientId(), appointment.getDoctorId(),
                appointment.getDate(), "Paracetamol"));
    }

    void cancelAppointment(String appointmentId) throws AppointmentNotFoundException {
        Appointment appointment = findAppointmentById(appointmentId)
                .orElseThrow(() -> new AppointmentNotFoundException("Appointment not found: " + appointmentId));
        appointment.setStatus(AppointmentStatus.CANCELLED);
    }

    // searchAppointments(AppointmentFilter criteria) — Stream + Lambda দিয়ে filter
    // করো, List<Appointment> রিটার্ন করবে
    List<Appointment> searchAppointments(AppointmentFilter criteria) {
        return appointments.stream().filter(appointment -> criteria.matches(appointment)).toList();
    }

    // findAppointmentById(String id) — Optional<Appointment> রিটার্ন করবে (পাওয়া
    // না গেলে Optional.empty())
    Optional<Appointment> findAppointmentById(String id) {
        return appointments.stream().filter(f -> f.getId().equals(id)).findFirst();
    }

    // displayAllAppointments() — Comparator ব্যবহার করে date অনুযায়ী sort করে
    // print করো
    // — বোনাস: বড় list হলে .parallelStream() দিয়েও চেষ্টা করে দেখতে পারো (topic
    // 47),
    // তবে ছোট list-এ এটা লাভজনক না, বরং overhead বাড়ায় — কখন ব্যবহার করা উচিত
    // সেটা বোঝাই আসল লক্ষ্য
    void displayAllAppointments() {
        appointments.sort((d1, d2) -> d1.getDate().compareTo(d2.getDate()));
        System.out.println(appointments);
    }

    // ── Bonus: Static Nested Class ──
    static class Stats {
        final int totalAppointments;
        final int completedCount;

        Stats(int totalAppointments, int completedCount) {
            this.totalAppointments = totalAppointments;
            this.completedCount = completedCount;
        }

        @Override
        public String toString() {
            return "Stats{total=" + totalAppointments + ", completed=" + completedCount + "}";
        }
    }

    Stats getStats() {
        long completed = appointments.stream().filter(a -> a.getStatus() == AppointmentStatus.COMPLETED).count();
        return new Stats(appointments.size(), (int) completed);
    }
}
