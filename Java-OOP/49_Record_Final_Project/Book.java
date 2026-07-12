public class Book {

    // private field: id (String), title (String), author (String), status
    // (BookStatus)
    // constructor + getters/setters লিখো (Encapsulation)
    // toString() override করো — display-এ কাজে লাগবে

    // Bonus: Cloneable implement করো, clone() override করো (Object Cloning)
    // Bonus: Serializable implement করো (book list file-এ save/load করার জন্য)
    private String id;
    private String title;
    private String author;
    private BookStatus status;

    Book(String id, String title, String author, BookStatus status) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.status = status;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", status=" + status +
                '}';
    }

}
