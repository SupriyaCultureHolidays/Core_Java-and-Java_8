import java.util.ArrayList;
import java.util.List;

public class Student extends LibraryPerson {

    // LibraryPerson-এর id, name ছাড়াও চাইলে borrowedBookIds (List<String>) রাখতে
    // পারো
    // constructor লিখো, super(id, name) call করো

    // getRole() override করো — return "Student"
    List<String> borrowedBookIds = new ArrayList<>();

    Student(String id, String name) {
        super(id, name);
        borrowedBookIds.add(id);
    }
    public List<String> getBorrowedBookIds() {
        return borrowedBookIds;
    }
    

    @Override
    public String getRole() {
        return "Student";
    }
}
