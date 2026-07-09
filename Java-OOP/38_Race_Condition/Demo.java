/*
 * Question 37 (37_Race_Condition) — Synchronized Counter
 *
 * Counter class-এর একই object নিয়ে দুইটা thread একসাথে increment()
 * করবে (থ্রেড প্রতি ১০০০ বার)। synchronized keyword ব্যবহার করে
 * race condition avoid করো, final count সঠিক আসতে হবে।
 *
 * Output:
 * Final Count: 2000
 */
public class Demo {
    public static void main(String[] args) {
        Counter c = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
            System.out.println("Final Count for t1: " + c.count);
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
            System.out.println("Final Count for t2: " + c.count);

        });
        t1.start();
        t2.start();
        System.out.println("Final Count outside Loop: " + c.count);

    }
}
