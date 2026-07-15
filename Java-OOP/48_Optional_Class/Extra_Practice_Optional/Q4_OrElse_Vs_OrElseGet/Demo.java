/*
 * Extra Practice (Optional) Q4 — orElse() vs orElseGet() (তফাত বোঝা)
 *
 * একটা non-empty Optional বানাও: Optional.of("Rahim")
 *
 * এবার দুইভাবে default value দাও, কিন্তু default value বানানোর আগে
 * একটা print statement রাখো (যেটা বলবে "Computing default...")।
 *
 * ১) orElse(computeDefault())   -> এখানে computeDefault() সবসময় call হবে,
 *                                  Optional-এ value থাকলেও।
 * ২) orElseGet(() -> computeDefault()) -> এটা তখনই call হবে যখন Optional খালি।
 *
 * লক্ষ্য করো: orElse() ব্যবহার করলে "Computing default..." print হবে
 * (যদিও value ব্যবহার হবে না), কিন্তু orElseGet() ব্যবহার করলে print হবে না
 * (কারণ Optional-এ ইতিমধ্যে value আছে)।
 *
 * Output:
 * Computing default...
 * Rahim
 * Rahim
 */

import java.util.Optional;

public class Demo {
    static String computeDefault() {
        System.out.println("Computing default...");
        return "Guest";
    }

    public static void main(String[] args) {
        Optional<String> name = Optional.of("Rahim");

        // TODO: name.orElse(computeDefault()) call করো এবং print করো
        // (লক্ষ্য করো "Computing default..." প্রথমে print হয়ে যাবে)
        System.out.println(name.orElse(computeDefault()));
        // TODO: name.orElseGet(() -> computeDefault()) call করো এবং print করো
        // (এবার "Computing default..." print হবে না)
        System.out.println(name.orElseGet(() -> computeDefault()));

    }
}
