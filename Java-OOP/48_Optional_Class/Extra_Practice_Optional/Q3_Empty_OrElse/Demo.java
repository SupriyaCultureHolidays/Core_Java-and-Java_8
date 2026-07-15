/*
 * Extra Practice (Optional) Q3 — Optional.empty() + orElse()
 *
 * একটা empty Optional বানাও: Optional.empty()
 * তারপর orElse("Guest") ব্যবহার করে default value বের করে print করো।
 *
 * এরপর একটা non-empty Optional বানাও (Optional.of("Rahim"))
 * এবং সেটাতেও orElse("Guest") ব্যবহার করো — দেখো এবার আসল value-ই আসে,
 * default value ইগনোর হয়ে যায়।
 *
 * Output:
 * Guest
 * Rahim
 */

import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        Optional<String> nonEmpty = Optional.of("Rahim");

        // TODO: empty.orElse("Guest") print করো
        System.out.println(empty.orElse("Guest"));
        // TODO: nonEmpty.orElse("Guest") print করো
        System.out.println(nonEmpty.orElse("Guest"));
    }
}
