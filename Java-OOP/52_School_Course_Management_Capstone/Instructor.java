public class Instructor extends Person {

    // extra field: department (String), যেমন "Computer Science"
    // constructor লিখো, super(id, name) call করো, department সেট করো
    String department;
    Instructor(String id, String name, String department){
        super(id, name);
        this.department = department;
    }
    // getRole() override করো — return "Instructor"
    @Override
    String getRole(){
        return "Instructor";
    }
}
