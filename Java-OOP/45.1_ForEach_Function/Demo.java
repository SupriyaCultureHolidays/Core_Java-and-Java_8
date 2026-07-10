import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rahim", "Karim", "Sumi", "Rita", "Joy");

        // List forEach
        names.forEach((name) -> {
            System.out.println(name);
        });
        names.forEach(name -> System.out.println(name));

        // Method reference
        names.forEach(System.out::println);

        // Map forEach
        Map<String, Integer> employeMap = new HashMap<>();
        employeMap.put("Supriya", 100);
        employeMap.put("Arup", 300);
        employeMap.put("Sudip", 200);

        System.out.println(employeMap);

        employeMap.forEach((name, tag)->{
            System.out.println("Name : "+" "+ name+"tag : "+ tag);
        });
    }
}
