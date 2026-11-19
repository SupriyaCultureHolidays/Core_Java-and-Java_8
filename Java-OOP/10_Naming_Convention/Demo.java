/*
 * Question 10 (10_Naming_Convention) — Employee (Fix the Names)
 *
 * নিচের code-টা Java naming convention ভেঙে লেখা। নিয়ম মেনে Employee.java-তে আবার লেখো:
 *
 * class employee {
 *     static final int maxleavedays = 20;
 *     String Employee_Name;
 *     int MonthlySalary;
 *     employee(String Employee_Name, int MonthlySalary) { ... }
 *     int Calculate_yearly_salary() { return MonthlySalary * 12; }
 *     void PRINT() { ... }
 * }
 *
 * নিয়ম:
 * - Class → PascalCase (Employee)
 * - variable ও method → camelCase (employeeName, calculateYearlySalary())
 * - constant (static final) → UPPER_SNAKE_CASE (MAX_LEAVE_DAYS)
 * - package → সব lowercase (com.company.hr)
 *
 * Output:
 * Employee: Rahim, Monthly: 40000, Yearly: 480000, Max Leave: 20
 */
public class Demo {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Supriya");
        emp1.display();

        Employee emp2 = new Employee("Puja");
        emp2.display();
        
    }
}
