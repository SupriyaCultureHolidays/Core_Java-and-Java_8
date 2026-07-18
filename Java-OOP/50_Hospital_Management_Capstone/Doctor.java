// Notifiable implement করা হলো (interface practice, topic 14) — sendReminder() override করে
// System.out.println দিয়ে reminder message print করা হচ্ছে
public class Doctor extends Person implements Notifiable {

    String specialization;

    Doctor(String id, String name, String specialization) {
        super(id, name);
        this.specialization = specialization;
    }

    @Override
    String getRole() {
        return "Doctor";
    }

    @Override
    public void sendReminder(String message) {
        System.out.println("Reminder to " + name + ": " + message);
    }
}
