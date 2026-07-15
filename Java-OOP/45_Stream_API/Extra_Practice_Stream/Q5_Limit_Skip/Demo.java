/*
 * Extra Practice (Stream) Q5 — limit() + skip()
 *
 * List<Integer> নাও (1 থেকে 20)।
 * প্রথম ৫টা বাদ দিয়ে (skip), তারপরের ৫টা সংখ্যা নাও (limit), print করো।
 *
 * Output:
 * [6, 7, 8, 9, 10]
 */

import java.util.List;
import java.util.stream.IntStream;

public class Demo {
    public static void main(String[] args) {
        List<Integer> nums = IntStream.rangeClosed(1, 20).boxed().toList();

        // TODO: skip(5) দিয়ে প্রথম ৫টা বাদ দাও
        // TODO: limit(5) দিয়ে পরের ৫টা নাও
        // TODO: toList() দিয়ে result বানাও এবং print করো
        nums.stream().skip(5).limit(5).forEach(num->System.out.println(num));
    }
}
