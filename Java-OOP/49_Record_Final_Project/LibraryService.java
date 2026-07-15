import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LibraryService {

    // ── Singleton Pattern ──
    // ── Singleton Pattern ──
    // private static final LibraryService instance = new LibraryService();
    // private constructor + public static LibraryService getInstance()

    private static final LibraryService instance = new LibraryService();

    private LibraryService() {
    }

    public static LibraryService getInstance() {
        return instance;
    }

    // ── ডেটা রাখার জায়গা (Generics + Collection) ──
    private List<Book> books = new ArrayList<>();
    private List<IssueRecord> issueHistory = new ArrayList<>();

    // ── মূল Method গুলো ──
    // addBook(Book book)
    void addBook(Book book) {
        books.add(book);
        
    }
    // issueBook(String bookId, String studentId) throws BookNotFoundException,
    // BookAlreadyIssuedException
    // — সফল হলে IssueRecord history-তে add করো, Book-এর status ISSUED করো
    void issueBook(String bookId, String studentId) throws BookNotFoundException, BookAlreadyIssuedException {
        Book book = books.stream().filter(b -> b.getId().equals(bookId)).findFirst().orElse(null);
        if (book == null) {
            throw new BookNotFoundException("Book not found");
        }
        if (book.getStatus().equals(BookStatus.ISSUED)) {
            throw new BookAlreadyIssuedException("Book Already Issued");
        }
        book.setStatus(BookStatus.ISSUED);
        IssueRecord issueRecord = new IssueRecord(book.getId(), studentId, java.time.LocalDate.now());
        issueHistory.add(issueRecord);
        System.out.println("Issued by: " + issueRecord.studentId() + " (Student) on " + issueRecord.issueDate());
    }

    // returnBook(String bookId) throws BookNotFoundException
    // — status আবার AVAILABLE করো
    void returnBook(String bookId) throws BookNotFoundException {
        Book book = books.stream().filter(b -> b.getId().equals(bookId)).findFirst().orElse(null);
        if (book == null) {
            throw new BookNotFoundException("Book Not Found");
        }
        book.setStatus(BookStatus.AVAILABLE);
        System.out.println("Return Book Successfully");
    }

    // searchBooks(Searchable criteria) — Stream + Lambda দিয়ে filter করো,
    // List<Book> রিটার্ন করবে
    List<Book> searchBooks(Searchable criteria) {
        return books.stream().filter(book -> criteria.matches(book)).toList();
    }

    // findBookById(String id) — Optional<Book> রিটার্ন করবে (পাওয়া না গেলে
    // Optional.empty())
    Optional<Book> findBookById(String id) {
        return books.stream().filter(book -> book.getId().equals(id)).findFirst();
    }

    // displayAllBooks() — Comparator ব্যবহার করে title অনুযায়ী sort করে print করো
    void displayAllBooks() {
        books.sort((t1, t2) -> t1.getTitle().compareTo(t2.getTitle()));
        for (Book b : books) {
            System.out.println("Book: " + b.getTitle() + ", Status: " + b.getStatus());
        }
    }

    // ── Bonus: Static Nested Class ──
    // Stats নামে static nested class বানাও — totalBooks ও issuedCount ধরে রাখবে
    // getStats() method দিয়ে এই Stats-এর object রিটার্ন করো
}
