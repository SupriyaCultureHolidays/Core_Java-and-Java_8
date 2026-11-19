/*
 * Question 5 (05_Static) — Student (static variable, method, block)
 *
 * Student class
 * - name → instance variable (প্রতিটা student-এর আলাদা)
 * - static String schoolName → সব student-এর জন্য একটাই
 * - static int count → constructor-এ count++
 * - static { } block → schoolName = "ABC School" set করবে ও "Static block executed" print করবে
 * - static void showSchoolInfo() → schoolName আর count print করবে (object ছাড়া Student.showSchoolInfo() দিয়ে call)
 * - study() → instance method
 *
 * Bonus: static method-এর ভেতর থেকে name বা this use করলে কী error আসে দেখো।
 *
 * Output:
 * Static block executed
 * Rahim is studying
 * Karim is studying
 * School: ABC School, Total students: 2
 */
public class Demo {
    public static void main(String[] args) {
        Student std = new Student();
        std.study();
        std.sleep();
        std.eat();
    }
}
