// Constructor Injection — dependency constructor দিয়ে আসবে, final field-এ রাখবা
// (সবচেয়ে বেশি ব্যবহৃত ও recommended way, কারণ object তৈরির সময়েই dependency
// mandatory ভাবে দিতে হয়, পরে বদলানো যায় না — immutable, testable)
public class ConstructorInjectedService {

    // private final MessageSender sender;

    // constructor(MessageSender sender)

    // notifyUser(String message) — sender.send(message)
}
