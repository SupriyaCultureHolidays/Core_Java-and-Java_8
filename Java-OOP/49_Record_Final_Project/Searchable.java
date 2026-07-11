// Functional Interface — Lambda দিয়ে যেকোনো শর্তে বই খোঁজার জন্য
// ব্যবহার (LibraryService-এ তোমাকে লিখতে হবে): service.searchBooks(book -> book.getAuthor().equals("Rahul"))
@FunctionalInterface
public interface Searchable {
    boolean matches(Book book);
}
