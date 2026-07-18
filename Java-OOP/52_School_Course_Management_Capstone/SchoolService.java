public class SchoolService {

    // ── Singleton Pattern ──
    // private static final SchoolService instance = new SchoolService();
    // private constructor + public static SchoolService getInstance()

    // ── ডেটা রাখার জায়গা (Generics + Collection) ──
    // private List<Course> courses = new ArrayList<>();
    // private List<Student> students = new ArrayList<>();
    // private List<Instructor> instructors = new ArrayList<>();
    // private List<Enrollment> enrollments = new ArrayList<>();
    // private List<CourseCompletionRecord> completionHistory = new ArrayList<>();

    // ── মূল Method গুলো ──

    // addCourse(Course course) / addStudent(Student student) / addInstructor(Instructor instructor)
    // — নিজ নিজ List-এ add করো

    // enrollStudent(String enrollmentId, String studentId, String courseId, LocalDate date)
    //     throws CourseFullException
    // — courseId দিয়ে Course খুঁজে বের করো
    // — enrollments-এর মধ্যে ওই courseId-এর status ENROLLED এমন কতগুলো আছে count করো
    // — সেই count course.capacity-এর সমান বা বেশি হলে CourseFullException throw করো
    // — নাহলে নতুন Enrollment বানিয়ে enrollments list-এ add করো, status ENROLLED

    // completeEnrollment(String enrollmentId, String grade) throws EnrollmentNotFoundException
    // — enrollmentId দিয়ে খুঁজে status COMPLETED করো, completionHistory-তে একটা
    //   CourseCompletionRecord add করো

    // dropEnrollment(String enrollmentId) throws EnrollmentNotFoundException
    // — enrollmentId দিয়ে খুঁজে status DROPPED করো (এতে capacity আবার খালি হয়ে যায়,
    //   কারণ capacity check শুধু ENROLLED count ধরে)

    // searchEnrollments(EnrollmentFilter criteria) — Stream + Lambda দিয়ে filter করো,
    //   List<Enrollment> রিটার্ন করবে

    // findEnrollmentById(String id) — Optional<Enrollment> রিটার্ন করবে (পাওয়া না গেলে Optional.empty())

    // displayAllEnrollments() — Comparator ব্যবহার করে enrollDate অনুযায়ী sort করে print করো
}
