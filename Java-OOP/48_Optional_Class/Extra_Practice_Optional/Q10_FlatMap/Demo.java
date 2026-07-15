/*
 * Extra Practice (Optional) Q10 — flatMap()
 *
 * ধরো একটা method আছে যেটা নিজেই Optional return করে:
 *
 * static Optional<String> getNickName(String name) {
 *     if (name.equals("Rahim")) return Optional.of("Ray");
 *     return Optional.empty();
 * }
 *
 * এখন যদি Optional<String> name = Optional.of("Rahim") থাকে, আর তুমি
 * name.map(Demo::getNickName) করো — তাহলে result হবে
 * Optional<Optional<String>> (Optional-এর ভিতরে Optional, যেটা ঝামেলার)।
 *
 * এই সমস্যা এড়াতে flatMap() ব্যবহার করো — এটা নিজেই ভিতরের Optional
 * "unwrap" করে দেয়, ফলাফল হয় সরাসরি Optional<String>।
 *
 * flatMap() দিয়ে nickname বের করো, orElse("No nickname") দিয়ে print করো।
 *
 * Output:
 * Ray
 */

import java.util.Optional;

public class Demo {
    static Optional<String> getNickName(String name) {
        if (name.equals("Rahi")) {
            return Optional.of("Ray");
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        Optional<String> name = Optional.of("Rahim");

        // TODO: name.flatMap(Demo::getNickName) ব্যবহার করো
        System.out.println(name.flatMap(Demo::getNickName));
        // TODO: orElse("No nickname") দিয়ে print করো
        System.out.println(name.flatMap(Demo::getNickName).orElse("No nickname"));

    }
}
