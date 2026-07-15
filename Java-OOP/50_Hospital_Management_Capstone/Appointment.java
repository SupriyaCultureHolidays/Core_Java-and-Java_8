import java.time.LocalDate;

public class Appointment {

    // private field: id (String), patientId (String), doctorId (String),
    // date (LocalDate), status (AppointmentStatus)
    // constructor + getters/setters লিখো (Encapsulation)
    // toString() override করো — display-এ কাজে লাগবে
    private String id;
    private String patientId;
    private String doctorId;
    private LocalDate date;
    private AppointmentStatus status;

    Appointment(String id, String patientId, String doctorId, LocalDate date, AppointmentStatus status) {
        this.id = id;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.date = date;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public AppointmentStatus getStatus() {
        return status;
    }

    public void setStatus(AppointmentStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id='" + id + '\'' +
                ", patientId='" + patientId + '\'' +
                ", doctorId='" + doctorId + '\'' +
                ", date=" + date +
                ", status=" + status +
                '}';
    }
    // Bonus: Cloneable implement করো, clone() override করো (Object Cloning)
    // Bonus: Serializable implement করো (appointment list file-এ save/load করার
    // জন্য)

    // ── Inner Class practice (topic 23) ──
    // non-static inner class বানাও, যেমন ReminderCard — এটা Appointment-এর ভিতরে
    // থাকবে বলে
    // বাইরের (outer) instance-এর private field (id, date...) সরাসরি access করতে
    // পারবে, getter লাগবে না
    // class ReminderCard {
    // void print() { System.out.println("Reminder: Appointment " + id + " is on " +
    // date); }
    // }
    // ব্যবহার: Appointment a = new Appointment(...); Appointment.ReminderCard card
    // = a.new ReminderCard(); card.print();
}
