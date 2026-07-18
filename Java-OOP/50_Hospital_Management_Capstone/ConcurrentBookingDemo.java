// Threads + Race Condition (topic 20) practice
// দুইজন patient একসাথে একই doctor-এর একই date-এর শেষ slot বুক করার চেষ্টা করলে কী হয় সেটা দেখো
//
// HospitalService.bookAppointment()-এ এখন "synchronized" keyword বসানো আছে বলে এই run-এ
// একজনই সফল হবে, অন্যজন SlotAlreadyBookedException পাবে। "synchronized" keyword-টা সরিয়ে
// আবার run করলে race condition দেখা যেতে পারে — দুইটা thread-ই একসাথে check করে দুইজনেই
// slot খালি দেখে ফেলতে পারে, ফলে দুইটাই "successfully" প্রিন্ট হয়ে যেতে পারে।
public class ConcurrentBookingDemo {

    public static void main(String[] args) throws InterruptedException {
        HospitalService service = HospitalService.getInstance();
        service.addDoctor(new Doctor("D1", "Dr. Karim", "Cardiologist"));
        service.addPatient(new Patient("P1", "Rahim"));
        service.addPatient(new Patient("P2", "Karim Patient"));

        Runnable bookingTask = () -> {
            try {
                service.bookAppointment("A1", "P1", "D1", java.time.LocalDate.of(2026, 7, 20));
                System.out.println(Thread.currentThread().getName() + " booked successfully");
            } catch (SlotAlreadyBookedException e) {
                System.out.println(Thread.currentThread().getName() + " failed: " + e.getMessage());
            }
        };

        Thread t1 = new Thread(bookingTask, "Thread-1");
        Thread t2 = new Thread(bookingTask, "Thread-2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
