# Java OOP Practice Questions (Backend Mindset)

প্রতিটা প্রশ্নের জন্য ফোল্ডার নাম্বার = প্রশ্ন নাম্বার নয় সবসময় — Q1 থেকে Q24 পর্যন্ত ফোল্ডার নাম্বার মিলে যায় (Q1 → 01_Class_Object, Q2 → 02_Methods ...), কিন্তু 25_Extra_Practice_Inheritance_Polymorphism_Abstraction ফোল্ডার যুক্ত হওয়ায় Q25 থেকে ফোল্ডার নাম্বার প্রশ্ন নাম্বারের চেয়ে ১ বেশি (Q25 → 26_Interface ... Q47 → 48_Optional_Class, Final Project → 49_Record_Final_Project)। ফোল্ডার নাম্বার সবসময় প্রতিটা প্রশ্নের হেডিং-এর প্যারেনথেসিসে দেওয়া আছে। দুইটা sub-question আছে: Q35.2 → 37.2_Runnable, Q44.1 → 45.1_ForEach_Function।

---

## Question 1 (01_Class_Object) — Employee

একটি `Employee` class তৈরি করো।

Properties: `id, name, department, salary`
Method: `displayInfo()`

Demo.java থেকে ৩টি Employee object তৈরি করে print করো।

**Output:**
```
ID: 1, Name: Rahim, Department: IT, Salary: 40000
ID: 2, Name: Karim, Department: HR, Salary: 35000
ID: 3, Name: Sumi, Department: Finance, Salary: 50000
```

---

## Question 2 (02_Methods) — Bank Account

একটি `BankAccount` class তৈরি করো।

Properties: `accountNumber, holderName, balance`
Methods: `deposit(), withdraw(), checkBalance()`

deposit(amount) balance বাড়াবে ও নতুন balance print করবে। withdraw(amount) balance কমাবে। checkBalance() বর্তমান balance দেখাবে।

**Output (balance শুরুতে 1000):**
```
Deposited 200, New Balance: 1200
Withdrew 500, New Balance: 700
Current Balance: 700
```

---


## Question 3 (03_Method_Overloading) — Product Total (Overloading)

`Product` class (`id, name, price, quantity`)।

একই নামে তিনটা `calculateTotal()` method overload করো:
- `calculateTotal()` → price * quantity
- `calculateTotal(double discountPercent)` → discount বাদ দিয়ে total
- `calculateTotal(double discountPercent, int deliveryCharge)` → discount বাদ দিয়ে, delivery charge যোগ করে total

Demo.java থেকে তিনটাই call করো — compiler parameter দেখে ঠিক method বেছে নেবে (compile-time polymorphism)।
Bonus: শুধু return type আলাদা করে overload করলে কী error আসে দেখো।

**Output (Pen, price 10, qty 5):**
```
Total: 50
Total after 10% discount: 45.0
Total after 10% discount + 20 delivery: 65.0
```


---


## Question 4 (04_Stack_Heap_Memory) — Calculator (Stack vs Heap)

`Calculator` class — একটা field `int result`।

Demo.java-তে দুইটা static method লেখো:
- `addTenToNumber(int x)` → x-এ 10 যোগ করে print করবে (primitive — value-এর copy stack-এ যায়)
- `addTenToResult(Calculator c)` → c.result-এ 10 যোগ করবে (reference-এর copy যায়, কিন্তু object heap-এ একটাই)

তারপর:
1. `int x = 5;` → addTenToNumber(x) call করে আগে-পরে x print করো
2. `Calculator c1 = new Calculator(); c1.result = 5;` → addTenToResult(c1) call করে আগে-পরে print করো
3. `Calculator c2 = c1; c2.result = 100;` → c1.result print করো (দুইটা reference, একটাই object)

Comment-এ লেখো: x কেন বদলালো না, কিন্তু c1.result কেন বদলালো?

**Output:**
```
Before: x = 5
Inside method: x = 15
After: x = 5
Before: c1.result = 5
After: c1.result = 15
c1.result after c2 change: 100
```


