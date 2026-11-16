# Spring & Spring Boot Practice Questions (Module-wise)

SpringBoot.html-এ ১০৫টা section আছে, কিন্তু Java-OOP-এর মতো প্রতি section-এ আলাদা প্রশ্ন না
রেখে এখানে **module-wise** ভাগ করা হয়েছে — কারণ Spring-এর ছোট concept একা দাঁড়ায় না
(server/DB/context লাগে), module একসাথে হলেই একটা মানে-বহ runnable প্রশ্ন/project হয়।
প্রশ্নের হেডিং-এর প্যারেনথেসিসে দুটো জিনিস লেখা আছে — ফোল্ডার নাম (যেখানে সমাধান লিখবা,
Java-OOP-এর মতোই প্রতি প্রশ্নের আলাদা ফোল্ডার) আর কোন SpringBoot.html section (sec)
কভার করছে। কিছু section pure theory/recap — সেগুলোর আলাদা প্রশ্ন/ফোল্ডার নেই, ওগুলো শুধু
SpringBoot.html-এ পড়ে নিতে হবে (module-এর শুরুতে নোট করা আছে)। ফোল্ডারগুলো scaffold-only
(comment দিয়ে guide করা, method body/annotation নিজে লিখবা)।

Java-OOP/Questions.md-এর মতোই — এখানে কোনো **solution code নেই**, শুধু প্রশ্ন + sample
output। Maven project setup ও run করাটাও নিজে করতে হবে (কোনো pom.xml দেওয়া হয়নি)।

---

## Module 1 — Core Spring: IoC, DI ও Bean (sec 1–17)

**শুধু পড়ে নেওয়ার (কোড লাগবে না):** sec 3 (Web Framework কেন দরকার), sec 4 (Spring
Ecosystem পরিচিতি), sec 9 (IoC/DI Recap)।

### Question 1 (01_Tight_Loose_Coupling, sec 1) — Tight vs Loose Coupling

একটা `PaymentProcessor` class লিখো যেটা ভিতরে সরাসরি `new CreditCardProcessor()` বানিয়ে
ব্যবহার করে (tight coupling)। এরপর সেটাকে refactor করো — একটা `PaymentGateway` interface
বানাও, `PaymentProcessor` constructor দিয়ে `PaymentGateway` নেবে, আর `UpiProcessor` নামে
আরেকটা implementation বানাও। `PaymentProcessor`-এর ভিতরের কোড না বদলে শুধু constructor-এ
আলাদা implementation পাস করে দুইবার চালাও।

**Output:**
```
Paid via Credit Card
Paid via UPI
```

---

### Question 2 (02_Dependency_Injection_Types, sec 2) — Dependency Injection প্রকারভেদ (Manual, Spring ছাড়া)

Question 1-এর `PaymentGateway` নিয়েই — একটা class-কে ৩ রকম ভাবে dependency দাও (এখনও
Spring লাগবে না, ম্যানুয়ালি): constructor injection, setter injection, field injection
(reflection ছাড়া field injection বাস্তবে সম্ভব না, তাই এটার জন্য field-টা package-private
রেখে সরাসরি assign করে দেখাও)। তিনটার পার্থক্য নিজের ভাষায় একটা comment-এ লিখো।

**Output:**
```
Constructor Injection -> Paid via UPI
Setter Injection -> Paid via UPI
Field Injection -> Paid via UPI
```

---

### Question 3 (03_First_Spring_Project_XML_Bean, sec 5, 6, 7) — প্রথম Spring Project + XML Bean

নিজে একটা Maven project বানাও (spring-context dependency যোগ করো)। একটা সাধারণ
`Greeter` class বানাও (একটা `greet(String name)` method থাকবে)। `beans.xml`-এ এটাকে bean
হিসেবে define করো, `ClassPathXmlApplicationContext` দিয়ে load করো, `context.getBean(...)`
দিয়ে নিয়ে `greet()` call করো।

**Output:**
```
Hello, Rahim! Welcome to Spring.
```

---

### Question 4 (04_XML_Bean_Wiring, sec 8) — XML দিয়ে Bean-এর ভিতরে Bean Inject করা

