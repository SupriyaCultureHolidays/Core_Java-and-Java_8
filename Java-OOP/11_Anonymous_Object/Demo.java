/*
 * Question 11 (11_Anonymous_Object) — Student (Anonymous Object)
 *
 * Student class (name), static int count (constructor-এ count++), display()।
 *
 * - reference variable ছাড়া object বানিয়ে সাথে সাথে method call: new Student("Rahim").display();
 * - Demo.java-তে static void printStudent(Student s) লেখো, তাতে anonymous object pass করো: printStudent(new Student("Karim"));
 * - শেষে total count print করো
 * - Comment-এ লেখো: anonymous object-কে দ্বিতীয়বার কেন use করা যায় না, আর কখন এটা garbage collection-এর জন্য eligible হয়?
 *
 * Output:
 * Student: Rahim
 * Student: Karim
 * Total students created: 2
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
