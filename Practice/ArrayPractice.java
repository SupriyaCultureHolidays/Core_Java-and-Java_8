
import java.util.Scanner;

class ArrayPractice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array Declaration
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        // Output
        for (int i = 0; i < nums.length; i++) {
            System.out.println("A Lo"+nums[i]);
        }

    }
}