/*
 * Extra Practice (Stream) Q10 — Collectors.joining()
 *
 * List<String> নাও: "Rahim", "Karim", "Sumi"
 * stream() + Collectors.joining(", ") ব্যবহার করে একটা single String বানাও।
 *
 * Output:
 * Rahim, Karim, Sumi
 */

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<String> names = List.of("Rahim", "Karim", "Sumi");

        // TODO: Collectors.joining(", ") ব্যবহার করে একটা String বানাও এবং print করো
        // names.stream().collect(Collectors.joining(", "));
        System.out.println(names.stream().collect(Collectors.joining(", ")));
    }
}
