// Abstraction + Inheritance — Student ও Instructor দুজনেই একজন Person
public abstract class Person {

    // protected id (String), name (String) রাখো — child class-গুলো সরাসরি access
    // করতে পারবে
    // constructor লিখো
    protected String id;
    protected String name;

    Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract String getRole();
    // — Student এতে "Student" রিটার্ন করবে, Instructor "Instructor" — Polymorphism
    // দেখানোর জন্য
}
