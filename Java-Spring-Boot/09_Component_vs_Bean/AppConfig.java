// @Configuration ও @ComponentScan বসাও, সাথে একটা @Bean method:
//     @Bean
//     public IdGenerator idGenerator() { return new IdGenerator(); }
// — @Component দিয়ে IdGenerator-কে সরাসরি bean বানানো যেত না (third-party source ধরে
// নেওয়া হচ্ছে, edit করা যায় না), তাই @Bean method দিয়ে explicitly register করতে হলো —
// এটাই @Component বনাম @Bean-এর মূল পার্থক্য
public class AppConfig {

    // IdGenerator bean method এখানে লিখো
}
