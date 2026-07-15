/*
 * Extra Practice (Stream) Q4 — sorted() with Comparator
 *
 * List<Employee> থেকে salary অনুযায়ী descending order-এ sort করে
 * প্রতিটা employee-এর নাম print করো।
 *
 * Employee: name, salary
 *
 * Output:
 * Sumi
 * Rahim
 * Karim
 */

import java.util.Comparator;
import java.util.List;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class Demo {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Rahim", 40000),
                new Employee("Karim", 35000),
                new Employee("Sumi", 50000));

        // TODO: sorted() + Comparator.comparingDouble() দিয়ে salary অনুযায়ী
        // descending sort করো
        employees.stream().sorted(Comparator.comparingDouble((Employee e) -> e.salary).reversed())
                .forEach(emp -> System.out.println(emp.name));
        // TODO: forEach() দিয়ে নাম print করো
    }
}
