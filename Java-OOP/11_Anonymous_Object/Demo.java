/*
 * Question 11
 * একটি static counter রাখো।
 * যত object create হবে counter increase হবে।
 * Student class-এ static int count রাখো, constructor-এ count++ করো।
 * কয়েকটা Student object বানিয়ে শেষে total count print করো।
 *
 * Output:
 * Total students created: 4
 */
public class Demo {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.display();

        Student std2 = new Student();
        std2.display();

        Student std3 = new Student();
        std3.display();
    }
}
