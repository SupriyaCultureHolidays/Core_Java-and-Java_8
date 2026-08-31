# Spring Framework Full Course — Practice Questions

প্রতিটা lecture-এর নিজস্ব `Lecture NN/Assignment/` subfolder-এ তার assignment থাকে —
ঠিক lecture-এর নিজস্ব `code/` আর `notes/` subfolder-এর পাশাপাশি একটা তৃতীয় subfolder
হিসেবে। যেখানে হাতে-কলমে কোড লেখার কিছু আছে, সেখানে **scaffold-only** class/interface
(class/interface-এর গঠন + কোথায় কী বসবে তার comment-guidance, কোনো ready solution
নেই) — পুরো method body ও annotation নিজে বসাতে হবে। যেখানে লেকচারটা pure থিওরি বা
tooling-exploration, সেখানে শুধু `Questions.md`-এ প্রশ্ন লেখা আছে, কোনো `.java` স্ক্যাফোল্ড
নেই।

এই ফাইলটা (top-level `Questions.md`) শুধু পুরো কোর্স জুড়ে কোন lecture-এ কী assignment
আছে তার একটা index — বিস্তারিত প্রশ্ন প্রতিটা lecture-এর নিজের `Assignment/Questions.md`
(বা সরাসরি `.java` ফাইলের হেডার কমেন্টে) পাওয়া যাবে।

---

## Lecture 01 — Introduction to Spring Framework
থিওরি-only, কোনো কোড নেই। → [Lecture 01/Assignment/Questions.md](Lecture%2001/Assignment/Questions.md)

## Lecture 02 — প্রথম Spring Boot Application
নিজে Spring Initializr দিয়ে একটা "Portfolio Info API" বানাও (৩+ GET endpoint, পরে
`server.port` বদলে verify করা) — কোর্সের নিজের `demo`/`HelloController` না,
ভিন্ন domain।
→ [Lecture 02/Assignment/PortfolioController.java](Lecture%2002/Assignment/PortfolioController.java)

## Lecture 03 — Maven Deep-Dive
Spring ছাড়া একটা plain Maven project বানাও, mvnrepository.com থেকে dependency
যোগ করো, `.m2` explore করো, প্রতিটা lifecycle phase আলাদা করে রান করে observe করো।
→ [Lecture 03/Assignment/App.java](Lecture%2003/Assignment/App.java)

## Lecture 04 — Dependency Injection ও IoC
কোর্সের নিজের `CoreDemo` (OrderService/NotificationService)-এর journey —
tight coupling → interface → একাধিক implementation → constructor/setter injection →
IoC — হুবহু একই ধাপে, নতুন domain-এ (Payment/Checkout system) নিজে টাইপ করে practice
করো।
→ [Lecture 04/Assignment/](Lecture%2004/Assignment/)
(`PaymentGateway.java`, `CreditCardPayment.java`, `UpiPayment.java`,
`NetBankingPayment.java`, `FakePayment.java`, `CheckoutService.java`, `Main.java`)

---

> সামনে আরও lecture-এর notes ([SpringBoot.html](../SpringBoot.html)) যোগ হলে, এখানে সেই lecture-এর
> জন্য একটা নতুন entry এবং প্রয়োজনে `Lecture NN/Assignment/` যোগ হবে।
