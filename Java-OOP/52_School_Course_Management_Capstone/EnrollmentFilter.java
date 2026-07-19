// Functional Interface — Lambda দিয়ে যেকোনো শর্তে enrollment খোঁজার জন্য
// ব্যবহার (SchoolService-এ তোমাকে লিখতে হবে): service.searchEnrollments(e -> e.getStatus() == EnrollmentStatus.ENROLLED)
@FunctionalInterface
public interface EnrollmentFilter {
    // @FunctionalInterface annotation বসাও (এই interface-এর ঠিক উপরে)
    // boolean matches(Enrollment enrollment); — এই একটা abstract method লিখো
    boolean matches(Enrollment enrollment);
}
