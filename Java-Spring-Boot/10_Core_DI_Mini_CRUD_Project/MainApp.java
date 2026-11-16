/*
 * Module 1 Mini Project — Employee Directory (Layered Architecture, In-Memory "DB")
 * SpringBoot.html sec 1-17 (Core Spring: IoC, DI, Bean, Annotation Config)-এর পুরোটা এক
 * জায়গায় practice করার জন্য। এখনো plain Spring (Spring Boot নয় — Boot sec 18 থেকে শুরু
 * হবে), তাই কোনো web server/REST নেই — সব কিছু main() থেকে ApplicationContext দিয়ে চলবে।
 *
 * Classes: Employee, EmployeeNotFoundException, EmployeeRepository, InMemoryEmployeeRepository,
 *          EmployeeDbConnection, NotificationService, EmailNotificationService,
 *          SmsNotificationService, IdGenerator, EmployeeService, EmployeeServiceImpl,
 *          EmployeeController, AppConfig, MainApp
 *
 * ── কভার হচ্ছে (SpringBoot.html sec নাম্বার) ──
 *  1. (sec 5)  Bean, IoC Container, ApplicationContext — MainApp-এ AnnotationConfigApplicationContext
 *  2. (sec 10) Annotation Config — @Configuration, @ComponentScan (AppConfig)
 *  3. (sec 11) @Autowired — constructor injection সবখানে, একটা জায়গায় field injection variant try করো
 *  4. (sec 12) Stereotype Annotations — @Repository (InMemoryEmployeeRepository), @Service
 *              (EmployeeServiceImpl), @Component (EmployeeController — @Controller না, কারণ
 *              এটা real Spring MVC নয়; ঠিক sec 17-এর কোর্স-নিজের project-এর মতোই)
 *  5. (sec 13) Layered Architecture — Controller → Service → Repository
 *  6. (sec 14) @Qualifier ও @Primary — EmailNotificationService (@Primary) বনাম
 *              SmsNotificationService (@Qualifier দিয়ে নাম ধরে আনা)
 *  7. (sec 15) Bean Lifecycle — EmployeeDbConnection-এ connect()/disconnect() method,
 *              AppConfig-এ @Bean(initMethod="connect", destroyMethod="disconnect") দিয়ে register
 *              (এই কোর্সে @PostConstruct/@PreDestroy ব্যবহার হয়নি — extra dependency লাগে বলে)
 *  8. (sec 16) @Component বনাম @Bean — IdGenerator ও EmployeeDbConnection দুইটাই AppConfig-এ
 *              @Bean method দিয়ে register (কারণ initMethod/destroyMethod attribute শুধু
 *              @Bean-এই আছে, @Component-এ নেই)
 *  9. (sec 1, 2 recap) Loose Coupling ও DI — সব dependency interface-এর মাধ্যমে injected,
 *     কোথাও সরাসরি `new` করা হচ্ছে না (Controller-এ Service, Service-এ Repository/NotificationService)
 *
 * ── Maven Setup (নিজে করবা — sec 6 অনুযায়ী) ──
 * এই ফোল্ডারে কোনো pom.xml দেওয়া হয়নি। নিজে একটা Maven project বানাও (IDE দিয়ে বা
 * `mvn archetype:generate` দিয়ে), src/main/java-এ এই class গুলো রাখো (default package,
 * আলাদা package লাগবে না), pom.xml-এ spring-context dependency যোগ করো — Spring Boot
 * starter না, এটা এখনো plain Spring (sec 18-এর আগে)।
 *
 * ── MainApp-এ যা করতে হবে ──
 * AnnotationConfigApplicationContext দিয়ে AppConfig.class load করো, context থেকে
 * EmployeeController bean নাও (context.getBean(...))। তারপর controller দিয়ে ২-৩ জন
 * employee addEmployee() করো, listEmployees() call করো, একজনকে removeEmployee() করো,
 * আবার listEmployees() call করে দেখো বাদ পড়েছে। শেষে না-থাকা id দিয়ে removeEmployee()
 * করে EmployeeNotFoundException handle হওয়া দেখাও। সব শেষে context.close() করো — এতে
 * EmployeeDbConnection-এর destroyMethod (disconnect) call হবে, log console-এ দেখবা।
 *
 * Output (নমুনা — @Qualifier("smsNotificationService") ব্যবহার করলে):
 * Employee store ready
 * Added employee: Rahim (IT)
 * SMS sent: New employee added: Rahim
 * Added employee: Karim (HR)
 * SMS sent: New employee added: Karim
 * Employee{id=1000, name=Rahim, department=IT, salary=...}
 * Employee{id=1001, name=Karim, department=HR, salary=...}
 * Removed employee: 1000
 * Employee{id=1001, name=Karim, department=HR, salary=...}
 * Employee not found: 9999
 * Employee store closed
 *
 * ── Build Order ──
 *  1. Employee, EmployeeNotFoundException — কোনো dependency নেই
 *  2. EmployeeRepository, NotificationService — interface, dependency নেই
 *  3. EmployeeDbConnection, EmailNotificationService, SmsNotificationService, IdGenerator
 *     — dependency নেই বা শুধু interface implement করে
 *  4. InMemoryEmployeeRepository — EmployeeDbConnection use করে
 *  5. EmployeeService, EmployeeServiceImpl — Repository + NotificationService + IdGenerator use করে
 *  6. EmployeeController — Service use করে
 *  7. AppConfig — সব class একসাথে wiring (IdGenerator ও EmployeeDbConnection @Bean method
 *     দিয়ে, বাকি সব @ComponentScan দিয়ে auto)
 *  8. MainApp — সব শেষে, context বুট করে test
 *
 * ── এই project থেকে যা মনে রাখবা (Module 2 REST/MVC ধরার আগে) ──
 * - EmployeeController এখন plain method call করছে — Module 2-এ এটাই @RestController হয়ে
 *   HTTP endpoint (GET/POST) এক্সপোজ করবে, ভিতরের logic একই থাকবে
 * - EmployeeService/Repository split — Module 5-6 (JDBC/JPA)-এ Repository-র ভিতরের
 *   in-memory Map বদলে গিয়ে আসল database access আসবে, Service layer একই থাকবে
 * - এই layered ভাবনাটাই পুরো কোর্সে repeat হবে, শুধু নিচের layer বদলাবে
 */
public class MainApp {
    public static void main(String[] args) {
        // এখান থেকে শুরু করো:
        // 1. ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        // 2. EmployeeController controller = context.getBean(EmployeeController.class);
        // 3. controller.addEmployee(...) ২-৩ বার
        // 4. controller.listEmployees();
        // 5. controller.removeEmployee(কোনো একটা existing id);
        // 6. controller.listEmployees();
        // 7. controller.removeEmployee(9999); // না-থাকা id — exception handle হওয়া দেখো
        // 8. context.close();
    }
}
