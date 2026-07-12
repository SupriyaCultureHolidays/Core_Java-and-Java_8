import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HospitalService {

    // ── Singleton Pattern ──
    // private static final HospitalService instance = new HospitalService();
    // private constructor + public static HospitalService getInstance()

    // ── ডেটা রাখার জায়গা (Generics + Collection) ──
    // private List<Doctor> doctors = new ArrayList<>();
    // private List<Patient> patients = new ArrayList<>();
    // private List<Appointment> appointments = new ArrayList<>();
    // private List<Prescription> prescriptionHistory = new ArrayList<>();

    // ── মূল Method গুলো ──

    // addDoctor(Doctor doctor) / addPatient(Patient patient)
    //     — নিজ নিজ List-এ add করো

    // bookAppointment(String appointmentId, String patientId, String doctorId, LocalDate date)
    //     throws SlotAlreadyBookedException
    //     — একই doctorId + date-এ status BOOKED এমন appointment আগে থেকে থাকলে exception throw করো
    //     — নাহলে নতুন Appointment বানিয়ে appointments list-এ add করো, status BOOKED

    // completeAppointment(String appointmentId) throws AppointmentNotFoundException
    //     — appointmentId দিয়ে খুঁজে status COMPLETED করো, prescriptionHistory-তে একটা Prescription add করো

    // cancelAppointment(String appointmentId) throws AppointmentNotFoundException
    //     — appointmentId দিয়ে খুঁজে status CANCELLED করো

    // searchAppointments(AppointmentFilter criteria) — Stream + Lambda দিয়ে filter করো, List<Appointment> রিটার্ন করবে

    // findAppointmentById(String id) — Optional<Appointment> রিটার্ন করবে (পাওয়া না গেলে Optional.empty())

    // displayAllAppointments() — Comparator ব্যবহার করে date অনুযায়ী sort করে print করো

    // ── Bonus: Static Nested Class ──
    // Stats নামে static nested class বানাও — totalAppointments ও completedCount ধরে রাখবে
    // getStats() method দিয়ে এই Stats-এর object রিটার্ন করো
}
