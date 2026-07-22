// এই ক্লাসে কোনো annotation বসাবা না (@Component না) — কারণ lifecycle callback
// (@PostConstruct/@PreDestroy) ব্যবহার করতে হলে আলাদা dependency (jakarta.annotation-api)
// লাগে, যা এই কোর্সে এড়ানো হয়েছে (sec 15)। এর বদলে AppConfig-এ @Bean(initMethod=...,
// destroyMethod=...) দিয়ে এই ক্লাসের bean বানাতে হবে — সেটাই sec 15/16-এ শেখানো আসল পদ্ধতি
public class DatabaseConnection {

    // connect() — "Connecting..." তারপর "Connection ready" print করো
    //     (AppConfig-এ initMethod হিসেবে এই method-এর নাম দিতে হবে)

    // disconnect() — "Disconnecting..." print করো
    //     (AppConfig-এ destroyMethod হিসেবে এই method-এর নাম দিতে হবে)
}
