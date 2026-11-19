/*
 * Question 35.2 (37.2_Runnable) — Runnable Interface
 *
 * - TaskRunnable implements Runnable → new Thread(task, "Worker-1").start()
 * - একই TaskRunnable object দুইটা Thread-এ দাও ("Worker-1", "Worker-2")
 * - Lambda দিয়ে Runnable: Runnable r = () -> ...; → new Thread(r, "Lambda").start()
 * - Comment-এ লেখো: extends Thread-এর চেয়ে implements Runnable কেন বেশি ভালো?
 *
 * Output (order বদলাতে পারে):
 * Worker-1 running task
 * Worker-2 running task
 * Lambda thread running
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
