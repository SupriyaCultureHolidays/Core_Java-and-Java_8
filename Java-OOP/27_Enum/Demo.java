/*
 * Question 26 (26_Enum) — Season Enum
 *
 * Season enum বানাও (SUMMER, WINTER, SPRING, AUTUMN)। switch statement
 * দিয়ে প্রতিটা season-এর একটা ছোট description print করো।
 *
 * Output:
 * Summer is hot
 */
public class Demo {
    public static void main(String[] args) {
        Season  s = Season.SUMMER;

        switch (s) {
            case SUMMER:
                System.out.println("Summer is hot");
                break;
        
            default:
                break;
        }
    }
}
