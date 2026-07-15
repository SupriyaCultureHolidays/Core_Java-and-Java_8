/*
 * Extra Practice (Stream) Q9 — Collectors.groupingBy()
 *
 * List<Employee> থেকে department অনুযায়ী group করো (Map<String, List<Employee>>)।
 * প্রতিটা department-এর employee-দের নাম print করো।
 *
 * Employee: name, department
 *
 * Output:
 * IT -> [Rahim, Sumi]
 * HR -> [Karim]
 */

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
}

public class Demo {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Rahim", "IT"),
                new Employee("Karim", "HR"),
                new Employee("Sumi", "IT")
        );

        // TODO: Collectors.groupingBy() দিয়ে department অনুযায়ী group করো
        // TODO: Map iterate করে department আর নামগুলো print করো
        Map<String, List<Employee>> empGrMap = employees.stream().collect(Collectors.groupingBy(emp-> emp.department));
        System.out.println(empGrMap);

        empGrMap.forEach((department, employList)->{
            List<String> emp = employList.stream().map(e->e.name).toList();
            System.out.println(department+ " -> " + emp);
        });
    }
}
