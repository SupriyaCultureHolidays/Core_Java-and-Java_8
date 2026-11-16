// constructor-এ ShippingService নিবে। Approach 2 (Qualifier)-এর জন্য constructor
// parameter-এর উপর @Qualifier("fastShipping") বসাও (bean-এর default নাম class name-এর
// প্রথম letter lowercase করে — "fastShipping")
public class ShippingClient {

    // private ShippingService shippingService;

    // constructor(ShippingService shippingService)

    // process() — System.out.println("Shipping via: " + shippingService.ship())
}
