/*
 * Extra Practice (Stream) Q7 — findFirst() + Optional
 *
 * List<Employee> থেকে salary 40000-এর বেশি এমন প্রথম employee খুঁজে বের করো।
 * পাওয়া গেলে নাম print করো, না পেলে "Not found" print করো।
 *
 * Output:
 * Sumi
 */

import java.util.List;
import java.util.Optional;

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
                new Employee("Rahim", 30000),
                new Employee("Karim", 35000),
                new Employee("Sumi", 50000)
        );

        // TODO: filter() দিয়ে salary > 40000 বের করো
        // TODO: findFirst() ব্যবহার করো (এটা Optional<Employee> রিটার্ন করবে)
        // TODO: Optional থেকে নাম বের করে print করো (না পেলে "Not found")
        Optional<Employee> emp = employees.stream().filter(e-> e.salary>40000).findFirst();
        System.out.println(emp);
        if(emp.isPresent()){
            System.out.println(emp.get().name);
        }else{
            System.out.println("not found");
        }
    }
}
