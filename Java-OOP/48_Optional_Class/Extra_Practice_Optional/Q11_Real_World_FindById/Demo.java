/*
 * Extra Practice (Optional) Q11 — Real-world combo (Spring Boot এর মতো findById)
 *
 * এটা ঠিক Spring Boot-এর JpaRepository.findById() যেভাবে কাজ করে সেরকম একটা
 * ছোট practice — সব কিছু একসাথে ব্যবহার করবে।
 *
 * List<Employee> থেকে EmployeeService.findById(int id) বানাও, যেটা
 * Optional<Employee> return করবে (stream().filter().findFirst() ব্যবহার করে)।
 *
 * Demo.java-তে:
 * ১) id=2 দিয়ে খুঁজে পেলে map() দিয়ে শুধু নাম বের করে orElse("Unknown") দিয়ে print করো
 * ২) id=99 দিয়ে খুঁজে, ifPresentOrElse() দিয়ে পেলে নাম print, না পেলে
 *    "Employee not found" print করো
 *
 * Output:
 * Karim
 * Employee not found
 */

import java.util.List;
import java.util.Optional;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class EmployeeService {
    List<Employee> employees = List.of(
            new Employee(1, "Rahim"),
            new Employee(2, "Karim"),
            new Employee(3, "Sumi")
    );

    Optional<Employee> findById(int id) {
        // TODO: employees.stream().filter(e -> e.id == id).findFirst() return করো
        return null;
    }
}

public class Demo {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();

        // TODO: service.findById(2).map(e -> e.name).orElse("Unknown") print করো
        // TODO: service.findById(99).ifPresentOrElse(...) ব্যবহার করো
    }
}
