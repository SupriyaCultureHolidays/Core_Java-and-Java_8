public class Customer extends User {
    public String address;
    public int orderCount;

    static {
        System.out.println("Customer String.........");
    }

    public Customer(String name, String phone, String address, String email, String password, int orderCount) {
        super(name, phone, email, password);
        this.address = address;
        this.orderCount = orderCount;
    }

    public void placeOrder(String item) {
        System.out.println("PlaceOrder : " + item);
    }
}
