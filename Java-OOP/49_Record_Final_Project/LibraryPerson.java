// Abstraction + Inheritance — Student ও Librarian দুজনেই একজন LibraryPerson
public abstract class LibraryPerson {

    // protected id (String), name (String) রাখো — child class-গুলো সরাসরি access করতে পারবে
    // constructor লিখো
    protected String id;
    protected String name;
    LibraryPerson(String id, String name){
        this.id = id;
        this.name = name;
    }

    // abstract String getRole();
    // Student এতে "Student" রিটার্ন করবে, Librarian "Librarian" — Polymorphism দেখানোর জন্য
    public abstract String getRole();
}
