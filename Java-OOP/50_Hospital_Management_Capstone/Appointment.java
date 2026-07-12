public class Appointment {

    // private field: id (String), patientId (String), doctorId (String),
    // date (LocalDate), status (AppointmentStatus)
    // constructor + getters/setters লিখো (Encapsulation)
    // toString() override করো — display-এ কাজে লাগবে

    // Bonus: Cloneable implement করো, clone() override করো (Object Cloning)
    // Bonus: Serializable implement করো (appointment list file-এ save/load করার জন্য)

    // ── Inner Class practice (topic 23) ──
    // non-static inner class বানাও, যেমন ReminderCard — এটা Appointment-এর ভিতরে থাকবে বলে
    // বাইরের (outer) instance-এর private field (id, date...) সরাসরি access করতে পারবে, getter লাগবে না
    // class ReminderCard {
    //     void print() { System.out.println("Reminder: Appointment " + id + " is on " + date); }
    // }
    // ব্যবহার: Appointment a = new Appointment(...); Appointment.ReminderCard card = a.new ReminderCard(); card.print();
}
