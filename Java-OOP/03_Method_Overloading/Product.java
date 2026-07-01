public class Product {
    int id;
    String name;
    int price;
    int quantity;

    Product(int id, String name, int price, int quantity){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void display(){
        System.out.println(" Product: " + this.name + "Price: " + 
        this.price + "Qty: " + this.quantity + "Total: " + (this.price * this.quantity));
    }
}
