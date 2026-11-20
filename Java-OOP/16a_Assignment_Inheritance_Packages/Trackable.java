public interface Trackable {
    void trackLocation();

    default void status() {
        System.out.println("Trackable Status");
    }
}