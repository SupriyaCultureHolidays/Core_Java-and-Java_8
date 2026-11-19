/*
 * Question 35 (36_Threads) — Extending Thread
 *
 * MyThread extends Thread — run() override করবে, current thread-এর নাম print করবে।
 *
 * - ৩টা MyThread object বানিয়ে start() করো
 * - main thread-ও একটা line print করবে
 * - run() সরাসরি call করলে আর start() করলে কী পার্থক্য হয় দেখো (নতুন thread হয় কি?)
 *
 * Output (order বদলাতে পারে):
 * Main thread running
 * Thread-0 running
 * Thread-1 running
 * Thread-2 running
 */
public class Demo {
    public static void main(String[] args) {
        MyThread m = new MyThread("Supriya");
        MyThread n = new MyThread("Ram");
        MyThread o = new MyThread("Laxman");
        // m.run();
        // m.start();
        // System.out.println("Main Thread start");
        // for(int i=0; i<5; i++){
        //     System.out.println("MainThread : "+i);
        // }

        // Multiple Thread
        m.start();
        // n.start();
        // o.start();
    }
}
