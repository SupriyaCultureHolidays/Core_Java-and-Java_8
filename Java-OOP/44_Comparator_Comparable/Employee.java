public class Employee implements Comparable<Employee> {
    // write code
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        return (this.salary - other.salary);
    }

    @Override
    public String toString() {
        return name + "(" + salary + ")";

    }
}
