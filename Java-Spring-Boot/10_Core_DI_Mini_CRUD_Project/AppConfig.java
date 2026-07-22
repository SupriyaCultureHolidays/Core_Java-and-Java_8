// @Configuration annotation বসাও, সাথে @ComponentScan (basePackages লাগবে না যদি সব
// class default package-এই থাকে)
//
// দুইটা @Bean method লাগবে (এই দুইটা class @Component না, তাই component-scan এদের ধরবে না):
//
// ১. @Component বনাম @Bean (sec 16) — IdGenerator "third-party class" ধরে নিয়ে:
//     @Bean
//     public IdGenerator idGenerator() { return new IdGenerator(); }
//
// ২. Bean Lifecycle (sec 15) — EmployeeDbConnection-এর জন্য initMethod/destroyMethod সহ:
//     @Bean(initMethod = "connect", destroyMethod = "disconnect")
//     public EmployeeDbConnection employeeDbConnection() { return new EmployeeDbConnection(); }
public class AppConfig {

    // দুইটা bean method এখানে লিখো
}
