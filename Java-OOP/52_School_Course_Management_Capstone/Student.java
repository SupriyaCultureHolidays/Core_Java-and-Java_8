public class Student extends Person {

    // constructor লিখো, super(id, name) call করো
    Student(String id, String name) {
        super(id, name);
    }

    // getRole() override করো — return "Student"
    @Override
    String getRole() {
        return "Student";
    }
}
