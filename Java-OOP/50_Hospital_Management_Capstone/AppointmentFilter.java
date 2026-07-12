// Functional Interface — Lambda দিয়ে যেকোনো শর্তে appointment খোঁজার জন্য
// ব্যবহার (HospitalService-এ তোমাকে লিখতে হবে): service.searchAppointments(a -> a.getStatus() == AppointmentStatus.BOOKED)
@FunctionalInterface
public interface AppointmentFilter {
    boolean matches(Appointment appointment);
}
