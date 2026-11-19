/*
 * Question 14 (14_Multiple_Inheritance_Interface) — Dog (Animal + Pet + Guard)
 *
 * Animal (class)   Pet (interface)   Guard (interface)
 *        \               |               /
 *                       Dog
 *
 * Java-তে class দিয়ে multiple inheritance হয় না (class Dog extends Animal, Pet ❌), কিন্তু interface দিয়ে হয়।
 *
 * - Animal: sound()
 * - Pet (interface): play()
 * - Guard (interface): guard()
 * - class Dog extends Animal implements Pet, Guard → সব method override/implement করবে
 *
 * Bonus (Diamond problem): Pet ও Guard দুইটাতেই default void info() রাখো — Dog-এ compile error দেখো, তারপর Dog-এ info() override করে Pet.super.info() দিয়ে solve করো।
 *
 * Output:
 * Dog barks
 * Dog is playing fetch
 * Dog is guarding the house
 */
public class Demo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
