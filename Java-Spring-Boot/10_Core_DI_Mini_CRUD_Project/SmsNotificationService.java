// @Component (বা @Service) annotation বসাও — @Primary বসাবা না। EmployeeServiceImpl-এ
// এটাকে ব্যবহার করার জন্য constructor parameter-এ @Qualifier("smsNotificationService")
// দিয়ে নাম উল্লেখ করে আনতে হবে (sec 14)
public class SmsNotificationService implements NotificationService {

    // notify(String message) — System.out.println("SMS sent: " + message)
}
