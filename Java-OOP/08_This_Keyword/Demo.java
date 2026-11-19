/*
 * Question 8 (08_This_Keyword) — Student (this keyword)
 *
 * Student class (name, age) — this keyword-এর ৪টা ব্যবহার দেখাও:
 * 1. this.name = name → field আর parameter-এর নাম এক হলে পার্থক্য করা
 * 2. this("Unknown", 0) → default constructor থেকে parameterized constructor call (constructor chaining)
 * 3. setName()/setAge() → return this; করবে, যাতে s.setName("Karim").setAge(22) এভাবে chain করা যায়
 * 4. isSameAge(Student other) → this.age == other.age দিয়ে current object-কে অন্য object-এর সাথে compare
 *
 * Output:
 * Name: Rahim, Age: 20
 * Name: Unknown, Age: 0
 * Name: Karim, Age: 22
 * Rahim and Karim same age? false
 */
public class Demo {
    public static void main(String[] args) {
        Student std = new Student();
        std.setName("Supriya");
        std.getName();
    }
}
