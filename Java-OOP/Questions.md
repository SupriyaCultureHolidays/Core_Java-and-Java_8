# Java OOP Practice Questions (Backend Mindset)

প্রতিটা প্রশ্নের জন্য ফোল্ডার নাম্বার = প্রশ্ন নাম্বার (Q1 → 01_Class_Object, Q2 → 02_Methods ... Q25 → 25_Enum, Final Project → 26_Record)।

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

## Question 19 (19_Final_Keyword) — Abstract Payment

Abstract `Payment` — `GooglePay, PhonePe, CreditCard`

**Output:**
```
Paid via GooglePay
Paid via PhonePe
Paid via CreditCard
```

---

## Question 20 (20_Object_Class) — Interface Printable

Interface `Printable`
Class `Invoice` — `print()` implement করবে।

**Output:**
```
Invoice No: 101, Amount: 5000
```

---

## Question 21 (21_Upcasting_Downcasting) — Interface Notification

Interface `Notification`
`EmailNotification, SMSNotification, PushNotification`

**Output:**
```
Sending Email...
Sending SMS...
Sending Push Notification...
```

---

## Question 22 (22_Abstract_Class) — Backend Style: Employee Management System

Classes: `Employee, EmployeeService, Demo`

EmployeeService-এ List<Employee> রেখে `addEmployee()`, `showAllEmployees()` লিখো।

**Output:**
```
ID: 1, Name: Rahim, Department: IT, Salary: 40000
ID: 2, Name: Karim, Department: HR, Salary: 35000
```

---

## Question 23 (23_Interface) — Backend Style: Student Management

Classes: `Student, StudentService, Demo`

**Output:**
```
Name: Rahim, Age: 20
Name: Karim, Age: 22
```

---

## Question 24 (24_Inner_Class) — Backend Style: Bank Management

Classes: `Account, BankService, Demo`

balance-related logic Account-এর ভেতরে না রেখে BankService-এ রাখো (Service layer pattern)।

**Output:**
```
Deposited 500, New Balance: 1500
Withdrew 300, New Balance: 1200
```

---

## Question 25 (25_Enum) — Backend Style: E-Commerce

Classes: `Product, Cart, Order, Customer, Demo`

**Output:**
```
Added: Laptop, Added: Mouse
Total: 45000
Order placed successfully!
```

---

## Final Mini Project (26_Record) — Library Management System

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
