class Dog {
    String name;
    String breed;

    void bark() {
        System.out.println("Dog name : " + this.name + "Dog Breed : " + this.breed);
    }
}

class Demo {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Roki Bhai";
        dog1.breed = "Garmany";
        dog1.bark();
    }
}