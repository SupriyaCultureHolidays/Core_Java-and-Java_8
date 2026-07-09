/*
 * Question 32 (32_Throws_Keyword) — File Reading
 *
 * FileService-এ readFile(String path) method বানাও, যেটা
 * `throws IOException` declare করবে। Demo-তে try-catch দিয়ে call করো,
 * ফাইল না পেলে catch block-এ message print হবে।
 *
 * Output:
 * File not found!
 */

import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        FileService f = new FileService();
        try {
            f.readFile("data.txt");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
