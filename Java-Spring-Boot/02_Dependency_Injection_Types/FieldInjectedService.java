// Field Injection — dependency সরাসরি field-এ বসানো হয় (Spring-এ @Autowired দিয়ে হয়,
// এখানে Spring নেই তাই field-টা package-private রেখে বাইরে থেকে সরাসরি assign করে
// দেখাও)। সবচেয়ে কম কোড লাগে কিন্তু constructor না থাকায় null-check/testing কঠিন হয়ে
// যায় — এই কারণেই এটা কম recommended
public class FieldInjectedService {

    // MessageSender sender; // package-private, বাইরে থেকে সরাসরি সেট করার জন্য

    // notifyUser(String message) — sender.send(message)
}
