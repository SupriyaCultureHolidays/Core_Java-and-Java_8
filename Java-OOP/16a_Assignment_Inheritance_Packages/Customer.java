public class Customer extends User {
    public String address;
    public int orderCount;
    
    static {
        System.out.println("Customer String.........");
    }

    Customer(String name, double phone, String address, int orderCount) {
        super(name, phone);
        this.address = address;
        this.orderCount = orderCount;
    }

    public void placeOrder(String item) {
        System.out.println("PlaceOrder : " + item);
    }
}
