/*
 * Question 6 (06_Encapsulation) — Employee Salary Protection
 *
 * Employee class — id, name, department, salary সব private।
 *
 * - Constructor দিয়ে id, name, department set হবে
 * - setSalary(int salary) → salary < 0 হলে "Invalid salary!" print করবে, set করবে না
 * - getSalary() → salary return করবে
 * - giveRaise(int percent) → salary বাড়াবে
 * - display()
 *
 * Demo.java-তে emp.salary = 5000; লিখে দেখো compile error আসে — তারপর মুছে দাও। বাইরে থেকে শুধু method দিয়েই data বদলানো যাবে।
 *
 * Output:
 * Invalid salary!
 * ID: 1, Name: Supriya, Department: IT, Salary: 45000
 * After 10% raise: 49500
 */
public class Demo {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Supriya","IT", 10000);
        emp.display();
    }
}
