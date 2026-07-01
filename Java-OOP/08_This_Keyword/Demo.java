/*
 * Question 8
 * Student class
 * সব variable private। Getter Setter ব্যবহার করবে।
 * Demo.java থেকে setter দিয়ে ভ্যালু বসাবে, getter দিয়ে পড়ে print করবে
 * (সরাসরি field access করা যাবে না)।
 *
 * Output:
 * Name: Rahim, Age: 20
 */
public class Demo {
    public static void main(String[] args) {
        Student std = new Student();
        std.setName("Supriya");
        std.getName();
    }
}