---


## Question 5 (05_Static) — Student (static variable, method, block)

`Student` class
- `name` → instance variable (প্রতিটা student-এর আলাদা)
- `static String schoolName` → সব student-এর জন্য একটাই
- `static int count` → constructor-এ count++
- `static { }` block → schoolName = "ABC School" set করবে ও "Static block executed" print করবে
- `static void showSchoolInfo()` → schoolName আর count print করবে (object ছাড়া `Student.showSchoolInfo()` দিয়ে call)
- `study()` → instance method

Bonus: static method-এর ভেতর থেকে `name` বা `this` use করলে কী error আসে দেখো।

**Output:**
```
Static block executed
Rahim is studying
Karim is studying
School: ABC School, Total students: 2
```


---


## Question 6 (06_Encapsulation) — Employee Salary Protection

`Employee` class — `id, name, department, salary` সব `private`।

- Constructor দিয়ে id, name, department set হবে
- `setSalary(int salary)` → salary < 0 হলে "Invalid salary!" print করবে, set করবে না
- `getSalary()` → salary return করবে
- `giveRaise(int percent)` → salary বাড়াবে
- `display()`

Demo.java-তে `emp.salary = 5000;` লিখে দেখো compile error আসে — তারপর মুছে দাও। বাইরে থেকে শুধু method দিয়েই data বদলানো যাবে।

**Output:**
```
Invalid salary!
ID: 1, Name: Supriya, Department: IT, Salary: 45000
After 10% raise: 49500
```


---


## Question 7 (07_Getters_Setters) — Laptop

`Laptop` class — `brand (String), ram (int), ssd (int), processor (String)` সব `private`।

- প্রতিটা field-এর জন্য getter ও setter লেখো (`getBrand()/setBrand()`, `getRam()/setRam()` ...)
- `setRam(int ram)` → ram <= 0 হলে "Invalid RAM" print করবে, set করবে না
- Default constructor দিয়ে object বানিয়ে setter দিয়ে value বসাও
- Demo.java-তে getter দিয়ে পড়ে print করো (Laptop-এ display() রাখবে না)
- তারপর `setRam(-8)` আর `setRam(32)` করে আবার print করো

**Output:**
```
Brand: Dell, RAM: 16GB, SSD: 512GB, Processor: i5
Invalid RAM
After upgrade -> RAM: 32GB
```


---


## Question 8 (08_This_Keyword) — Student (this keyword)

`Student` class (`name, age`) — `this` keyword-এর ৪টা ব্যবহার দেখাও:
1. `this.name = name` → field আর parameter-এর নাম এক হলে পার্থক্য করা
2. `this("Unknown", 0)` → default constructor থেকে parameterized constructor call (constructor chaining)
3. `setName()`/`setAge()` → `return this;` করবে, যাতে `s.setName("Karim").setAge(22)` এভাবে chain করা যায়
4. `isSameAge(Student other)` → `this.age == other.age` দিয়ে current object-কে অন্য object-এর সাথে compare

**Output:**
```
Name: Rahim, Age: 20
Name: Unknown, Age: 0
Name: Karim, Age: 22
Rahim and Karim same age? false
```


---


## Question 9 (09_Constructors) — BankAccount (৩ রকম Constructor)

`BankAccount` class (`accountNumber, holderName, balance`) — ৩ রকম constructor:
1. Default constructor → `this(0, "Unknown", 0)` দিয়ে chain করবে
2. Parameterized constructor → তিনটা value নেবে
3. Copy constructor → `BankAccount(BankAccount other)` অন্য account-এর value copy করবে

Method: `deposit(int amount)`, `display()`

Demo.java-তে তিনটা object বানাও। Copy-টাতে `deposit(4000)` করো — original-এ কোনো প্রভাব পড়বে না দেখাও।
Bonus: constructor-এর return type থাকে না কেন? `void BankAccount()` লিখলে কী হয়?

