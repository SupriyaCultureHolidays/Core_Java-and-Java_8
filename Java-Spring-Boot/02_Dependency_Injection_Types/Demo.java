// Question 2 — Dependency Injection প্রকারভেদ (sec 2), Spring ছাড়া ম্যানুয়ালি
//
// Output:
// Constructor Injection -> Sent: Hello
// Setter Injection -> Sent: Hello
// Field Injection -> Sent: Hello
public class Demo {
    public static void main(String[] args) {
        // 1. ConstructorInjectedService c = new ConstructorInjectedService(new EmailSender());
        //    c.notifyUser("Hello");
        // 2. SetterInjectedService s = new SetterInjectedService();
        //    s.setSender(new EmailSender());
        //    s.notifyUser("Hello");
        // 3. FieldInjectedService f = new FieldInjectedService();
        //    f.sender = new EmailSender();
        //    f.notifyUser("Hello");

        // তিনটার পার্থক্য (object কখন পুরোপুরি "ready" হয়, dependency বাধ্যতামূলক কিনা)
        // নিজের ভাষায় এখানে একটা comment-এ লিখো
    }
}
