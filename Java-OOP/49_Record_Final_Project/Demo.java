/*
 * Final Project — Library Management System (সব OOP + Java 8 Topic এক জায়গায়)
 *
 * Classes: BookStatus, LibraryPerson, Student, Librarian, Book, Searchable,
 *          BookNotFoundException, BookAlreadyIssuedException, IssueRecord,
 *          LibraryService, Demo
 *
 * ── Core Requirements ──
 *  1. Enum                    — BookStatus { AVAILABLE, ISSUED }
 *  2. Abstraction/Inheritance — LibraryPerson (abstract) → Student, Librarian
 *                               (getRole() override করো — Polymorphism দেখানোর জন্য)
 *  3. Encapsulation           — Book (id, title, author, status) — private field + getter/setter
 *  4. Exception Handling      — BookNotFoundException, BookAlreadyIssuedException
 *                               (custom checked exception, issueBook/returnBook-এ throw করবে)
 *  5. Functional Interface + Lambda — Searchable দিয়ে যেকোনো শর্তে বই খোঁজা
 *                               (যেমন: service.searchBooks(b -> b.getAuthor().equals("Rahul")))
 *  6. Generics + Collection   — List<Book>, List<IssueRecord> দিয়ে ডেটা রাখা
 *  7. Stream API              — searchBooks() ও displayAllBooks()-এ filter/sorted ব্যবহার করো
 *  8. Comparator              — title অনুযায়ী বই sort করো
 *  9. Optional                — findBookById() কখনো null রিটার্ন করবে না, Optional<Book> দেবে
 * 10. Record                  — IssueRecord(bookId, studentId, issueDate) — কে ইস্যু করলো তার log
 * 11. Singleton               — LibraryService-এর মাত্র ১টা object সারা Application-এ
 *
 * ── Bonus (ঐচ্ছিক, চাইলে যোগ করো) ──
 * - Object Cloning — Book.clone() দিয়ে একটা বই duplicate করা
 * - Serialization  — Book Serializable বানিয়ে book list file-এ save/load করা
 * - Nested Class   — LibraryService.Stats (static nested) দিয়ে totalBooks/issuedCount
 * - Threads        — দুটো Thread একসাথে একই বই issue করার চেষ্টা করলে synchronized
 *                    দিয়ে race condition আটকানো
 *
 * ── Demo-তে যা করতে হবে ──
 * কয়েকটা Book add করো, একজন Student-কে একটা বই issue করো, সব বই list করো
 * (issued বইটার status "ISSUED" আর বাকিগুলো "AVAILABLE" দেখাবে), তারপর
 * findBookById() দিয়ে Optional test করো এবং না থাকা বইয়ের জন্য
 * BookNotFoundException handle করে দেখাও।
 *
 * Output (নমুনা):
 * Book: Java Basics, Status: ISSUED
 * Book: Spring Boot Guide, Status: AVAILABLE
 * Issued by: Rahim (Student) on 2026-07-11
 * Book not found: B999
 */
public class Demo {
    public static void main(String[] args) {
        // Book b1 = new Book("1", "You Can Do it", "Supriya", BookStatus.AVAILABLE);
        // System.out.println(b1.getStatus());
        // b1.setStatus(BookStatus.ISSUED);
        // System.out.println(b1);
        LibraryService service = LibraryService.getInstance();
        service.addBook(new Book("1", "Java Basics", "Rahul", BookStatus.AVAILABLE));
        service.addBook(new Book("2", "Spring Boot Guide", "Karim", BookStatus.AVAILABLE));
        service.displayAllBooks();
        System.out.println(service.findBookById("2").get());
    }
}

/*
 * ── Build Order (নিচ থেকে উপরে — যেটা অন্যেরা use করবে সেটা আগে) ──
 *
 * 1. BookStatus (Enum) — kono dependency nei, sobar age
 * 2. LibraryPerson (abstract) → Student, Librarian — Inheritance + Polymorphism
 * (getRole() override). Eta age korle Student.java ta easily fill korte parba
 * 3. Book (already done) — Encapsulation
 * 4. Searchable — Functional Interface (lambda diye search korar contract)
 * 5. BookNotFoundException, BookAlreadyIssuedException — Custom checked
 * exceptions
 * 6. IssueRecord — Record (Java 16+ feature, plain data holder)
 * 7. LibraryService — sabcheye complex part: Singleton +
 * List<Book>/List<IssueRecord>
 * + Stream API + Comparator + Optional + exception throw. Eta sobar por korba
 * karon eta baki shob class use kore
 * 8. Demo — sob ekshathe test/wire up kora
 *
 * Karon: prottek step ager step-er upor depend kore. Age dependency na banaile
 * pore circular confusion hoy.
 *
 * ── Spring-readiness এর জন্য কোন topic গুলো বেশি practice করবা ──
 *
 * Java Spring shekhar shomoy eituku OOP concept bar bar dekha jabe, tai eguloke
 * extra shokto koro:
 *
 * - Abstraction + Interface — Spring pura interface-driven (Dependency
 * Injection
 * interface-er upor based)
 * - Polymorphism + Dynamic Dispatch — Spring-er AOP/Proxy eituku bujhle magic
 * mone hobe na
 * - Annotation (custom) — @Component, @Autowired er moto Spring annotation
 * bujhte topic 28 khub kaje lagbe
 * - Functional Interface + Lambda + Stream — Spring config o data processing-e
 * onek jaigay dekha jay
 * - Custom Exception Handling — Spring-er @ControllerAdvice diye global
 * exception handle kora ekdom ei pattern-erei extension
 * - Singleton — Spring bean by default singleton scope-e thake, LibraryService
 * ta banaile eita concept-e crystal clear hoye jabe
 * - Optional — Spring Data JPA-r findById() shob Optional<T> return kore,
 * eituku ekhoni practice kore rakhle pore shohoj lagbe
 *
 * Ekta gap lokkho korlam: tomar 49 topic-er modhye standalone Generics
 * (<T>, bounded types, ? extends) er kono separate topic nei — kintu final
 * project-e "Generics + Collection" requirement hishebe ache. Spring-e
 * Repository<T, ID>, ResponseEntity<T> shob jaigay Generics use hoy, tai eta
 * ekta chhoto extra practice folder banaiya age thekei shokto kore nile bhalo
 * hobe.
 */
