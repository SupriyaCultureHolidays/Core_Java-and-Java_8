/*
 * Extra Practice Q2 — Runtime Polymorphism + Dynamic Method Dispatch
 *
 * Parent class Notification
 *   - method: send() -> "Sending generic notification" print করবে
 *
 * তিনটা subclass বানাও যেগুলো send() override করবে:
 *   EmailNotification -> "Sending Email Notification"
 *   SMSNotification   -> "Sending SMS Notification"
 *   PushNotification  -> "Sending Push Notification"
 *
 * Demo.java তে Notification array বানাও যার মধ্যে তিন ধরনের object রাখবে,
 * তারপর loop চালিয়ে সবার send() call করো (parent reference দিয়ে child method
 * call হচ্ছে — এটাই dynamic method dispatch)।
 *
 * Output:
 * Sending Email Notification
 * Sending SMS Notification
 * Sending Push Notification
 */
public class Demo {
    public static void main(String[] args) {
        // TODO: Notification parent class ও তিনটা child class বানাও
        // TODO: Notification[] array বানিয়ে loop দিয়ে send() call করো

        Notification[] noti = new Notification[3];
        noti[0] = new EmailNotification();
        noti[1] = new SMSNotification();
        noti[2] = new PushNotification();

        for(Notification n : noti){
            n.send();
        }
    }
}
