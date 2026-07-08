/*
 * Question 29 (29_Lambda_Expression) — Greet and Sum
 *
 * Greetable interface-এ greet(String name) method রাখো, lambda দিয়ে
 * implement করো। আরেকটা lambda বানাও যেটা return value soho দুইটা
 * সংখ্যার sum হিসাব করে দেয়।
 *
 * Output:
 * Hello, Rahim!
 * Sum: 30
 */
public class Demo {
    public static void main(String[] args) {
        Greetable g = (name)->{
            return "Hello, "+name+"!";
        };
        System.out.println(g.greet("Rahim"));

        Calculator c = (int a, int b)->{
            System.out.println(a+b);
        };
        c.sum(5, 10);
    }
}
