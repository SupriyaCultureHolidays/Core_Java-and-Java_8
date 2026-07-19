import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SchoolService {

    // ── Singleton Pattern ──
    // private static final SchoolService instance = new SchoolService();
    // private constructor + public static SchoolService getInstance()
    private static final SchoolService instance = new SchoolService();

    private SchoolService() {
        System.out.println("SchoolService Object Created");
    }

    public static SchoolService getInstance() {
        return instance;
    }

    // ── ডেটা রাখার জায়গা (Generics + Collection) ──
    private List<Course> courses = new ArrayList<>();
    private List<Student> students = new ArrayList<>();
    private List<Instructor> instructors = new ArrayList<>();
    private List<Enrollment> enrollments = new ArrayList<>();
    private List<CourseCompletionRecord> completionHistory = new ArrayList<>();

    // ── মূল Method গুলো ──

    // addCourse(Course course) / addStudent(Student student) /
    // addInstructor(Instructor instructor)
    // — নিজ নিজ List-এ add করো
    void addCourse(Course course) {
        courses.add(course);
        System.out.println("Course Added");
    }

    void addStudent(Student student) {
        students.add(student);
        System.out.println("Student Added");
    }

    void addInstructor(Instructor instructor) {
        instructors.add(instructor);
        System.out.println("Instructor Added");

    }

    // enrollStudent(String enrollmentId, String studentId, String courseId,
    // LocalDate date)
    // throws CourseFullException
    // — courseId দিয়ে Course খুঁজে বের করো
    // — enrollments-এর মধ্যে ওই courseId-এর status ENROLLED এমন কতগুলো আছে count
    // করো
    // — সেই count course.capacity-এর সমান বা বেশি হলে CourseFullException throw করো
    // — নাহলে নতুন Enrollment বানিয়ে enrollments list-এ add করো, status ENROLLED
    String enrollStudent(String enrollmentId, String studentId, String courseId, LocalDate date)
            throws CourseFullException {
        Course course = courses.stream().filter(c -> c.id.equals(courseId)).findFirst().orElse(null);
        if (course == null) {
            return "Course id Invalid";
        }
        long totalEnrollment = enrollments.stream().filter(e -> e.getStatus().equals(EnrollmentStatus.ENROLLED))
                .filter(e -> e.getCourseId().equals(courseId)).count();
        if (totalEnrollment >= course.capacity) {
            throw new CourseFullException("This Course already full");
        }
        enrollments.add(new Enrollment(enrollmentId, studentId, courseId, date, EnrollmentStatus.ENROLLED));
        return "Enrolled";
    }

    // completeEnrollment(String enrollmentId, String grade) throws
    // EnrollmentNotFoundException
    // — enrollmentId দিয়ে খুঁজে status COMPLETED করো, completionHistory-তে একটা
    // CourseCompletionRecord add করো
    String completeEnrollment(String enrollmentId, String grade) throws EnrollmentNotFoundException {
        Enrollment enrollment = enrollments.stream().filter(e -> e.getId().equals(enrollmentId)).findFirst()
                .orElseThrow(() -> new EnrollmentNotFoundException("Enrollment Not Found"));
        completionHistory.add(new CourseCompletionRecord(enrollment.getStudentId(), enrollment.getCourseId(),
                LocalDate.now(), grade));
        return "Complete Enrollment of " + enrollmentId;
    }

    // dropEnrollment(String enrollmentId) throws EnrollmentNotFoundException
    // — enrollmentId দিয়ে খুঁজে status DROPPED করো (এতে capacity আবার খালি হয়ে
    // যায়,
    // কারণ capacity check শুধু ENROLLED count ধরে)
    void dropEnrollment(String enrollmentId) throws EnrollmentNotFoundException {
        Enrollment enrollment = enrollments.stream().filter(e -> e.getId().equals(enrollmentId)).findFirst()
                .orElseThrow(() -> new EnrollmentNotFoundException("Enrollment Not Found"));
        enrollment.setStatus(EnrollmentStatus.DROPPED);
        Course course = courses.stream().filter(c -> enrollment.getCourseId().equals(c.id)).findFirst().orElse(null);
        course.capacity -= 1;
        System.out.println("Enrollment Droped" + enrollmentId);
    }

    // searchEnrollments(EnrollmentFilter criteria) — Stream + Lambda দিয়ে filter
    // করো,
    // List<Enrollment> রিটার্ন করবে
    List<Enrollment> searchEnrollments(EnrollmentFilter criteria) {
        return enrollments.stream().filter(e -> criteria.matches(e)).toList();
    }

    // findEnrollmentById(String id) — Optional<Enrollment> রিটার্ন করবে (পাওয়া না
    // গেলে Optional.empty())
    Optional<Enrollment> findEnrollmentById(String id) {
        return enrollments.stream().filter(e -> e.getId().equals(id)).findFirst();
    }

    // displayAllEnrollments() — Comparator ব্যবহার করে enrollDate অনুযায়ী sort করে
    // print করো
    void displayAllEnrollments() {
        enrollments.sort(Comparator.comparing(e -> e.getEnrollDate()));
        System.out.println(enrollments);
    }
}
