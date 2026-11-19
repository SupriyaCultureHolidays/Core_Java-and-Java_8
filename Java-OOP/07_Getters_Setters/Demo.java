/*
 * Question 7 (07_Getters_Setters) — Laptop
 *
 * Laptop class — brand (String), ram (int), ssd (int), processor (String) সব private।
 *
 * - প্রতিটা field-এর জন্য getter ও setter লেখো (getBrand()/setBrand(), getRam()/setRam() ...)
 * - setRam(int ram) → ram <= 0 হলে "Invalid RAM" print করবে, set করবে না
 * - Default constructor দিয়ে object বানিয়ে setter দিয়ে value বসাও
 * - Demo.java-তে getter দিয়ে পড়ে print করো (Laptop-এ display() রাখবে না)
 * - তারপর setRam(-8) আর setRam(32) করে আবার print করো
 *
 * Output:
 * Brand: Dell, RAM: 16GB, SSD: 512GB, Processor: i5
 * Invalid RAM
 * After upgrade -> RAM: 32GB
 */
public class Demo {
    public static void main(String[] args) {
        Laptop l = new Laptop("16GB", "512GB", "i5");
        l.display();
        l.setBrand("Asus");
        l.display();
    }
}
