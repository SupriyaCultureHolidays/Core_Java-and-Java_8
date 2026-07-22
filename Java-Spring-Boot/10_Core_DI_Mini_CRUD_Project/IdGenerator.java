// এটা ইচ্ছাকৃতভাবে plain class — কোনো @Component বসাবা না। ধরে নেও এটা একটা third-party
// library-র class, যার source code তুমি edit করতে পারো না — তাহলে bean বানাতে হলে
// @Component ব্যবহার করা সম্ভব না, AppConfig-এ @Bean method লিখে বানাতে হবে
// (@Component বনাম @Bean, sec 16)
public class IdGenerator {

    // private int counter = 1000;

    // nextId() — counter++ রিটার্ন করো
}