**Output:**
```
Account: 0, Holder: Unknown, Balance: 0
Account: 1245, Holder: Rahim, Balance: 1000
Copy -> Account: 1245, Holder: Rahim, Balance: 1000
After deposit in copy -> Original: 1000, Copy: 5000
```


---


## Question 10 (10_Naming_Convention) — Employee (Fix the Names)

নিচের code-টা Java naming convention ভেঙে লেখা। নিয়ম মেনে `Employee.java`-তে আবার লেখো:

```java
class employee {
    static final int maxleavedays = 20;
    String Employee_Name;
    int MonthlySalary;
    employee(String Employee_Name, int MonthlySalary) { ... }
    int Calculate_yearly_salary() { return MonthlySalary * 12; }
    void PRINT() { ... }
}
```

নিয়ম:
- Class → PascalCase (`Employee`)
- variable ও method → camelCase (`employeeName`, `calculateYearlySalary()`)
- constant (`static final`) → UPPER_SNAKE_CASE (`MAX_LEAVE_DAYS`)
- package → সব lowercase (`com.company.hr`)

**Output:**
```
Employee: Rahim, Monthly: 40000, Yearly: 480000, Max Leave: 20
```


---


## Question 11 (11_Anonymous_Object) — Student (Anonymous Object)

`Student` class (`name`), `static int count` (constructor-এ count++), `display()`।

- reference variable ছাড়া object বানিয়ে সাথে সাথে method call: `new Student("Rahim").display();`
- Demo.java-তে `static void printStudent(Student s)` লেখো, তাতে anonymous object pass করো: `printStudent(new Student("Karim"));`
- শেষে total count print করো
- Comment-এ লেখো: anonymous object-কে দ্বিতীয়বার কেন use করা যায় না, আর কখন এটা garbage collection-এর জন্য eligible হয়?

**Output:**
```
Student: Rahim
Student: Karim
Total students created: 2
```


---

## Question 12 (12_Inheritance) — Person → Employee

```
Person
  ↓
Employee
```

Person: `name, age`
Employee: `salary, department`

**Output:**
```
Name: Rahim, Age: 28, Salary: 40000, Department: IT
```

---


## Question 13 (13_Single_Multilevel_Inheritance) — Vehicle → Car → ElectricCar

```
Single:     Vehicle → Car
Multilevel: Vehicle → Car → ElectricCar
```

- Vehicle: `brand`
- Car: `model`
- ElectricCar (নতুন class): `batteryKwh`
- প্রতিটা constructor `super(...)` দিয়ে parent constructor call করবে
- `getDetails()` → String return করবে; child class override করে `super.getDetails()` এর সাথে নিজের field যোগ করবে

Demo.java-তে একটা Car আর একটা ElectricCar বানিয়ে print করো।

**Output:**
```
Brand: Toyota, Model: Corolla
Brand: Tesla, Model: Model 3, Battery: 75kWh
```


---


## Question 14 (14_Multiple_Inheritance_Interface) — Dog (Animal + Pet + Guard)

```
Animal (class)   Pet (interface)   Guard (interface)
       \               |               /
                      Dog
```

Java-তে class দিয়ে multiple inheritance হয় না (`class Dog extends Animal, Pet` ❌), কিন্তু interface দিয়ে হয়।

- Animal: `sound()`
- Pet (interface): `play()`
- Guard (interface): `guard()`
- `class Dog extends Animal implements Pet, Guard` → সব method override/implement করবে

Bonus (Diamond problem): Pet ও Guard দুইটাতেই `default void info()` রাখো — Dog-এ compile error দেখো, তারপর Dog-এ `info()` override করে `Pet.super.info()` দিয়ে solve করো।

**Output:**
```
Dog barks
Dog is playing fetch
Dog is guarding the house
```


---

## Question 15 (15_Method_Overriding) — Multilevel Overriding

```
Payment
  ↓
CreditCard
  ↓
UPI
```

সব `payment()` override করবে।

**Output:**
```
Paid using UPI
```

