// @Component (বা @Service) annotation বসাও, এবং @Primary বসাও — দুইটা NotificationService
// implementation থাকলে Spring এটাকেই default হিসেবে বেছে নেবে যদি কোথাও @Qualifier দিয়ে
// নির্দিষ্ট করে না বলা হয় (sec 14)
public class EmailNotificationService implements NotificationService {

    // notify(String message) — System.out.println("Email sent: " + message)
}
