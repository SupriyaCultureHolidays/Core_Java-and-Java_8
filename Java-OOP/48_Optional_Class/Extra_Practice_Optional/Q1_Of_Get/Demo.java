/*
 * Extra Practice (Optional) Q1 — Optional.of() + get()
 *
 * একটা String value ("Rahim") Optional.of() দিয়ে wrap করো।
 * তারপর get() দিয়ে ভিতরের value বের করে print করো।
 *
 * (মনে রাখবে: Optional.of() null value দিলে NullPointerException দেয়,
 * তাই এটা তখনই ব্যবহার করবে যখন তুমি নিশ্চিত value null না।)
 *
 * Output:
 * Rahim
 */

import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        String name = "Rahim";

        // TODO: Optional.of(name) দিয়ে একটা Optional<String> বানাও
        // TODO: get() দিয়ে value বের করে print করো

        Optional<String> str = Optional.of(name);
        System.out.println(str.get());
    }
}