---


## Question 16 (16_Packages) — Animal Package

Animal, Dog, Cat কে `animals` package-এ রাখো, Demo বাইরে থেকে import করবে।

```
16_Packages/
├── Demo.java          (import animals.*;)
└── animals/
    ├── Animal.java    (package animals;)
    ├── Dog.java       (package animals;)
    └── Cat.java       (package animals;)
```

- package-এর বাইরে থেকে use করতে class ও method `public` হতে হবে — `public` না দিলে কী error আসে দেখো
- Demo.java-তে `Animal a = new Dog();` ও `Animal b = new Cat();` দিয়ে sound() call করো
- Compile/run (16_Packages ফোল্ডার থেকে): `javac animals/*.java Demo.java` → `java Demo`

**Output:**
```
Dog barks
Cat meows
```


---


## Question 17 (17_Polymorphism) — Employee Hierarchy

```
            Employee
          /    |     \
Developer   Tester   Manager
```

Developer, Tester, Manager — প্রতিটা Employee extend করে `work()` override করবে (runtime polymorphism)।
Demo.java-তে `Employee[]` array বানিয়ে তিনটা object রেখে loop-এ `work()` কল করো।

Bonus: Employee-তে `work(int hours)` overload করো — compile-time vs runtime polymorphism-এর পার্থক্য comment-এ লেখো।

**Output:**
```
Developer is writing code
Tester is testing application
Manager is managing team
```


---

## Question 18 (18_Dynamic_Method_Dispatch) — Abstract Shape

Abstract `Shape`, Method: `area()`

`Circle`, `Rectangle` implement করবে।

**Output:**
```
Circle Area: 78.5
Rectangle Area: 24.0
```

---

## Question 19 (19_Final_Keyword) — Bank Interest Rate

`BankAccount` class-এ `final` variable `BANK_NAME` ("XYZ Bank") ও `final` method `displayBankName()` রাখো।

**Output:**
```
Bank Name: XYZ Bank
```

---

## Question 20 (20_Object_Class) — equals, hashCode, toString

`Student` class (`id, name`) — `equals()`, `hashCode()`, `toString()` override করো।

**Output:**
```
Student1 equals Student2: true
Student{id=1, name=Rahim}
```

---

## Question 21 (21_Upcasting_Downcasting) — Animal to Dog

`Animal` → `Dog` (extra method `fetch()`)। `Animal a = new Dog();` দিয়ে upcast, `(Dog) a` দিয়ে downcast করো।

**Output:**
```
Dog is fetching the ball
```

---

## Question 22 (22_Abstract_Class) — Abstract Employee

Abstract `Employee`, abstract method `calculateSalary()`। `Manager`, `Developer` override করবে।

**Output:**
```
Manager Salary: 60000
Developer Salary: 45000
```

---

## Question 23 (23_Inner_Class) — Outer and Inner

`Outer` class-এর ভেতরে non-static `Inner` class, যেটা outer-এর private field access করবে।

**Output:**
```
Accessing outer field from inner class: Hello from Outer
```

---

## Question 24 (24_Anonymous_Inner_Class) — Anonymous Greeting

`Greeting` interface, Demo.java-তে anonymous inner class দিয়ে implement করো (আলাদা class ছাড়া)।

**Output:**
```
Hello from Anonymous Class!
```

---

## Question 25 (26_Interface) — Vehicle Interface

`Vehicle` interface (`start(), stop()`, default method `fuelType()`)। `Car`, `Bike` implement করবে।

**Output:**
```
Car started
Car stopped
Bike started
Bike stopped
```

---

## Question 26 (27_Enum) — Season Enum

`Season` enum (`SUMMER, WINTER, SPRING, AUTUMN`), switch দিয়ে description print করো।

**Output:**
```
Summer is hot
```

---

## Question 27 (28_Annotation) — Deprecated and Override

`Device`-এ `@Deprecated` method, `SmartDevice`-এ `@Override` দিয়ে override।

