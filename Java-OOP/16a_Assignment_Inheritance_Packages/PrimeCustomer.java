public class PrimeCustomer extends Customer {
    int discountPercent;

    static {
        System.out.println("PrimeCustomer String.........");
    }

    PrimeCustomer(String name, double phone, String address, int orderCount, int discountPercent) {
        super(name, phone, address, orderCount);
        this.discountPercent = discountPercent;
    }

    @Override
    public void placeOrder(String items) {
        System.out.println("Prime order: " + items + " with " + this.discountPercent + "% discount");
    }

    @Override
    public void showProfile() {
        super.showProfile();
        System.out.println("Prime Member");
    }
}
