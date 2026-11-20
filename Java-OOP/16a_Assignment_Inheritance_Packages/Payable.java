public interface Payable {
    void receivePayment(double amount);

    default void status() {
        System.out.println("Payable status");
    }
}
