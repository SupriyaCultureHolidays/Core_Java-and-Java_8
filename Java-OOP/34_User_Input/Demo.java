/*
 * Question 33 (33_User_Input) — Scanner and BufferedReader
 *
 * Scanner ব্যবহার করে user-এর name নেও, আর BufferedReader ব্যবহার
 * করে age নেও (দুইটা আলাদা input method দেখাও)। তারপর দুইটা print করো।
 *
 * Output:
 * Name: Rahim, Age: 25
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {

        // Scanner দিয়ে name input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        // BufferedReader দিয়ে age input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Age: ");
        int age = Integer.parseInt(br.readLine());

        System.out.println("Name: " + name + ", Age: " + age);

        sc.close();
    }
}