**Output:**
```
SmartDevice turned on (new way)
```

---

## Question 28 (29_Functional_Interface) — Calculator

`@FunctionalInterface` সহ `Calculator` interface, single abstract method `operate()`, lambda দিয়ে implement।

**Output:**
```
Result: 15
```

---

## Question 29 (30_Lambda_Expression) — Greet and Sum

`Greetable` interface lambda দিয়ে implement, আরেকটা return-value soho lambda দিয়ে sum হিসাব।

**Output:**
```
Hello, Rahim!
Sum: 30
```

---

## Question 30 (31_Exception_Handling) — Multiple Catch

`ArithmeticException` ও `ArrayIndexOutOfBoundsException` আলাদা catch block দিয়ে handle করো।

**Output:**
```
Arithmetic Exception caught: / by zero
Array Index Exception caught: Index out of bounds
```

---

## Question 31 (32_Custom_Exception) — Insufficient Balance

Custom checked exception `InsufficientBalanceException`। `BankAccount.withdraw()` balance কম থাকলে throw করবে।

**Output:**
```
Insufficient Balance!
```

---

## Question 32 (33_Throws_Keyword) — File Reading

`FileService.readFile()` — `throws IOException` declare করবে, Demo-তে try-catch দিয়ে handle।

**Output:**
```
File not found!
```

---

## Question 33 (34_User_Input) — Scanner and BufferedReader

`Scanner` দিয়ে name, `BufferedReader` দিয়ে age input নেও।

**Output:**
```
Name: Rahim, Age: 25
```

---

## Question 34 (35_Try_With_Resources) — AutoCloseable

`FileHandler implements AutoCloseable`, try-with-resources দিয়ে automatic close() দেখাও।

**Output:**
```
Resource opened
Resource closed automatically
```

---


## Question 35 (36_Threads) — Extending Thread

`MyThread extends Thread` — `run()` override করবে, current thread-এর নাম print করবে।

- ৩টা MyThread object বানিয়ে `start()` করো
- main thread-ও একটা line print করবে
- `run()` সরাসরি call করলে আর `start()` করলে কী পার্থক্য হয় দেখো (নতুন thread হয় কি?)

**Output (order বদলাতে পারে):**
```
Main thread running
Thread-0 running
Thread-1 running
Thread-2 running
```


---


## Question 35.2 (37.2_Runnable) — Runnable Interface

- `TaskRunnable implements Runnable` → `new Thread(task, "Worker-1").start()`
- একই TaskRunnable object দুইটা Thread-এ দাও ("Worker-1", "Worker-2")
- Lambda দিয়ে Runnable: `Runnable r = () -> ...;` → `new Thread(r, "Lambda").start()`
- Comment-এ লেখো: `extends Thread`-এর চেয়ে `implements Runnable` কেন বেশি ভালো?

**Output (order বদলাতে পারে):**
```
Worker-1 running task
Worker-2 running task
Lambda thread running
```


---

## Question 36 (37_Thread_Priority_Sleep) — Priority and Sleep

দুইটা thread, একটা `MAX_PRIORITY` আরেকটা `MIN_PRIORITY`, `sleep()` দিয়ে delay।

**Output:**
```
High priority thread finished first
```

---

## Question 37 (38_Race_Condition) — Synchronized Counter

দুইটা thread একসাথে `Counter.increment()` কল করবে। `synchronized` দিয়ে race condition ঠেকাও।

**Output:**
```
Final Count: 2000
```

---

## Question 38 (39_Thread_States) — Thread Lifecycle

`getState()` দিয়ে thread-এর বিভিন্ন state (NEW, RUNNABLE, TERMINATED) দেখাও।

**Output:**
```
State: NEW
State: RUNNABLE
State: TERMINATED
```

---

## Question 39 (40_Collection_API) — Collection Overview

`List<String>` দিয়ে basic Collection উদাহরণ।

**Output:**
```
[Rahim, Karim, Sumi]
```

---

## Question 40 (41_ArrayList) — ArrayList of Student

