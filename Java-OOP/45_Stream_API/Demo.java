/*
 * Question 44 (44_Stream_API) — Stream forEach
 *
 * List<Integer> বানাও (1 থেকে 5), stream() ব্যবহার করে forEach() দিয়ে
 * প্রতিটা সংখ্যা print করো।
 *
 * Output:
 * 1 2 3 4 5
 */

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr);
        // Stream Api
        List<Integer> maxnumber = arr.stream().
        filter((m)->{
            return m==5;
        });
    }
}
