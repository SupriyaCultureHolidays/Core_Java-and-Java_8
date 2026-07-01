public class Employee {
    int id;
    String name;
    String department;
    int salary;

    Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.department = department;
        this.name = name;
        this.salary = salary;
    }
    void displayInfo(){
        System.out.println(
                "ID : " + this.id + "Name : " + this.name + " Deparment : " + this.department + " Salary : " + this.salary);
    
    }
}
