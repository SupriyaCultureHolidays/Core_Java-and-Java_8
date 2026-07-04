public class Outer {

    private int age = 5;
    // এখানে একটা non-static Inner class বানাও
    public class InnerOuter {
        void display(){
            age++;
            System.out.println(age);
        }
    }
}
