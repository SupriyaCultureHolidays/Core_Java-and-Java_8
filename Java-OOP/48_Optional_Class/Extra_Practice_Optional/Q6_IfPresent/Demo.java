/*
 * Extra Practice (Optional) Q6 — ifPresent()
 *
 * একটা Optional<String> নাও: Optional.ofNullable("Karim")
 * ifPresent() ব্যবহার করে, value থাকলেই শুধু print করো
 * (if-else / isPresent() লিখবে না)।
 *
 * তারপর একটা empty Optional নিয়ে একই কাজ করো —
 * এবার কিছুই print হবে না।
 *
 * Output:
 * Karim
 */

import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable("Karim");
        Optional<String> emptyName = Optional.ofNullable(null);

        // TODO: name.ifPresent(...) দিয়ে print করো
        // TODO: emptyName.ifPresent(...) দিয়ে print করার চেষ্টা করো (কিছুই print হবে না)
    }
}
