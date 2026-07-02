/*
 * Question 14
 * Animal
 *   ↓
 * Dog
 *
 * Animal: sound() -> generic message দেবে ("Animal makes a sound")
 * Dog: sound() override করবে -> "Dog barks"
 * Dog object দিয়ে sound() কল করলে override করা version-ই চলবে।
 *
 * Output:
 * Dog barks
 */
public class Demo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();

    }
}
