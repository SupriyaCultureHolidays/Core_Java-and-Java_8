/*
 * Extra Practice Q1 — Multilevel Inheritance + super keyword + Method Overriding
 *
 * তিনটা class বানাও:
 *
 * Employee
 *   - fields: name, baseSalary
 *   - method: calculateSalary() -> baseSalary return করবে
 *
 * Manager extends Employee
 *   - extra field: teamSize
 *   - calculateSalary() override করবে -> super.calculateSalary() call করে
 *     তার সাথে (teamSize * 1000) bonus যোগ করে return করবে
 *
 * SeniorManager extends Manager
 *   - extra field: projectCount
 *   - calculateSalary() override করবে -> super.calculateSalary() call করে
 *     তার সাথে (projectCount * 5000) bonus যোগ করে return করবে
 *
 * Demo.java থেকে একটা SeniorManager object বানিয়ে calculateSalary() call করে
 * final salary print করো।
 *
 * Output (name=Rahim, baseSalary=30000, teamSize=4, projectCount=2):
 * Rahim's final salary: 44000
 */
public class Demo {
    public static void main(String[] args) {
        // TODO: Employee, Manager, SeniorManager class বানাও (super keyword ব্যবহার করে)
        // TODO: SeniorManager object create করে calculateSalary() print করো
    }
}
