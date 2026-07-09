/*
 * Question 30 (30_Exception_Handling) — Multiple Catch
 *
 * একটা array নিয়ে ArithmeticException (0 দিয়ে ভাগ) আর
 * ArrayIndexOutOfBoundsException (invalid index access) দুইটাই
 * আলাদা catch block দিয়ে handle করো।
 *
 * Output:
 * Arithmetic Exception caught: / by zero
 * Array Index Exception caught: Index out of bounds
 */

public class Demo {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[0] = 10;
            arr[1] = 20;
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Index out of bounds");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Index");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
