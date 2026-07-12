// Functional Interface — Lambda দিয়ে যেকোনো শর্তে appointment খোঁজার জন্য
// ব্যবহার (HospitalService-এ তোমাকে লিখতে হবে): service.searchAppointments(a -> a.getStatus() == AppointmentStatus.BOOKED)
public interface AppointmentFilter {
    // @FunctionalInterface annotation বসাও (এই interface-এর ঠিক উপরে)
    // boolean matches(Appointment appointment); — এই একটা abstract method লিখো
}
