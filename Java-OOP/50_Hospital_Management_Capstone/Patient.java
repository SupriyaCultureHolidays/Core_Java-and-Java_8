// Notifiable implement করা হলো (interface practice, topic 14) — sendReminder() override করে
// System.out.println দিয়ে reminder message print করা হচ্ছে

import java.util.ArrayList;
import java.util.List;

public class Patient extends Person implements Notifiable {

    // এই patient কোন কোন appointment বুক করেছে সেটার track রাখার জন্য —
    // bookAppointment()-এ HospitalService এই list-এ appointmentId add করবে (patient-এর নিজের id নয়)
    List<String> appointmentIds = new ArrayList<>();

    Patient(String id, String name) {
        super(id, name);
    }

    @Override
    String getRole() {
        return "Patient";
    }

    @Override
    public void sendReminder(String message) {
        System.out.println("Reminder to patient " + name + ": " + message);
    }
}
