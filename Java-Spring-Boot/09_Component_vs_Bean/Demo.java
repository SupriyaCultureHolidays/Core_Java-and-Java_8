// Question 9 — @Component বনাম @Bean (sec 16)
//
// Output:
// Generated ID: 1000
// Generated ID: 1001
public class Demo {
    public static void main(String[] args) {
        // 1. ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        // 2. IdConsumer consumer = context.getBean(IdConsumer.class);
        // 3. consumer.printNewId();
        // 4. consumer.printNewId();

        // কেন @Component দিয়ে IdGenerator-কে সরাসরি bean বানানো কষ্টকর হতো, সেটা
        // একটা comment-এ লিখো
    }
}
