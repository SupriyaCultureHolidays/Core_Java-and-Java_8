/*
 * Extra Practice (Optional) Q5 — orElseThrow()
 *
 * একটা method বানাও: findUserById(int id)
 * যদি id == 1 হয়, Optional.of("Rahim") return করবে।
 * অন্য কোনো id হলে, Optional.empty() return করবে।
 *
 * Demo.java-তে:
 * ১) id=1 দিয়ে call করো, orElseThrow() দিয়ে value বের করে print করো।
 * ২) id=99 দিয়ে call করো, orElseThrow(() -> new RuntimeException("User not found"))
 *    ব্যবহার করে try-catch দিয়ে exception ধরে message print করো।
 *
 * Output:
 * Rahim
 * User not found
 */

import java.util.Optional;

public class Demo {
    static Optional<String> findUserById(int id) {
        if (id == 1) {
            return Optional.of("Rahim");
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        // TODO: findUserById(1).orElseThrow() call করে print করো
        System.out.println(Demo.findUserById(1).orElseThrow());

        // TODO: try-catch এর ভিতরে findUserById(99).orElseThrow(() -> new
        // RuntimeException("User not found"))
        // call করো, catch block-এ e.getMessage() print করো
        try {
            System.out.println(Demo.findUserById(99).orElseThrow(() -> new RuntimeException("User not found")));

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