`ArrayList<Student>` — add, remove, iterate করো।

**Output:**
```
Total Students: 3
```

---

## Question 41 (42_Set) — HashSet Uniqueness

`HashSet<String>` দিয়ে duplicate email reject হওয়া দেখাও।

**Output:**
```
Unique Emails: [a@x.com, b@x.com]
```

---

## Question 42 (43_Map) — HashMap Employee

`HashMap<Integer, String>` — `entrySet()` দিয়ে iterate করো।

**Output:**
```
1 -> Rahim
```

---

## Question 43 (44_Comparator_Comparable) — Sort Employees

`Employee implements Comparable<Employee>` (salary অনুযায়ী), আলাদা `EmployeeComparator implements Comparator<Employee>` (name অনুযায়ী)।

**Output:**
```
Sorted by salary: [Karim(35000), Rahim(40000)]
Sorted by name: [Karim, Rahim]
```

---

## Question 44 (45_Stream_API) — Stream forEach

`List<Integer>` থেকে `stream().forEach()` দিয়ে print করো।

**Output:**
```
1 2 3 4 5
```

---


## Question 44.1 (45.1_ForEach_Function) — forEach()

`forEach()` বিভিন্ন ভাবে use করো:
- `List<String>` → lambda দিয়ে: `names.forEach(name -> ...)`
- একই List → method reference দিয়ে: `names.forEach(System.out::println)`
- `Map<String, Integer>` → `map.forEach((key, value) -> ...)`

**Output (Map-এর order বদলাতে পারে):**
```
Rahim
Karim
Sumi
Supriya -> 100
Arup -> 300
```


---

## Question 45 (46_Stream_Map_Filter_Reduce_Sorted) — Employee Stream Pipeline

`List<Employee>` থেকে filter, map, sorted, reduce একসাথে ব্যবহার করো।

**Output:**
```
Filtered Names: [Rahim, Sumi]
Total Salary: 90000
```

---

## Question 46 (47_Parallel_Stream) — Parallel Sum

`parallelStream()` দিয়ে sum হিসাব করে normal `stream()`-এর সাথে compare করো।

**Output:**
```
Parallel Sum: 5050
```

---

## Question 47 (48_Optional_Class) — Optional User Lookup

`UserService.findUserById()` — `Optional<User>` return করবে। `isPresent()`, `orElse()` ব্যবহার করো।

**Output:**
```
User found: Rahim
User not found, using default
```

---

## Final Project (49_Record_Final_Project) — Library Management System

Classes: `BookStatus, LibraryPerson, Student, Librarian, Book, Searchable, BookNotFoundException, BookAlreadyIssuedException, IssueRecord, LibraryService, Demo`

Core Requirements (Topic যা কভার হচ্ছে):
- Enum — `BookStatus { AVAILABLE, ISSUED }`
- Abstraction/Inheritance/Polymorphism — `LibraryPerson` (abstract) → `Student`, `Librarian` (getRole() override)
- Encapsulation — `Book` (id, title, author, status)
- Exception Handling — `BookNotFoundException`, `BookAlreadyIssuedException`
- Functional Interface + Lambda — `Searchable` দিয়ে শর্ত অনুযায়ী বই খোঁজা
- Generics + Collection — `List<Book>`, `List<IssueRecord>`
- Stream API + Comparator — filter/sorted দিয়ে search ও display
- Optional — `findBookById()` → `Optional<Book>`
- Record — `IssueRecord(bookId, studentId, issueDate)`
- Singleton — `LibraryService`-এর মাত্র ১টা object

Bonus (ঐচ্ছিক): Object Cloning (`Book.clone()`), Serialization (book list file-এ save/load), Nested Class (`LibraryService.Stats`), Threads (synchronized issueBook)।

**Output (নমুনা):**
```
Book: Java Basics, Status: ISSUED
Book: Spring Boot Guide, Status: AVAILABLE
Issued by: Rahim (Student) on 2026-07-11
Book not found: B999
```
