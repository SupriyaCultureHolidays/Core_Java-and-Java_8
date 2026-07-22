// Question 7 — @Primary ও @Qualifier (sec 14)
//
// প্রথমে FastShipping/StandardShipping-এ @Primary বা ShippingClient-এ @Qualifier —
// কিছুই না বসিয়ে চালিয়ে দেখো, Spring "expected single matching bean but found 2"
// error দেবে। তারপর দুইটা approach আলাদা করে try করো (একবারে একটাই বসাও):
//   Approach 1: FastShipping ক্লাসে @Primary
//   Approach 2: @Primary সরিয়ে ShippingClient constructor-এ @Qualifier("fastShipping")
//
// Output:
// Shipping via: Fast Shipping
public class Demo {
    public static void main(String[] args) {
        // 1. ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        // 2. ShippingClient client = context.getBean(ShippingClient.class);
        // 3. client.process();
    }
}
