public class Student {

    // this keyword ব্যবহার করে constructor/method লিখো
    private String name;
    private int age;

    void setName(String name){
        this.name = name;
    }
    void getName(){
        System.out.println(this.name); 
    }

    void setAge(int age){
        this.age = age;
    }
    void getAge(){
        System.out.println(this.age);
    }
}
