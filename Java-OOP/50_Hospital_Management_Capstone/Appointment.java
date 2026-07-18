import java.io.Serializable;
import java.time.LocalDate;

public class Appointment implements Cloneable, Serializable {

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
    // Bonus: Object Cloning
    @Override
    public Appointment clone() {
        try {
            return (Appointment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    // ── Inner Class practice (topic 16) ──
    // non-static inner class — Appointment-এর ভিতরে থাকে বলে বাইরের (outer) instance-এর
    // private field (id, date...) সরাসরি access করতে পারে, getter লাগে না
    // ব্যবহার: Appointment a = new Appointment(...); Appointment.ReminderCard card = a.new ReminderCard(); card.print();
    class ReminderCard {
        void print() {
            System.out.println("Reminder: Appointment " + id + " is on " + date);
        }
    }
}
