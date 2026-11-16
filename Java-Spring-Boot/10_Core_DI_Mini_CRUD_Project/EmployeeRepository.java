// Repository layer contract — data access-এর জন্য interface, যাতে implementation বদলালে
// (in-memory, পরে module 5-6-এ আসল DB হলেও) Service layer-এ কিছু বদলাতে না হয়
// (loose coupling — Question 1/topic 1-এর মতোই Strategy pattern-এর ভাবনা)
public interface EmployeeRepository {

    // Employee save(Employee employee);
    // Optional<Employee> findById(int id);
    // List<Employee> findAll();
    // void deleteById(int id);
}
