import java.time.LocalDate;

public class Appointment {

    // private field: id (String), patientId (String), doctorId (String),
    // date (LocalDate), status (AppointmentStatus)
    // getters/setters লিখো (Encapsulation) — নিচে status-এর example দেখে বাকিগুলো লিখো

    // Bonus: Cloneable implement করো, clone() override করো (Object Cloning)
    // Bonus: Serializable implement করো (appointment list file-এ save/load করার জন্য)
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

    public AppointmentStatus getStatus() {
        return status;
    }

    public void setStatus(AppointmentStatus status) {
        this.status = status;
    }

    // getId/setId, getPatientId/setPatientId, getDoctorId/setDoctorId, getDate/setDate
    // — উপরের getStatus/setStatus-এর মতো pattern follow করে লিখো

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", patientId='" + patientId + '\'' +
                ", doctorId='" + doctorId + '\'' +
                ", date=" + date +
                ", status=" + status +
                '}';
    }

}
