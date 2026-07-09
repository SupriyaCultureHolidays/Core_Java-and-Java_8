
/*
 * Question 39 (39_Collection_API) — Collection Overview
 *
 * java.util.Collection-এর একটা basic উদাহরণ দাও — List<String>
 * ব্যবহার করে কয়েকটা নাম add করো, print করো।
 *
 * Output:
 * [Rahim, Karim, Sumi]
 */
import java.util.ArrayList;
import java.util.List;
public class Demo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        //add new element
        names.add("Rahim");
        names.add("Karim");
        names.add("Sumi");

        // replace or update exiting element
        names.add(1,"Supriya");
        names.set(3, "Anima");

        // get and length
        System.out.println(names.get(3));
        System.out.println(names.size());
        System.out.println(names.contains("Ani"));
        System.out.println("Anima".startsWith("Ani")); // vv for knowledge
        System.out.println(names.remove(3));

        System.out.println(names);

    }
}
