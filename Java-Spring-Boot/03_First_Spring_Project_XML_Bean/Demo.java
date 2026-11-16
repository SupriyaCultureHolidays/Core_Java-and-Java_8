// Question 3 — প্রথম Spring Project + XML Bean (sec 5, 6, 7)
//
// এই ফোল্ডারে কোনো pom.xml/Maven project নেই — নিজে বানাও (spring-context dependency
// যোগ করো, sec 6 দেখে)। beans.xml-এ Greeter bean define করার guidance কমেন্টে দেওয়া আছে।
//
// Output:
// Hello, Rahim! Welcome to Spring.
public class Demo {
    public static void main(String[] args) {
        // 1. ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 2. Greeter greeter = context.getBean(Greeter.class); // বা getBean("greeter", Greeter.class)
        // 3. System.out.println(greeter.greet("Rahim"));
    }
}
