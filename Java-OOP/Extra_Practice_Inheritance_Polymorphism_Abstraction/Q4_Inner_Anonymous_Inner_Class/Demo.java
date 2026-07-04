/*
 * Extra Practice Q4 — Inner Class + Anonymous Inner Class (একসাথে)
 *
 * Part A: Inner Class
 *   Outer class Car
 *     - private field: model ("Tesla Model 3")
 *     - non-static inner class Engine
 *         - method: start() -> outer class-এর "model" field access করে
 *           print করবে: "Model 3's engine started for Tesla Model 3"
 *           (মানে Outer.this.model ব্যবহার করে outer field access করতে হবে)
 *
 * Part B: Anonymous Inner Class
 *   একটা interface Alert বানাও যার একটাই method: trigger()
 *   Demo.java-র main() এর ভেতরে, আলাদা কোনো class না বানিয়ে,
 *   anonymous inner class দিয়ে Alert implement করো যেখানে trigger()
 *   print করবে: "Alert! Battery low"
 *
 * main() থেকে দুটোই call করো — প্রথমে Car -> Engine.start(),
 * তারপর Alert.trigger() (anonymous object দিয়ে)।
 *
 * Output:
 * Model 3's engine started for Tesla Model 3
 * Alert! Battery low
 */
public class Demo {
    public static void main(String[] args) {
        // TODO: Car class-এর ভেতরে non-static Engine inner class বানাও, তারপর call করো
        // TODO: Alert interface বানাও, main()-এর ভেতরে anonymous inner class দিয়ে implement করে trigger() call করো
    }
}
