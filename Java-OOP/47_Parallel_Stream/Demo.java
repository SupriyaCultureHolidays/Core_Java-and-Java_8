/*
 * Question 46 (46_Parallel_Stream) — Parallel Sum
 *
 * 1 থেকে 100 পর্যন্ত সংখ্যার একটা List বানাও, parallelStream()
 * ব্যবহার করে sum হিসাব করো, normal stream()-এর result-এর সাথে
 * compare করে দেখাও দুইটাই same আসে।
 *
 * Output:
 * Parallel Sum: 5050
 */

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        for(int i=1; i<=100; i++){
            nums.add(i);
        }
        System.out.println(nums);
    }
}
