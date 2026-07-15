// চাইলে Notifiable implement করো (interface practice, topic 26) — sendReminder() override করে
// System.out.println দিয়ে reminder message print করো
public class Doctor extends Person {

    // constructor লিখো, super(id, name) call করো
    // চাইলে specialization (String) field যোগ করো, যেমন "Cardiologist"

    // getRole() override করো — return "Doctor"
    String specialization;
    Doctor(String id, String name, String specialization){
        super(id, name);
        this.specialization = specialization;
    }
    @Override
    String getRole(){
        return "Doctor";
    }
}
