// Abstraction + Inheritance — Patient ও Doctor দুজনেই একজন Person
public abstract class Person {

    protected String id;
    protected String name;

    Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // abstract String getRole();
    // Patient এতে "Patient" রিটার্ন করবে, Doctor "Doctor" — Polymorphism দেখানোর জন্য
    public abstract String getRole();
}
