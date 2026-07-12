import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LibraryService {

    // ── Singleton Pattern ──
    // ── Singleton Pattern ──
    // private static final LibraryService instance = new LibraryService();
    // private constructor + public static LibraryService getInstance()

    private static final LibraryService instance = new LibraryService();

    private LibraryService() {}

    public static LibraryService getInstance() {
        return instance;
    }

    // ── ডেটা রাখার জায়গা (Generics + Collection) ──
    private List<Book> books = new ArrayList<>();
    private List<IssueRecord> issueHistory = new ArrayList<>();

    // ── মূল Method গুলো ──
    // addBook(Book book)
    void addBook(Book book){
        books.add(book);
    }
    // issueBook(String bookId, String studentId) throws BookNotFoundException, BookAlreadyIssuedException
    //     — সফল হলে IssueRecord history-তে add করো, Book-এর status ISSUED করো
    void issueBook(String bookId, String studentId) throws BookNotFoundException, BookAlreadyIssuedException {
        // String isBook = books.stream().filter(m-> m.getId().equals(bookId)).toList();
        Optional<Book> isBook = books.stream().filter(m -> m.getId().equals(bookId)).findFirst();
    }
    // returnBook(String bookId) throws BookNotFoundException
    //     — status আবার AVAILABLE করো
    // searchBooks(Searchable criteria) — Stream + Lambda দিয়ে filter করো, List<Book> রিটার্ন করবে
    // findBookById(String id) — Optional<Book> রিটার্ন করবে (পাওয়া না গেলে Optional.empty())
    // displayAllBooks() — Comparator ব্যবহার করে title অনুযায়ী sort করে print করো

    // ── Bonus: Static Nested Class ──
    // Stats নামে static nested class বানাও — totalBooks ও issuedCount ধরে রাখবে
    // getStats() method দিয়ে এই Stats-এর object রিটার্ন করো
}
