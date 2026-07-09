/*
 * Question 36 (36_Thread_Priority_Sleep) — Priority and Sleep
 *
 * দুইটা PriorityDemo thread বানাও — একটার priority MAX_PRIORITY,
 * আরেকটার MIN_PRIORITY সেট করো। sleep() ব্যবহার করে run() এর মধ্যে
 * delay দাও, তারপর দুইটা start করো।
 *
 * Output:
 * High priority thread finished first
 */
public class Demo {
    public static void main(String[] args) {
        PriorityDemo p = new PriorityDemo();
        PriorityDemo q = new PriorityDemo();

        p.setPriority(Thread.MIN_PRIORITY);
        q.setPriority(Thread.MAX_PRIORITY);

        p.start();
        try {
            p.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        q.start();

        
    }
}
