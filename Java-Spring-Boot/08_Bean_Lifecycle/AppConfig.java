// @Configuration ও @ComponentScan বসাও, সাথে একটা @Bean method:
//     @Bean(initMethod = "connect", destroyMethod = "disconnect")
//     public DatabaseConnection databaseConnection() { return new DatabaseConnection(); }
// — DatabaseConnection-এ @Component ব্যবহার করা যেত না কারণ initMethod/destroyMethod
// attribute শুধু @Bean-এই আছে, @Component-এ নেই (sec 16-এর সাথে সরাসরি সম্পর্কিত)
public class AppConfig {

    // DatabaseConnection bean method (initMethod/destroyMethod সহ) এখানে লিখো
}
