// Interface (topic 14, Functional Interface থেকে আলাদা) — এখানে একাধিক method, default method,
// static method — সবকিছু practice করা হলো। AppointmentFilter ছিলো single-method
// functional interface (lambda-friendly); এটা plain interface যেখানে একাধিক method থাকতে পারে।
public interface Notifiable {

    void sendReminder(String message);

    // default method practice — implementing class override না করলেও এটা কাজ করবে
    default void sendDefaultReminder() {
        sendReminder("Apnar appointment ache, please time moto asben");
    }

    // static method practice — interface-এর মধ্যে static utility method
    static Notifiable consoleNotifier() {
        return message -> System.out.println("Reminder: " + message);
    }
}
