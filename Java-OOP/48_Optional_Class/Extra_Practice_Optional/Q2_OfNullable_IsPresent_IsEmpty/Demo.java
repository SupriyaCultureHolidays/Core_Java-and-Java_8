/*
 * Extra Practice (Optional) Q2 — Optional.ofNullable() + isPresent() / isEmpty()
 *
 * দুইটা variable নাও:
 * String name1 = "Karim";
 * String name2 = null;
 *
 * দুটোকেই Optional.ofNullable() দিয়ে wrap করো (এটা null হলেও crash করবে না,
 * Optional.of() হলে করত)।
 *
 * তারপর isPresent() ও isEmpty() দিয়ে চেক করে print করো।
 *
 * Output:
 * name1 present: true
 * name2 present: false
 * name2 empty: true
 */

import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        String name1 = "Karim";
        String name2 = null;

        // TODO: Optional.ofNullable(name1) এবং Optional.ofNullable(name2) বানাও
        Optional<String> str1 = Optional.ofNullable(name1);
        Optional<String> str2 = Optional.ofNullable(name2);
        System.out.println(str1.get() + " " + str2);
        // TODO: isPresent() দিয়ে চেক করো name1 present কিনা
        boolean str3 = str1.isPresent();

        // TODO: isPresent() দিয়ে চেক করো name2 present কিনা
        boolean str4 = str2.isPresent();

        // TODO: isEmpty() দিয়ে চেক করো name2 empty কিনা
        boolean str5 = str2.isEmpty();

        System.out.println(str3 + " " + str4 + " " + str5);
    }
}
