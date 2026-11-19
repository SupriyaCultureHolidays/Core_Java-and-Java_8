/*
 * Question 4 (04_Stack_Heap_Memory) — Calculator (Stack vs Heap)
 *
 * Calculator class — একটা field int result।
 *
 * Demo.java-তে দুইটা static method লেখো:
 * - addTenToNumber(int x) → x-এ 10 যোগ করে print করবে (primitive — value-এর copy stack-এ যায়)
 * - addTenToResult(Calculator c) → c.result-এ 10 যোগ করবে (reference-এর copy যায়, কিন্তু object heap-এ একটাই)
 *
 * তারপর:
 * 1. int x = 5; → addTenToNumber(x) call করে আগে-পরে x print করো
 * 2. Calculator c1 = new Calculator(); c1.result = 5; → addTenToResult(c1) call করে আগে-পরে print করো
 * 3. Calculator c2 = c1; c2.result = 100; → c1.result print করো (দুইটা reference, একটাই object)
 *
 * Comment-এ লেখো: x কেন বদলালো না, কিন্তু c1.result কেন বদলালো?
 *
 * Output:
 * Before: x = 5
 * Inside method: x = 15
 * After: x = 5
 * Before: c1.result = 5
 * After: c1.result = 15
 * c1.result after c2 change: 100
 */
public class Demo {
    public static void main(String[] args) {

    }
}
