/*
 * Capstone Project #2 — Hospital Appointment Booking System (49_Record_Final_Project-এর
 * সব OOP + Java 8 concept, একদম নতুন domain-এ আবার practice করার জন্য — এবার নিজে থেকে লিখো)
 *
 * Classes: AppointmentStatus, Person, Patient, Doctor, Appointment, AppointmentFilter,
 *          AppointmentNotFoundException, SlotAlreadyBookedException, Prescription,
 *          HospitalService, Demo
 *
 * ── Core Requirements ──
 *  1. Enum                    — AppointmentStatus { BOOKED, COMPLETED, CANCELLED }
 *  2. Abstraction/Inheritance — Person (abstract) → Patient, Doctor
 *                               (getRole() override করো — Polymorphism দেখানোর জন্য)
 *  3. Encapsulation           — Appointment (id, patientId, doctorId, date, status) — private field + getter/setter
 *  4. Exception Handling      — AppointmentNotFoundException, SlotAlreadyBookedException
 *                               (custom checked exception, bookAppointment/completeAppointment/cancelAppointment-এ throw করবে)
 *  5. Functional Interface + Lambda — AppointmentFilter দিয়ে যেকোনো শর্তে appointment খোঁজা
 *                               (যেমন: service.searchAppointments(a -> a.getStatus() == AppointmentStatus.BOOKED))
 *  6. Generics + Collection   — List<Appointment>, List<Prescription> দিয়ে ডেটা রাখা
 *  7. Stream API              — searchAppointments() ও displayAllAppointments()-এ filter/sorted ব্যবহার করো
 *  8. Comparator              — date অনুযায়ী appointment sort করো
 *  9. Optional                — findAppointmentById() কখনো null রিটার্ন করবে না, Optional<Appointment> দেবে
 * 10. Record                  — Prescription(patientId, doctorId, date, medicine) — prescription-এর log
 * 11. Singleton               — HospitalService-এর মাত্র ১টা object সারা Application-এ
 *
 * ── Bonus (ঐচ্ছিক, চাইলে যোগ করো) ──
 * - Object Cloning — Appointment.clone() দিয়ে একটা appointment duplicate করা
 * - Serialization  — Appointment Serializable বানিয়ে appointment list file-এ save/load করা
 * - Nested Class   — HospitalService.Stats (static nested) দিয়ে totalAppointments/completedCount
 * - Threads        — দুটো Thread একসাথে একই doctor-এর একই date-এ বুক করার চেষ্টা করলে synchronized
 *                    দিয়ে race condition আটকানো
 *
 * ── Demo-তে যা করতে হবে ──
 * একজন Doctor আর দুইজন Patient বানাও, একটা Appointment বুক করো, সব appointment list করো
 * (booked-টার status "BOOKED" দেখাবে), তারপর completeAppointment() call করে Prescription
 * add করো, findAppointmentById() দিয়ে Optional test করো এবং না থাকা appointment-এর জন্য
 * AppointmentNotFoundException handle করে দেখাও। শেষে একই doctor + date-এ আবার
 * bookAppointment() করার চেষ্টা করে SlotAlreadyBookedException দেখাও।
 *
 * Output (নমুনা):
 * Appointment: A1, Doctor: Dr. Karim, Patient: Rahim, Status: BOOKED
 * Appointment completed. Prescription added for Rahim.
 * Appointment not found: A999
 * Slot already booked for Dr. Karim on 2026-07-15
 *
 * ── Build Order (নিচ থেকে উপরে — যেটা অন্যেরা use করবে সেটা আগে) ──
 *
 *  1. AppointmentStatus (Enum) — কোনো dependency নেই, সবার আগে
 *  2. Person (abstract) → Patient, Doctor — Inheritance + Polymorphism (getRole() override)
 *  3. Appointment (already done) — Encapsulation
 *  4. AppointmentFilter — Functional Interface (lambda দিয়ে search করার contract)
 *  5. AppointmentNotFoundException, SlotAlreadyBookedException — Custom checked exceptions
 *  6. Prescription — Record (plain data holder)
 *  7. HospitalService — সবচেয়ে complex part: Singleton + List<Appointment>/List<Prescription>
 *     + Stream API + Comparator + Optional + exception throw। এটা সবার পরে করবা কারণ
 *     এটা বাকি সব class use করে
 *  8. Demo — সব একসাথে test/wire up করা
 *
 * কারণ: প্রত্যেক step আগের step-এর উপর depend করে। আগে dependency না বানালে
 * পরে circular confusion হয় — ঠিক 49 নাম্বার প্রজেক্টের মতোই।
 */
public class Demo {
    public static void main(String[] args) {
        Appointment a1 = new Appointment("1", "P1", "D1", java.time.LocalDate.of(2026, 7, 15), AppointmentStatus.BOOKED);
        System.out.println(a1.getStatus());
        a1.setStatus(AppointmentStatus.COMPLETED);
        System.out.println(a1);

        // এখান থেকে বাকিটা তুমি লিখো — HospitalService.getInstance() দিয়ে instance নাও,
        // Doctor/Patient বানাও, bookAppointment() call করো...
    }
}
