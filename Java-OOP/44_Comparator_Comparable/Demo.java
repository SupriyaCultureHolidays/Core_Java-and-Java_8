/*
 * Question 43 (43_Comparator_Comparable) — Sort Employees
 *
 * Employee class Comparable<Employee> implement করবে (salary অনুযায়ী
 * natural order)। আলাদা EmployeeComparator class Comparator<Employee>
 * implement করবে (name অনুযায়ী sort)। দুইটা দিয়ে দুইভাবে sort করে দেখাও।
 *
 * Output:
 * Sorted by salary: [Karim(35000), Rahim(40000)]
 * Sorted by name: [Karim, Rahim]
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<Employee> emp = new ArrayList<>();

        emp.add(new Employee("Supriya", 25000));
        emp.add(new Employee("Anima", 30000));

        Collections.sort(emp);
        System.out.println(emp);

        // EmployeeComparator
        Collections.sort(emp, new EmployeeComparator());
        System.out.println("After Comparator " + emp);
    }
}
