public class Student {
    static int counter=0;
    Student(){
        counter++;
    }
    void display(){
        System.out.println(counter);
    }
}
