/*
 * Question 45 (45_Stream_Map_Filter_Reduce_Sorted) — Employee Stream Pipeline
 *
 * List<Employee> থেকে stream() ব্যবহার করে filter (salary > 40000),
 * map (নাম বের করো), sorted, আর reduce (মোট salary যোগ) করো।
 *
 * Output:
 * Filtered Names: [Rahim, Sumi]
 * Total Salary: 90000
 */

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Supriya", 3000));
        emp.add(new Employee("Gobinda", 2500));
        emp.add(new Employee("Purnima", 2000));
        System.out.println(emp);
        emp.stream().forEach((m) -> {
            System.out.println(m.salary+m.name);
        });
    }
}