`UserService` ও `NotificationService` — দুইটা আলাদা class, `UserService`-এর ভিতরে
`NotificationService` লাগবে। দুইটাকেই `beans.xml`-এ define করো, `<constructor-arg
ref="..."/>` বা `<property ref="..."/>` দিয়ে `UserService`-এর ভিতরে `NotificationService`
inject করো — কোনো `new` কোথাও লিখবা না, Spring container সব বানাবে।

**Output:**
```
User Rahim created. Notification sent: Welcome Rahim!
```

---

### Question 5 (05_Annotation_Based_Config, sec 10, 11) — Annotation-Based Config

Question 4-এর `UserService`/`NotificationService`-টাই আবার বানাও, কিন্তু এবার XML ছাড়া —
`@Configuration` + `@ComponentScan` দিয়ে একটা `AppConfig` class, দুই class-এ `@Component`,
constructor-এ `@Autowired`। `AnnotationConfigApplicationContext` দিয়ে চালাও। XML ভার্সনের
সাথে code-এর পরিমাণ তুলনা করে একটা comment লিখো।

**Output:**
```
User Rahim created. Notification sent: Welcome Rahim!
```

---

### Question 6 (06_Stereotype_Annotations, sec 12) — Stereotype Annotations

Question 5-এর class গুলোয় প্লেইন `@Component`-এর বদলে ঠিক stereotype বসাও —
`NotificationService`-এ `@Service`, আর একটা নতুন fake `UserRepository` class বানিয়ে
তাতে `@Repository` বসাও (`UserService` এখন `UserRepository` + `NotificationService`
দুটোই নেবে)। ফলাফল আগের মতোই হবে, কিন্তু annotation দিয়ে layer-এর role স্পষ্ট হবে।

**Output:**
```
User Rahim saved. Notification sent: Welcome Rahim!
```

---

### Question 7 (07_Primary_Qualifier, sec 14) — @Primary ও @Qualifier

একটা `ShippingService` interface, দুইটা implementation — `FastShipping`, `StandardShipping`।
একটা class constructor-এ `ShippingService` চায় — প্রথমে চালিয়ে দেখো Spring ambiguous bean
error দেয়। তারপর একটাতে `@Primary` বসিয়ে fix করো। এরপর `@Primary` সরিয়ে constructor
parameter-এ `@Qualifier("fastShipping")` দিয়ে নাম ধরে fix করো — দুইটা approach-ই try করো।

**Output:**
```
Shipping via: Fast Shipping
```

---

### Question 8 (08_Bean_Lifecycle, sec 15) — Bean Lifecycle

একটা `DatabaseConnection` class বানাও (কোনো `@Component` না) — `connect()` method-এ
"Connecting..." তারপর "Connection ready" print করো, `disconnect()` method-এ
"Disconnecting..." print করো। `AppConfig`-এ `@Bean(initMethod = "connect", destroyMethod =
"disconnect")` দিয়ে register করো (এই কোর্সে `@PostConstruct`/`@PreDestroy` ব্যবহার করা হয়নি
কারণ এর জন্য আলাদা dependency লাগে — sec 15 দেখো)। `main()`-এ context বানিয়ে bean নেওয়ার
পর `context.close()` call করো, lifecycle log-এর order দেখো।

**Output:**
```
Connecting...
Connection ready
Disconnecting...
```

---

### Question 9 (09_Component_vs_Bean, sec 16) — @Component বনাম @Bean

একটা `IdGenerator` class বানাও যেটাকে "third-party class" ধরে নেবে (এতে `@Component`
বসাবা না)। `AppConfig`-এ একটা `@Bean` method লিখে এটাকে register করো। আরেকটা class-এ
constructor injection দিয়ে এই bean নিয়ে ব্যবহার করো। কেন `@Component` দিয়ে এটা করা যেত
না (বা কষ্টকর হতো) সেটা একটা comment-এ লিখো।

**Output:**
```
Generated ID: 1000
Generated ID: 1001
```

---

## Mini Project (10_Core_DI_Mini_CRUD_Project, sec 17) — Employee Directory, Layered Architecture (In-Memory DB)

Scaffold: [10_Core_DI_Mini_CRUD_Project/MainApp.java](10_Core_DI_Mini_CRUD_Project/MainApp.java)

Module 1-এর সবগুলো concept (Bean, DI, Stereotype, @Qualifier/@Primary, Bean Lifecycle,
@Component vs @Bean, Layered Architecture) এক project-এ — বিস্তারিত ফোল্ডারের
`MainApp.java`-র header comment-এ।

---
