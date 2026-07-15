/*
 * Extra Practice (Optional) Q7 — ifPresentOrElse()
 *
 * ifPresentOrElse() দুইটা কাজ একসাথে করে:
 * - value থাকলে একটা কাজ করবে
 * - না থাকলে আরেকটা কাজ করবে
 *
 * একটা non-empty Optional<String> ("Sumi") আর একটা empty Optional নাও।
 * দুটোর উপর ifPresentOrElse() ব্যবহার করো:
 * - present হলে: "User: " + name print করবে
 * - না থাকলে: "No user found" print করবে
 *
 * Output:
 * User: Sumi
 * No user found
 */

import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Sumi");
        Optional<String> emptyName = Optional.empty();

        // TODO: name.ifPresentOrElse(...) ব্যবহার করো
        name.ifPresentOrElse((value) -> System.out.println(value), () -> System.out.println("No user found"));
        // TODO: emptyName.ifPresentOrElse(...) ব্যবহার করো
        emptyName.ifPresentOrElse((value) -> System.out.println(value), () -> System.out.println("No user found"));

    }
}
