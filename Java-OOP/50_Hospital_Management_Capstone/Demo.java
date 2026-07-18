/*
 * Capstone Project #2 — Hospital Appointment Booking System (49_Record_Final_Project-এর
 * সব OOP + Java 8 concept, একদম নতুন domain-এ আবার practice করার জন্য — এবার নিজে থেকে লিখো)
 *
 * এই project-এ শুধু 49-এর concept-গুলোই repeat হচ্ছে না — 49-এ যেই topic-গুলো একদমই
 * ব্যবহার হয়নি (standalone Generics, Set/Map, plain Interface, custom Annotation,
 * Inner/Anonymous Class, User Input, Try-With-Resources, Threads) সেগুলোও এখানে যোগ করা
 * হয়েছে, যাতে 1-49 নাম্বার topic-এর মধ্যে বাকি থাকা কনসেপ্টগুলোও clear হয়ে যায়।
 *
 * Classes: AppointmentStatus, Person, Patient, Doctor, Appointment, AppointmentFilter,
 *          AppointmentNotFoundException, SlotAlreadyBookedException, Prescription,
 *          HospitalService, Repository, Notifiable, AuditLog, ConsoleMenu,
 *          ConcurrentBookingDemo, Demo
 *
 * ── Core Requirements (49-এর মতোই) ──
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
 * ── Extra Practice (49-এ যেগুলো missed হয়েছিলো, এখানে cover করা হলো) ──
 * 12. Generics (standalone) — Repository<T, ID> নিজের generic class, বানানোর মতো
 *                             bounded type (<E extends Comparable<E>>) ও wildcard (List<? extends Person>)
 * 13. Set / Map              — HospitalService-এ specializations (Set) ও scheduleByDoctor (Map)
 * 14. Interface (plain)      — Notifiable — একাধিক method + default method + static method
 * 15. Annotation (custom)    — AuditLog — bookAppointment()-এ বসাও, reflection দিয়ে পড়ে দেখাও
 * 16. Inner Class            — Appointment.ReminderCard (non-static inner class)
 * 17. Anonymous Inner Class  — Demo-তে AppointmentFilter lambda ছাড়া anonymous class দিয়ে implement করো
 * 18. User Input             — ConsoleMenu-তে Scanner দিয়ে console input নেওয়া
 * 19. Try-With-Resources     — ConsoleMenu-তে Scanner-কে try(...)-এর ভিতরে রেখে auto-close করা
 * 20. Threads + Race Condition — ConcurrentBookingDemo-তে দুইটা Thread একসাথে booking করার চেষ্টা
 *
 * ── Bonus (ঐচ্ছিক, চাইলে যোগ করো) ──
 * - Object Cloning — Appointment.clone() দিয়ে একটা appointment duplicate করা
 * - Serialization  — Appointment Serializable বানিয়ে appointment list file-এ save/load করা
 * - Nested Class   — HospitalService.Stats (static nested) দিয়ে totalAppointments/completedCount
 * - Parallel Stream — displayAllAppointments()-এ .parallelStream() দিয়ে চেষ্টা করে দেখা
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
        HospitalService service = HospitalService.getInstance();

        Doctor drKarim = new Doctor("D1", "Dr. Karim", "Cardiologist");
        Patient rahim = new Patient("P1", "Rahim");
        Patient karimPatient = new Patient("P2", "Karim Patient");

        service.addDoctor(drKarim);
        service.addPatient(rahim);
        service.addPatient(karimPatient);

        // 1) booking + display
        try {
            System.out.println(service.bookAppointment("A1", "P1", "D1", java.time.LocalDate.of(2026, 7, 15)));
        } catch (SlotAlreadyBookedException e) {
            System.out.println(e.getMessage());
        }
        service.displayAllAppointments();

        // 2) complete + prescription
        try {
            service.completeAppointment("A1");
            System.out.println("Appointment completed. Prescription added for " + rahim.name + ".");
        } catch (AppointmentNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // 3) Optional test
        service.findAppointmentById("A1").ifPresent(System.out::println);
        System.out.println(service.findAppointmentById("A999"));

        // 4) AppointmentNotFoundException
        try {
            service.completeAppointment("A999");
        } catch (AppointmentNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // 5) SlotAlreadyBookedException — একই doctor + date-এ আবার booking চেষ্টা
        try {
            service.bookAppointment("A2", "P2", "D1", java.time.LocalDate.of(2026, 7, 15));
        } catch (SlotAlreadyBookedException e) {
            System.out.println(e.getMessage());
        }

        // Anonymous Inner Class practice (topic 17) — lambda-র বদলে anonymous class দিয়ে
        // AppointmentFilter implement করে পার্থক্যটা বোঝার চেষ্টা
        AppointmentFilter completedFilter = new AppointmentFilter() {
            @Override
            public boolean matches(Appointment a) {
                return a.getStatus() == AppointmentStatus.COMPLETED;
            }
        };
        System.out.println(service.searchAppointments(completedFilter));

        // Annotation + Reflection practice (topic 15) — HospitalService.class-এর সব method
        // ঘুরে দেখা হচ্ছে কোনটার উপর @AuditLog বসানো আছে
        for (java.lang.reflect.Method m : HospitalService.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(AuditLog.class)) {
                System.out.println(m.getName() + " -> " + m.getAnnotation(AuditLog.class).action());
            }
        }

        // Interface default/static method practice (topic 14)
        Notifiable.consoleNotifier().sendDefaultReminder();
        drKarim.sendDefaultReminder();

        // Inner Class practice (topic 16)
        Appointment a1 = service.findAppointmentById("A1").orElseThrow();
        Appointment.ReminderCard card = a1.new ReminderCard();
        card.print();

        // standalone Generics practice (topic 12) — bounded type + wildcard
        Repository<Appointment, String> appointmentRepo = new Repository<>();
        appointmentRepo.save("A1", a1);
        System.out.println(appointmentRepo.findById("A1"));
        System.out.println(Repository.max(java.util.Arrays.asList(3, 7, 2, 9, 4)));
        Repository.printAll(java.util.List.of(drKarim, rahim));

        // Set/Map practice (topic 13) — Stats নেয় appointments থেকেই
        System.out.println(service.getStats());
    }
}
