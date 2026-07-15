/*
 * Extra Practice (Stream) Q1 — filter() + map()
 *
 * List<Integer> নাও (1 থেকে 10)।
 * stream() ব্যবহার করে শুধু জোড় (even) সংখ্যাগুলো filter করো,
 * তারপর map() দিয়ে প্রতিটা সংখ্যাকে বর্গ (square) করো,
 * শেষে toList() দিয়ে নতুন List বানাও এবং print করো।
 *
 * Output:
 * [4, 16, 36, 64, 100]
 */

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNum = nums.stream().filter(num -> num%2==0).toList();
        System.out.println(evenNum);
        List<Integer> squareNum = evenNum.stream().map(m-> m*m).toList();
        System.out.println(squareNum);

        // or
        List<Integer> squareNum2 = nums.stream().filter(num-> num%2==0).map(num-> num*num).toList();
        System.out.println(squareNum2);
       }
}
