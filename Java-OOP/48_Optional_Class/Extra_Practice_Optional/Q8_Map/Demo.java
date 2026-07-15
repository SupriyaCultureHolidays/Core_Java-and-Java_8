/*
 * Extra Practice (Optional) Q8 — map()
 *
 * Optional-এর ভিতরের value কে transform করতে চাইলে map() ব্যবহার হয়
 * (ঠিক Stream-এর map()-এর মতোই, কিন্তু এখানে single value-এর উপর কাজ করে)।
 *
 * Optional<String> name = Optional.of("rahim");
 *
 * map() ব্যবহার করে:
 * ১) uppercase বানাও
 * ২) তারপর length বের করো (আরেকটা map() চেইন করে)
 *
 * শেষে orElse(0) দিয়ে value বের করে print করো।
 *
 * Output:
 * RAHIM
 * 5
 */

import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("rahim");

        // TODO: map(String::toUpperCase) দিয়ে uppercase বানাও, orElse("") দিয়ে print
        // করো
        System.out.println(name.map(n -> n.toUpperCase()).orElse("not found"));
        // TODO: এবার name.map(String::toUpperCase).map(String::length) চেইন করে
        // orElse(0) দিয়ে length print করো
        System.out.println(name.map(String::toUpperCase).map(String::length).get());

    }
}
