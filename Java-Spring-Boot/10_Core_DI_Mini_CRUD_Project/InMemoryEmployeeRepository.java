// @Repository annotation বসাও (Stereotype Annotation, sec 12) — data access layer বোঝাতে
// @Component-এর বদলে এটা ব্যবহার করবা
//
// Constructor Injection — EmployeeDbConnection নিবে (AppConfig-এর @Bean method থেকে আসবে,
// এই class @Component না, তাই component-scan-এ ধরা পড়বে না)
public class InMemoryEmployeeRepository implements EmployeeRepository {

    // private final EmployeeDbConnection db;

    // constructor(EmployeeDbConnection db)

    // save(Employee employee) — db.getStore().put(employee.getId(), employee), employee রিটার্ন করো

    // findById(int id) — Optional.ofNullable(db.getStore().get(id))

    // findAll() — db.getStore().values() থেকে নতুন ArrayList বানিয়ে রিটার্ন করো

    // deleteById(int id) — db.getStore().remove(id)
}
