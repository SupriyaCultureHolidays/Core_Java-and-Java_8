public class Employee {
    int id;
    String name;
    String department;
    private int salary;

    Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println(
                "ID:" + this.id + "Name:" + this.name + "Department: " + this.department + "Salary: " + this.salary);
    }
}
