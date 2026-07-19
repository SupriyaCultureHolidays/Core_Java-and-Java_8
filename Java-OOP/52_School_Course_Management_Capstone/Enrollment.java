import java.time.LocalDate;

// Encapsulation — একজন student কোন course-এ কবে enroll হলো তার রেকর্ড
public class Enrollment {

    // private field: id (String), studentId (String), courseId (String),
    // enrollDate (LocalDate), status (EnrollmentStatus)
    // constructor + getters/setters লিখো (Encapsulation)
    // toString() override করো — display-এ কাজে লাগবে
    private String id;
    private String studentId;
    private String courseId;
    private LocalDate enrollDate;
    private EnrollmentStatus status;

    Enrollment(String id, String studentId, String courseId, LocalDate enrollDate, EnrollmentStatus status) {
        this.id = id;
        this.studentId = studentId;
        this.courseId = courseId;
        this.enrollDate = enrollDate;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public LocalDate getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(LocalDate enrollDate) {
        this.enrollDate = enrollDate;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStatus(EnrollmentStatus status) {
        this.status = status;
    }

    public EnrollmentStatus getStatus() {
        return status;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "id='" + id + '\'' +
                ", studentId='" + studentId + '\'' +
                ", courseId='" + courseId + '\'' +
                ", enrollDate=" + enrollDate +
                ", status=" + status +
                '}';
    }
}
