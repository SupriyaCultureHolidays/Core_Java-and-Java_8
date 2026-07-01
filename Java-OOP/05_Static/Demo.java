/*
 * Question 5
 * Student class
 * Methods: study(), sleep(), eat() -> প্রতিটা আলাদা একটা করে message print করবে
 * display() -> student-এর নাম সহ সবগুলো activity call করে সামারি দেখাবে
 *
 * Output:
 * Rahim is studying
 * Rahim is sleeping
 * Rahim is eating
 */
public class Demo {
    public static void main(String[] args) {
        Student std = new Student();
        std.study();
        std.sleep();
        std.eat();
    }
}
