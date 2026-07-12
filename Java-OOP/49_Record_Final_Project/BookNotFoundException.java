// Custom Checked Exception — bookId দিয়ে বই না পেলে এটা throw করবে
public class BookNotFoundException extends Exception {

    // constructor-এ message নাও, super(message) call করো
    public BookNotFoundException(String message){
        super(message);
    }
}
