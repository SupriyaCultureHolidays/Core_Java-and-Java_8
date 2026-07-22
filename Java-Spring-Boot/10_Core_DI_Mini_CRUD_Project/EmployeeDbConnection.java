// এই ক্লাসে কোনো annotation বসাবা না (@Component না) — lifecycle callback-এর জন্য
// @PostConstruct/@PreDestroy-এ আলাদা dependency লাগে (এই কোর্সে এড়ানো হয়েছে, sec 15)।
// এর বদলে AppConfig-এ @Bean(initMethod=..., destroyMethod=...) দিয়ে register করতে হবে —
// এটাই কারণ কেন এই ক্লাস @Component না হয়ে @Bean দিয়ে বানাতে হচ্ছে (sec 16)
public class EmployeeDbConnection {

    // private Map<Integer, Employee> store = new HashMap<>();

    // connect() — store = new HashMap<>() দিয়ে ইনিশিয়ালাইজ করো, "Employee store ready" print করো
    //     (AppConfig-এ initMethod হিসেবে এই method-এর নাম দিতে হবে)

    // getStore() — Map<Integer, Employee> রিটার্ন করো, InMemoryEmployeeRepository এটা ব্যবহার করবে

    // disconnect() — "Employee store closed" print করো
    //     (AppConfig-এ destroyMethod হিসেবে এই method-এর নাম দিতে হবে)
}
