public class Demo {
    public  static void main(String[] args){
        User user = new User("Supriya", "9002224844", "haldarsupriya22@gmail.com", "Sup123@");
        user.login(); user.showProfile();

        Customer customer = new Customer("Anima", "7319481810", "Delhi", "animamanna62@gmail.com", "ani123@", 4);
        customer.showProfile(); customer.placeOrder("Pen"); customer.login();

        PrimeCustomer primeCustomer = new PrimeCustomer("Apu", "8016056204", "Kakwip", "apu@gmail.com", "apu@", 5, 22);
        primeCustomer.showProfile();primeCustomer.placeOrder("Bat"); primeCustomer.login();
        
        DeliveryPartner d = new DeliveryPartner("Supriya", "9002224844", "haldarsupriya22@gmail.com", "Sup123@");
        d.trackLocation();
        d.status();
        
    }
}
