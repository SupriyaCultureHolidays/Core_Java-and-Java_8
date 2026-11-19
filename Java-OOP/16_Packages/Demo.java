/*
 * Question 16 (16_Packages) — Animal Package
 *
 * Animal, Dog, Cat কে animals package-এ রাখো, Demo বাইরে থেকে import করবে।
 *
 * 16_Packages/
 * ├── Demo.java          (import animals.*;)
 * └── animals/
 *     ├── Animal.java    (package animals;)
 *     ├── Dog.java       (package animals;)
 *     └── Cat.java       (package animals;)
 *
 * - package-এর বাইরে থেকে use করতে class ও method public হতে হবে — public না দিলে কী error আসে দেখো
 * - Demo.java-তে Animal a = new Dog(); ও Animal b = new Cat(); দিয়ে sound() call করো
 * - Compile/run (16_Packages ফোল্ডার থেকে): javac animals/*.java Demo.java → java Demo
 *
 * Output:
 * Dog barks
 * Cat meows
 */
public class Demo {
    public static void main(String[] args) {
        Animal a = new Cat();
        Animal b = new Dog();
        a.sound();
        b.sound();
    }
}
