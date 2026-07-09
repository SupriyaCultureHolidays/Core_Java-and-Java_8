# Java OOP Practice Questions (Backend Mindset)

প্রতিটা প্রশ্নের জন্য ফোল্ডার নাম্বার = প্রশ্ন নাম্বার নয় সবসময় — Q1 থেকে Q24 পর্যন্ত ফোল্ডার নাম্বার মিলে যায় (Q1 → 01_Class_Object, Q2 → 02_Methods ...), কিন্তু 25_Extra_Practice_Inheritance_Polymorphism_Abstraction ফোল্ডার যুক্ত হওয়ায় Q25 থেকে ফোল্ডার নাম্বার প্রশ্ন নাম্বারের চেয়ে ১ বেশি (Q25 → 26_Interface ... Q47 → 48_Optional_Class, Final Project → 49_Record_Final_Project)। ফোল্ডার নাম্বার সবসময় প্রতিটা প্রশ্নের হেডিং-এর প্যারেনথেসিসে দেওয়া আছে।

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

## Question 3 (03_Method_Overloading) — Product

একটি `Product` class

Properties: `id, name, price, quantity`
Method: `display()` — সব field ও total price (price*quantity) দেখাবে

**Output:**
```
Product: Pen, Price: 10, Qty: 5, Total: 50
```

---

## Question 4 (04_Stack_Heap_Memory) — Calculator

`Calculator` class

Methods: `add(), subtract(), multiply(), divide()` — সব Demo.java থেকে call করবে।

**Output:**
```
Sum: 15
Diff: 5
Mul: 50
Div: 2.0
```

---

## Question 5 (05_Static) — Student

`Student` class

Methods: `study(), sleep(), eat(), display()`

**Output:**
```
Rahim is studying
Rahim is sleeping
Rahim is eating
```

---

## Question 6 (06_Encapsulation) — Employee Constructor

`Employee` class, Constructor দিয়ে initialize করবে।

```java
Employee emp = new Employee(1,"Supriya","IT",45000);
```

তারপর display।

**Output:**
```
ID: 1, Name: Supriya, Department: IT, Salary: 45000
```

---

## Question 7 (07_Getters_Setters) — Laptop

`Laptop` class

Properties: `brand, ram, ssd, processor` — সব Constructor দিয়ে initialize।

**Output:**
```
Brand: Dell, RAM: 16GB, SSD: 512GB, Processor: i5
```

---

## Question 8 (08_This_Keyword) — Student Encapsulation

`Student` class — সব variable private, Getter Setter ব্যবহার করবে।

**Output:**
```
Name: Rahim, Age: 20
```

---

## Question 9 (09_Constructors) — BankAccount Validation

`BankAccount` — balance private থাকবে।

- Negative amount deposit করা যাবে না।
- withdraw balance-এর বেশি হলে হবে না।

**Output (balance=1000):**
```
Invalid deposit amount   (deposit(-100) করলে)
Insufficient balance     (withdraw(5000) করলে)
Current Balance: 1000
```

---

## Question 10 (10_Naming_Convention) — Employee Static

`Employee` class — একটি static `companyName` রাখো, সব employee একই company use করবে।

**Output:**
```
Rahim works at XYZ Corp
Karim works at XYZ Corp
Sumi works at XYZ Corp
```

---

## Question 11 (11_Anonymous_Object) — Static Counter

একটি static counter রাখো — যত object create হবে counter increase হবে।

**Output:**
```
Total students created: 4
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

## Question 13 (13_Single_Multilevel_Inheritance) — Vehicle → Car

```
Vehicle
  ↓
Car
```

Vehicle: `brand`
Car: `model`

**Output:**
```
Brand: Toyota, Model: Corolla
```

---

## Question 14 (14_Multiple_Inheritance_Interface) — Method Overriding

```
Animal
  ↓
Dog
```

Animal: `sound()`
Dog: `sound()` override করবে।

**Output:**
```
Dog barks
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

## Question 16 (16_Packages) — Polymorphism

```java
Animal a = new Dog();
Animal a = new Cat();
```

দুটো run করো।

**Output:**
```
Dog barks
Cat meows
```

---

## Question 17 (17_Polymorphism) — Employee Hierarchy

```
Employee
  ↓
Developer
  ↓
Tester
  ↓
Manager
```

সব `work()` override করবে।

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

## Question 35 (36_Threads) — Thread vs Runnable

`MyThread extends Thread`, `TaskRunnable implements Runnable` — দুইটাই start করো।

**Output:**
```
Thread-1 running
Thread-2 running
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

## Final Mini Project (49_Record_Final_Project) — Library Management System

Classes: `Book, Student, Librarian, LibraryService, Demo`

Features:
- Add Book
- Issue Book
- Return Book
- Search Book
- Display All Books

**Output:**
```
Book: Java Basics, Status: Issued
Book: Spring Boot Guide, Status: Available
```
