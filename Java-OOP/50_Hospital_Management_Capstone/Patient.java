// চাইলে Notifiable implement করো (interface practice, topic 26) — sendReminder() override করে
// System.out.println দিয়ে reminder message print করো

import java.util.ArrayList;
import java.util.List;

public class Patient extends Person {

    // Person-এর id, name ছাড়াও চাইলে appointmentIds (List<String>) রাখতে পারো —
    // এই patient কোন কোন appointment বুক করেছে সেটার track রাখার জন্য
    // constructor লিখো, super(id, name) call করো
    // getRole() override করো — return "Patient"
    List<String> appointmentIds = new ArrayList<>();
    Patient(String id, String name){
        super(id, name);
        appointmentIds.add(id);
    }
    @Override
    String getRole(){
        return "Patient";
    }
}
