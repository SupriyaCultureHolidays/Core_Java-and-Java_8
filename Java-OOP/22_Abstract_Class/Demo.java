/*
 * Question 22 (22_Abstract_Class) — Abstract Employee
 *
 * Employee abstract class, abstract method calculateSalary() রাখো।
 * Manager আর Developer আলাদাভাবে override করবে।
 *
 * Output:
 * Manager Salary: 60000
 * Developer Salary: 45000
 */
public class Demo {
    public static void main(String[] args) {
        Employee emp = new Developer();
        emp.calculateSalary();

        Employee emp2 = new Manager();
        emp2.calculateSalary();
    }
}
