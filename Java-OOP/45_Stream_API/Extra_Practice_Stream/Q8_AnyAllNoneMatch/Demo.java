/*
 * Extra Practice (Stream) Q8 — anyMatch() / allMatch() / noneMatch()
 *
 * List<Integer> নাও: 2, 4, 6, 8, 10
 *
 * ১) কোনো একটা সংখ্যা কি 5-এর বেশি? (anyMatch)
 * ২) সবগুলো সংখ্যা কি জোড় (even)? (allMatch)
 * ৩) কোনো সংখ্যাই কি ঋণাত্মক (negative) না? (noneMatch)
 *
 * Output:
 * Any > 5: true
 * All even: true
 * None negative: true
 */

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> nums = List.of(2, 4, 6, 8, 10);

        // TODO: anyMatch() দিয়ে চেক করো কোনো সংখ্যা 5-এর বেশি কিনা
        // TODO: allMatch() দিয়ে চেক করো সবগুলো even কিনা
        // TODO: noneMatch() দিয়ে চেক করো কোনোটা negative কিনা
        boolean anym = nums.stream().anyMatch(num-> num>5);
        System.out.println(anym);
        boolean allm = nums.stream().allMatch(num-> num%2==0);
        System.out.println(allm);
        boolean nonem = nums.stream().noneMatch(num-> num < 0);
        System.out.println(nonem);
    }
}
