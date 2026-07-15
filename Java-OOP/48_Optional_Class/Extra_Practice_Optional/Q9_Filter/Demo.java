/*
 * Extra Practice (Optional) Q9 — filter()
 *
 * Optional<Integer> age = Optional.of(15);
 *
 * filter() ব্যবহার করে চেক করো age >= 18 কিনা।
 * - শর্ত পূরণ না হলে, filter() একটা empty Optional বানিয়ে দেয়।
 * - তারপর orElse(-1) দিয়ে result বের করো।
 *
 * প্রথমে age=15 দিয়ে try করো (শর্ত fail করবে, -1 আসবে),
 * তারপর age=20 দিয়ে try করো (শর্ত পাস করবে, 20 আসবে)।
 *
 * Output:
 * -1
 * 20
 */

import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        Optional<Integer> age1 = Optional.of(15);
        Optional<Integer> age2 = Optional.of(20);

        // TODO: age1.filter(a -> a >= 18).orElse(-1) print করো
        // TODO: age2.filter(a -> a >= 18).orElse(-1) print করো
    }
}
