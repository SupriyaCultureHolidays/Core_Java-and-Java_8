/*
 * Question 17
 * Employee
 *   ↓
 * Developer
 *   ↓
 * Tester
 *   ↓
 * Manager
 *
 * Developer, Tester, Manager — প্রতিটা Employee extend করে work() override করবে।
 * Demo-তে Employee[] array বানিয়ে তিনটা object রেখে loop-এ work() কল করো।
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
