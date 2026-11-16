// Notification পাঠানোর contract — দুইটা আলাদা implementation থাকবে (Email, SMS),
// @Qualifier/@Primary practice (sec 14) করার জন্যই ইচ্ছাকৃতভাবে দুইটা রাখা হচ্ছে
public interface NotificationService {

    // void notify(String message);
}
