public class Employee {
    String name;
    static String companyName = "Corp";
    Employee(String name){
        this.name = name;
    }

    void display(){
        System.out.println(this.name + "  " + this.companyName);
    }
}
