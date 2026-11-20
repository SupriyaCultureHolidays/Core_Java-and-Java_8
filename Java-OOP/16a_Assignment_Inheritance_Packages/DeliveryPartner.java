public class DeliveryPartner extends User implements Trackable, Payable {

    DeliveryPartner(String name, String phone, String email, String password) {
        super(name, phone, email, password);
    }

    public void trackLocation() {
        System.out.println("Track Location");
    }

    public void receivePayment(double amount) {
        System.out.println("Receive Payment");
    }

    // @Override
    // একই নামের default method দুটি Interface-এ থাকলে implementing class-কে নিজের
    // method override করে conflict resolve করতে হয়।
    public void status() {
        Payable.super.status();
        // Trackable = কোন Interface থেকে method নিতে চাও।
        // super = সেই Interface-এর default implementation।
        // status() = যে method call করতে চাও।
    }

}
