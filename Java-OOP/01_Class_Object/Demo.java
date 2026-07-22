/*
 * Question 1 (Employee)
 * একটি Employee class তৈরি করো।
 * Properties: id, name, department, salary
 * Method: displayInfo()
 * Demo.java থেকে ৩টি Employee object তৈরি করে print করো।
 *
 * Output:
 * ID: 1, Name: Rahim, Department: IT, Salary: 40000
 * ID: 2, Name: Karim, Department: HR, Salary: 35000
 * ID: 3, Name: Sumi, Department: Finance, Salary: 50000
 */
public class Demo {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Supriya", "IT", 30000);
        employee1.displayInfo();
        System.out.println();

    }
}
