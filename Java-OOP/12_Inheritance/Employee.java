public class Employee extends Person {
    int salary;
    String department;

    Employee(int salary, String department, String name, int age){
        super(name, age);
        this.salary=salary;
        this.department = department;
    }

    // void details(){
    //     super.display();
    //     System.out.println("salary " + this.salary +  " department " + this.department);
    // }

    void details() {
    System.out.println("Name: " + name +
                       ", Age: " + age +
                       ", Salary: " + salary +
                       ", Department: " + department);
}
}
