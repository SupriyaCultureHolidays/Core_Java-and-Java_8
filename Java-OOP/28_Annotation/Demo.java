/*
 * Question 27 (27_Annotation) — Deprecated and Override
 *
 * Device class-এ একটা পুরনো method oldTurnOn() রাখো, @Deprecated দিয়ে
 * mark করো। SmartDevice সেটাকে @Override দিয়ে override করে নতুন
 * behavior দেখাবে।
 *
 * Output:
 * SmartDevice turned on (new way)
 */
public class Demo {
    public static void main(String[] args) {
        Device d = new Device();
        d.oldTurnOn();

        SmartDevice sd = new SmartDevice();
        sd.oldTurnOn();

    }
}
