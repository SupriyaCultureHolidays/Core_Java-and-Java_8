public interface Vehicle {
    void start();
    void stop();
    default void fuelType() {
        System.out.println("Dont know");
    };

}
