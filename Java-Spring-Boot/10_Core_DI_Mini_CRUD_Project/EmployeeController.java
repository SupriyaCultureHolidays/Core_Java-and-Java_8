// @Component annotation বসাও — @Controller না, কারণ @Controller আসলে Spring MVC-র জন্য
// (view resolver, thymeleaf ইত্যাদির সাথে কাজ করে, sec 12 দেখো), আর এটা এখনো real MVC/REST
// অ্যাপ না (sec 17-এ কোর্সের নিজের Mini Project-এও এই কারণেই UserController @Component)।
// এটা এখন console থেকেই call হবে, শুধু Controller-Service-Repository layered architecture
// (sec 13)-এর habit বানানোর জন্য — Module 2-এ REST শেখার পর এটাই @RestController হবে
//
// Constructor Injection — EmployeeService নিয়ে field-এ রাখবা
public class EmployeeController {

    // private final EmployeeService employeeService;

    // constructor

    // addEmployee(String name, String department, double salary) — service call করে
    // "Added employee: name (department)" print করবে

    // listEmployees() — service.getAllEmployees() লুপ করে প্রতিটা print করবে

    // removeEmployee(int id) — service call করে "Removed employee: id" print করবে
    //     (EmployeeNotFoundException এখানে try-catch করে "Employee not found: id" print করবা)
}
