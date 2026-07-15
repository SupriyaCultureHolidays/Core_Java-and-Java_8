/*
 * Extra Practice (Stream) Q11 — reduce()
 *
 * List<Integer> নাও (salary গুলো): 30000, 35000, 50000
 *
 * ১) reduce() দিয়ে সবগুলোর যোগফল (total) বের করো।
 * ২) reduce() দিয়ে সবচেয়ে বড় (max) সংখ্যাটা বের করো।
 *
 * Output:
 * Total: 115000
 * Max: 50000
 */

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> salaries = List.of(30000, 35000, 50000);

        // TODO: reduce(0, (a, b) -> a + b) দিয়ে total বের করো
        // TODO: reduce((a, b) -> a > b ? a : b) দিয়ে max বের করো (এটা Optional<Integer> রিটার্ন করবে)
        System.out.println(salaries.stream().reduce(0, (a,b)-> a+b));
        System.out.println(salaries.stream().reduce((a, b)-> a >b ? a: b ).get());
    }
}
