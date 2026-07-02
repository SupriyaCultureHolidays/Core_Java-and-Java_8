/*
 * Question 12
 * Person
 *   ↓
 * Employee
 *
 * Person: name, age
 * Employee: salary, department
 * Employee object বানিয়ে parent (name, age) ও child (salary, department)
 * দুই ধরনের field-ই একসাথে display করো।
 *
 * Output:
 * Name: Rahim, Age: 28, Salary: 40000, Department: IT
 */
public class Demo {
    public static void main(String[] args) {
        Person p = new Person("Supriya", 25);
        // p.display();
        Employee emp = new Employee(200, "IT", "Supriya", 27);
        emp.details();
    }
}
