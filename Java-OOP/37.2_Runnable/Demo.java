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
