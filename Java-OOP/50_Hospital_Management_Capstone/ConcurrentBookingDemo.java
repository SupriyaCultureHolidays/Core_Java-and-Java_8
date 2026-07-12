// Threads + Race Condition (topic 36-39) practice
// দুইজন patient একসাথে একই doctor-এর একই date-এর শেষ slot বুক করার চেষ্টা করলে কী হয় সেটা দেখো
public class ConcurrentBookingDemo {

    public static void main(String[] args) {
        // HospitalService service = HospitalService.getInstance();
        // ... doctor/patient add করো ...

        // Runnable bookingTask = () -> {
        //     try {
        //         service.bookAppointment("A1", "P1", "D1", java.time.LocalDate.of(2026, 7, 20));
        //         System.out.println(Thread.currentThread().getName() + " booked successfully");
        //     } catch (SlotAlreadyBookedException e) {
        //         System.out.println(Thread.currentThread().getName() + " failed: " + e.getMessage());
        //     }
        // };

        // Thread t1 = new Thread(bookingTask, "Thread-1");
        // Thread t2 = new Thread(bookingTask, "Thread-2");
        // t1.start();
        // t2.start();

        // প্রথমে bookAppointment() unsynchronized রেখে run করো — দেখো কি দুইটাই সফল হয়ে যায় কিনা
        // (race condition — দুই thread একসাথে check করে দুইজনেই slot খালি দেখে ফেলে)
        // তারপর HospitalService.bookAppointment() method-এ "synchronized" keyword যোগ করে
        // আবার run করো — এবার একটাই সফল হবে, অন্যটা SlotAlreadyBookedException পাবে
    }
}
