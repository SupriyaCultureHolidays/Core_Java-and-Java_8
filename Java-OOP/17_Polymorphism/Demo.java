/*
 * Question 17 (17_Polymorphism) — Employee Hierarchy
 *
 *             Employee
 *           /    |     \
 * Developer   Tester   Manager
 *
 * Developer, Tester, Manager — প্রতিটা Employee extend করে work() override করবে (runtime polymorphism)।
 * Demo.java-তে Employee[] array বানিয়ে তিনটা object রেখে loop-এ work() কল করো।
 *
 * Bonus: Employee-তে work(int hours) overload করো — compile-time vs runtime polymorphism-এর পার্থক্য comment-এ লেখো।
 *
 * Output:
 * Developer is writing code
 * Tester is testing application
 * Manager is managing team
 */
public class Demo {
    public static void main(String[] args) {
        Employee a = new Developer();
        a.work();
        Employee b = new Manager();
        b.work();
        Employee c = new Tester();
        c.work();

    }
}
