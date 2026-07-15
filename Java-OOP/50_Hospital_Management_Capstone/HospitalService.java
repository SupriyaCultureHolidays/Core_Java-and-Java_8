import java.lang.classfile.ClassFile.Option;
import java.nio.file.OpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
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

    // ── Set/Map practice (topic 42, 43) ──
    private Set<String> specializations = new HashSet<>();
    // — addDoctor()-এ doctor.getSpecialization() add করো, duplicate থাকবে না
    // (Set-এর বৈশিষ্ট্য)
    private Map<String, List<Appointment>> scheduleByDoctor = new HashMap<>();
    // — doctorId অনুযায়ী appointment group করে রাখার জন্য, doctor-এর নিজের
    // schedule বের করতে কাজে লাগবে

    // ── মূল Method গুলো ──

    // addDoctor(Doctor doctor) / addPatient(Patient patient)
    // — নিজ নিজ List-এ add করো, doctor-এর specialization থাকলে specializations
    // Set-এও add করো
    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    void addPatient(Patient patient) {
        patients.add(patient);
    }

    // @AuditLog(action = "BOOK") — এই annotation টা bookAppointment()-এর উপর বসাও
    // (topic 28 practice)
    // — পরে Demo-তে reflection দিয়ে পড়ে দেখাবে কোন method-এ AuditLog আছে
    // throws SlotAlreadyBookedException
    // — একই doctorId + date-এ status BOOKED এমন appointment আগে থেকে থাকলে
    // exception throw করো
    // — নাহলে নতুন Appointment বানিয়ে appointments list-এ add করো, status BOOKED
    // — Threads bonus (ConcurrentBookingDemo.java দেখো): দুইটা Thread একসাথে call
    // করলে race
    // condition হতে পারে, তাই method-এর signature-এ "synchronized" keyword যোগ করার
    // কথা ভাবো
    String bookAppointment(String appointmentId, String patientId, String doctorId, LocalDate date)
            throws SlotAlreadyBookedException {
        Optional<Doctor> isPresentDoc = doctors.stream()
                .filter(d -> d.id.equals(doctorId))
                .findFirst();
        if (isPresentDoc.isEmpty()) {
            throw new SlotAlreadyBookedException("Doctorid Invalid");
        }
        Optional<Appointment> app = appointments.stream()
                .filter(a -> a.getDoctorId().equals(doctorId) && a.getDate().equals(date)).findFirst();
        if (app != null) {
            throw new SlotAlreadyBookedException("Doctor already Assign");
        }
        appointments.add(new Appointment(appointmentId, patientId, doctorId, date, AppointmentStatus.BOOKED));
        return "Appointment Booked";
    }

    // completeAppointment(String appointmentId) throws AppointmentNotFoundException
    // — appointmentId দিয়ে খুঁজে status COMPLETED করো, prescriptionHistory-তে একটা
    // Prescription add করো
    void completeAppointment(String appointmentId) throws AppointmentNotFoundException {
        Appointment appoi = appointments.stream().filter(a -> a.getId().equals(appointmentId)).findFirst()
                .orElseThrow(() -> new AppointmentNotFoundException(""));
        appoi.setStatus(AppointmentStatus.COMPLETED);
        prescriptionHistory
                .add(new Prescription(appoi.getPatientId(), appoi.getDoctorId(), appoi.getDate(), "Paracitamal"));
                System.out.println("Completed Your Appoinment");
    }

    void cancelAppointment(String appointmentId) throws AppointmentNotFoundException {
        // — appointmentId দিয়ে খুঁজে status CANCELLED করো
        Appointment appo = appointments.stream().filter(f -> f.getId().equals(appointmentId)).findFirst()
                .orElseThrow(() -> new AppointmentNotFoundException("Appointment Id Invalid"));
        appo.setStatus(AppointmentStatus.CANCELLED);
        System.out.println("Appoinment Cancleed");

    }

    // searchAppointments(AppointmentFilter criteria) — Stream + Lambda দিয়ে filter
    // করো, List<Appointment> রিটার্ন করবে

    // findAppointmentById(String id) — Optional<Appointment> রিটার্ন করবে (পাওয়া
    // না গেলে Optional.empty())

    // displayAllAppointments() — Comparator ব্যবহার করে date অনুযায়ী sort করে
    // print করো
    // — বোনাস: বড় list হলে .parallelStream() দিয়েও চেষ্টা করে দেখতে পারো (topic
    // 47),
    // তবে ছোট list-এ এটা লাভজনক না, বরং overhead বাড়ায় — কখন ব্যবহার করা উচিত
    // সেটা বোঝাই আসল লক্ষ্য

    // ── Bonus: Static Nested Class ──
    // Stats নামে static nested class বানাও — totalAppointments ও completedCount ধরে
    // রাখবে
    // getStats() method দিয়ে এই Stats-এর object রিটার্ন করো
}
