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

    }
}
