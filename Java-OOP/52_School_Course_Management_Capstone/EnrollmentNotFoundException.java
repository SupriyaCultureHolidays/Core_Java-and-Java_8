// Custom Checked Exception — enrollmentId দিয়ে enrollment না পেলে এটা throw করবে
public class EnrollmentNotFoundException extends Exception {

    // constructor-এ message নাও, super(message) call করো
    EnrollmentNotFoundException(String message){
        super(message);
    }
}
