/*
 * Extra Practice (Stream) Q2 — filter() + map() (String)
 *
 * List<String> নাও: "Rahim", "Karim", "Amit", "Sumi", "Rohan"
 * stream() ব্যবহার করে যাদের নাম "R" দিয়ে শুরু, শুধু তাদের filter করো,
 * তারপর map() দিয়ে uppercase বানাও, শেষে print করো।
 *
 * Output:
 * [RAHIM, ROHAN]
 */

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> names = List.of("Rahim", "Karim", "Amit", "Sumi", "Rohan");
        List<String> upname =  names.stream().filter(name -> name.startsWith("R")).map(name -> name.toUpperCase()).toList();
        System.out.println(upname);
    }
}
