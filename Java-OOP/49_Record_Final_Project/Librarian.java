public class Librarian extends LibraryPerson {

    // constructor লিখো, super(id, name) call করো
    // চাইলে employeeId (String) field যোগ করো

    // getRole() override করো — return "Librarian"

    String employeeId;
    Librarian(String id, String name, String employeeId){
        super(id, name);
        this.employeeId = employeeId;
    }

    @Override
    public String getRole(){
        return "Librarian";
    }
}
