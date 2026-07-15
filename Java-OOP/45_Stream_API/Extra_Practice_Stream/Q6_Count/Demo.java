/*
 * Extra Practice (Stream) Q6 — count()
 *
 * List<String> নাও: "apple", "banana", "avocado", "grape", "apricot"
 * "a" দিয়ে শুরু হওয়া কয়টা শব্দ আছে, count() দিয়ে বের করো।
 *
 * Output:
 * Count: 3
 */

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "avocado", "grape", "apricot");

        // TODO: filter() দিয়ে "a" দিয়ে শুরু হওয়া শব্দ বের করো
        // TODO: count() দিয়ে সংখ্যা বের করো এবং print করো
        long total = words.stream().filter(word-> word.startsWith("a")).count();
        System.out.println(total);
    }
}
