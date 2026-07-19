/*
 * Capstone Project #4 (ছোট, Core-only) — School Course Enrollment System
 *
 * 49, 50, 51-এ পুরো ২০+ টপিক তিনবার cover হয়ে গেছে — এইবার শুধু Core ১১টা concept
 * নতুন domain-এ আরেকবার ঝালাই করার জন্য একটা ছোট, focused প্রজেক্ট। Extra Practice
 * (Set/Map, Annotation, Inner/Anonymous Class, User Input, Threads) আর Bonus এখানে
 * ইচ্ছাকৃতভাবে বাদ — যেহেতু ওগুলো আগেই তিনবার practice হয়ে গেছে।
 *
 * Classes: EnrollmentStatus, Person, Student, Instructor, Course, Enrollment,
 *          EnrollmentFilter, EnrollmentNotFoundException, CourseFullException,
 *          CourseCompletionRecord, SchoolService, Demo
 *
 * ── Core Requirements (49/50/51 এর মতোই, এইবার এই ১১টাতেই ফোকাস) ──
 *  1. Enum                    — EnrollmentStatus { ENROLLED, COMPLETED, DROPPED }
 *  2. Abstraction/Inheritance — Person (abstract) → Student, Instructor
 *                               (getRole() override করো — Polymorphism দেখানোর জন্য)
 *  3. Encapsulation           — Enrollment (id, studentId, courseId, enrollDate, status) — private field + getter/setter
 *  4. Exception Handling      — EnrollmentNotFoundException, CourseFullException
 *                               (custom checked exception, enrollStudent/completeEnrollment-এ throw করবে)
 *  5. Functional Interface + Lambda — EnrollmentFilter দিয়ে যেকোনো শর্তে enrollment খোঁজা
 *                               (যেমন: service.searchEnrollments(e -> e.getStatus() == EnrollmentStatus.ENROLLED))
 *  6. Generics + Collection   — List<Enrollment>, List<CourseCompletionRecord> দিয়ে ডেটা রাখা
 *  7. Stream API              — searchEnrollments() ও displayAllEnrollments()-এ filter/sorted ব্যবহার করো
 *  8. Comparator              — enrollDate অনুযায়ী sort করো
 *  9. Optional                — findEnrollmentById() কখনো null রিটার্ন করবে না, Optional<Enrollment> দেবে
 * 10. Record                  — CourseCompletionRecord(studentId, courseId, completionDate, grade)
 * 11. Singleton               — SchoolService-এর মাত্র ১টা object সারা Application-এ
 *
 * ── Demo-তে যা করতে হবে ──
 * একজন Instructor আর দুইজন Student বানাও, capacity ১ (মাত্র একজন) এমন একটা Course বানাও,
 * প্রথম student-কে enroll করো, displayAllEnrollments() দিয়ে দেখাও (status ENROLLED)।
 * এরপর দ্বিতীয় student-কে একই course-এ enroll করার চেষ্টা করো — capacity ভর্তি বলে
 * CourseFullException পাবে, handle করে দেখাও। তারপর প্রথম student-এর enrollment
 * completeEnrollment() করে একটা grade দাও, findEnrollmentById() দিয়ে Optional test করো
 * এবং না থাকা enrollment-এর জন্য EnrollmentNotFoundException handle করো। শেষে slot খালি
 * হয়ে যাওয়ায় দ্বিতীয় student-কে আবার enroll করার চেষ্টা করলে এবার সফল হবে।
 *
 * Output (নমুনা):
 * Enrollment: E1, Student: Rahim, Course: C1, Status: ENROLLED
 * Course full: C1
 * Enrollment completed. Grade A added for Rahim.
 * Enrollment not found: E999
 * Enrollment: E2, Student: Karim, Course: C1, Status: ENROLLED
 *
 * ── Build Order (নিচ থেকে উপরে — যেটা অন্যেরা use করবে সেটা আগে) ──
 *
 *  1. EnrollmentStatus (Enum) — কোনো dependency নেই, সবার আগে
 *  2. Person (abstract) → Student, Instructor — Inheritance + Polymorphism
 *  3. Course — plain data holder (id, name, capacity, instructorId)
 *  4. Enrollment — Encapsulation
 *  5. EnrollmentFilter — Functional Interface
 *  6. EnrollmentNotFoundException, CourseFullException — Custom checked exceptions
 *  7. CourseCompletionRecord — Record
 *  8. SchoolService — Singleton + List + Stream + Comparator + Optional + exception throw।
 *     এটা সবার পরে করবা কারণ এটা বাকি সব class use করে
 *  9. Demo — সব একসাথে test/wire up করা
 *
 * কারণ: প্রত্যেক step আগের step-এর উপর depend করে।
 */

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        try {
            // 1. SchoolService.getInstance() দিয়ে instance নাও
            SchoolService service = SchoolService.getInstance();
            // 2. Instructor বানাও, addInstructor() করো
            service.addInstructor(new Instructor("K254", "Kamol", "Math_Bangali_English"));
            // 3. Course বানাও (capacity = 1), addCourse() করো
            service.addCourse(new Course("C1", "math", 1, "K254"));
            // 4. দুইজন Student বানাও, addStudent() করো দুইটাই
            service.addStudent(new Student("S54", "Supriya"));
            service.addStudent(new Student("S53", "Shuvhamay"));
            // 5. enrollStudent() call করো প্রথম student-এর জন্য
            service.enrollStudent("E54", "S54", "C1", LocalDate.now());
            // 6. displayAllEnrollments() call করো
            service.displayAllEnrollments();
            // 7. দ্বিতীয় student-কে একই course-এ enroll করার চেষ্টা করো —
            // service.enrollStudent("E53", "S53", "C1", LocalDate.now());
            // CourseFullException
            // try/catch দিয়ে handle করো
            // 8. completeEnrollment() call করো প্রথম student-এর enrollment-এ, grade দাও
            System.out.println(service.completeEnrollment("E54", "A++"));
            // 9. findEnrollmentById() দিয়ে Optional test করো (থাকা এবং না-থাকা দুইটার
            // জন্যই)
            System.out.println(service.findEnrollmentById("E54"));
            // 10. না থাকা enrollment id দিয়ে completeEnrollment() call করে
            // EnrollmentNotFoundException দেখাও
            System.out.println(service.completeEnrollment("E54", "A++"));
            // 11. slot খালি হওয়ায় দ্বিতীয় student-কে আবার enroll করার চেষ্টা করো — এবার
            // সফল হবে
            service.dropEnrollment("E54");
            service.enrollStudent("E53", "S53", "C1", LocalDate.now());
            // 12. searchEnrollments() দিয়ে lambda ব্যবহার করে সব ENROLLED enrollment বের
            // করো

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
