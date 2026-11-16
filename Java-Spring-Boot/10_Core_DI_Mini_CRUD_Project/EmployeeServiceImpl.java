// @Service annotation বসাও (Stereotype, sec 12 — business logic layer বোঝাতে)
//
// Constructor Injection (sec 2, 11) — EmployeeRepository, NotificationService, IdGenerator
// তিনটাই constructor-এর মাধ্যমে নিয়ে field-এ রাখবা। NotificationService-এর জন্য constructor
// parameter-এর উপর @Qualifier("smsNotificationService") বসাবা (sec 14) — নাহলে দুইটা
// NotificationService bean থাকায় Spring confuse হবে
//
// Extra practice (sec 11-এর field injection variant) — এই তিনটার একটাকে (যেমন IdGenerator)
// constructor-এর বদলে সরাসরি field-এ @Autowired দিয়ে inject করে দেখো, পার্থক্য বোঝার জন্য
// (constructor injection-ই সাধারণত recommended, field injection শুধু তুলনা করার জন্য একবার try করো)
public class EmployeeServiceImpl implements EmployeeService {

    // private final EmployeeRepository repository;
    // private final NotificationService notificationService;
    // private final IdGenerator idGenerator;

    // constructor — উপরের তিনটা parameter নিয়ে assign করবা

    // addEmployee(...) — idGenerator.nextId() দিয়ে id বানাও, নতুন Employee বানাও,
    // repository.save() করো, notificationService.notify("New employee added: " + name) করো

    // getEmployee(int id) — repository.findById(id).orElseThrow(() -> new EmployeeNotFoundException(...))

    // getAllEmployees() — repository.findAll()

    // removeEmployee(int id) — getEmployee(id) দিয়ে আগে exists কিনা দেখো (না থাকলে
    // exception এখানেই propagate হবে), তারপর repository.deleteById(id)
}
