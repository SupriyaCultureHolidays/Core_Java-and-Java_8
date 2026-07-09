/*
 * Question 35 (35_Threads) — Thread vs Runnable
 *
 * MyThread (extends Thread) আর TaskRunnable (implements Runnable) —
 * দুইটা আলাদা way-তে thread বানাও, দুইটাই start() করো।
 *
 * Output:
 * Thread-1 running
 * Thread-2 running
 */
public class Demo {
    public static void main(String[] args) {
        MyThread m = new MyThread("Supriya");
        TaskRunnable k = new TaskRunnable("Mukesh");

        m.start();
        // Runnable 
        Thread runnable = new Thread(k);
        runnable.start();
    }
}
