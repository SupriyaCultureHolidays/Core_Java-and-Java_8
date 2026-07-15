/*
 * Extra Practice (Stream) Q3 — sorted() + distinct()
 *
 * List<Integer> নাও: 5, 3, 8, 3, 1, 5, 9, 1
 * stream() ব্যবহার করে duplicate সংখ্যা বাদ দাও (distinct),
 * তারপর ascending order-এ sort করো, শেষে print করো।
 *
 * Output:
 * [1, 3, 5, 8, 9]
 */

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> nums = List.of(5, 3, 8, 3, 1, 5, 9, 1);
        List<Integer> upname = nums.stream().distinct().sorted().toList();
        System.out.println(upname);
    }
}
