// Question 8 — Bean Lifecycle (sec 15)
//
// এই কোর্সে lifecycle callback-এর জন্য @PostConstruct/@PreDestroy ব্যবহার করা হয়নি
// (extra dependency লাগে বলে) — বরং @Bean(initMethod=..., destroyMethod=...) দিয়ে
// AppConfig-এ register করাই এখানকার আসল পদ্ধতি (SpringBoot.html sec 15 দেখো)।
//
// Output:
// Connecting...
// Connection ready
// Disconnecting...
public class Demo {
    public static void main(String[] args) {
        // 1. ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        // 2. context.getBean(DatabaseConnection.class); // bean তৈরি হওয়ার সময়েই initMethod (connect) চলবে
        // 3. context.close(); // destroyMethod (disconnect) চলবে

        // Extra practice: jakarta.annotation-api dependency যোগ করে @PostConstruct/@PreDestroy
        // দিয়েও একবার try করে দেখতে পারো, দুই পদ্ধতির পার্থক্য বোঝার জন্য
    }
}
