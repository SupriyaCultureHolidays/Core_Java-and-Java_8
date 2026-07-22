// Question 4 — XML দিয়ে Bean-এর ভিতরে Bean Inject করা (sec 8)
//
// Output:
// User Rahim created. Notification sent: Welcome Rahim!
public class Demo {
    public static void main(String[] args) {
        // 1. ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 2. UserService userService = context.getBean(UserService.class);
        // 3. userService.createUser("Rahim");
    }
}
