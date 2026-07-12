// Interface (topic 26, Functional Interface থেকে আলাদা) — এখানে একাধিক method, default method,
// static method — সবকিছু practice করার জায়গা। Searchable/AppointmentFilter ছিলো single-method
// functional interface (lambda-friendly); এটা plain interface যেখানে একাধিক method থাকতে পারে।
public interface Notifiable {

    // void sendReminder(String message); — এই abstract method লিখো

    // default method practice — implementing class override না করলেও এটা কাজ করবে:
    // default void sendDefaultReminder() {
    //     sendReminder("Apnar appointment ache, please time moto আসবেন");
    // }

    // static method practice — interface-এর মধ্যে static utility method:
    // static Notifiable consoleNotifier() {
    //     return message -> System.out.println("Reminder: " + message);
    // }
}
