/*
 * Question 28 (28_Functional_Interface) — Calculator
 *
 * @FunctionalInterface annotation সহ Calculator interface বানাও, একটা
 * single abstract method operate(int a, int b) রাখো। Demo-তে lambda
 * দিয়ে implement করে result print করো।
 *
 * Output:
 * Result: 15
 */
public class Demo {
    public static void main(String[] args) {
        Calculator c = new Lambda();
        System.out.println(c.operate(5,3));
        System.out.println(c.a);
        c.display();
    }
}
