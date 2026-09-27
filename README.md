# SC-Assignment-1-OOP

## Software Construction – Assignment 01

**University:** University of Engineering and Technology, Abbottabad Campus

**Department:** Software Engineering

**Course:** Software Construction

**Instructor:** Engr. Rizwan Shah

**Assignment:** 01 – Object-Oriented Programming

**Semester:** 5th Semester

---

## Objective

The purpose of this assignment is to understand and implement important Object-Oriented Programming concepts in Java. The assignment covers encapsulation, inheritance, polymorphism, abstraction, and basic AI code review.

The main concepts implemented in this assignment are:

* Encapsulation
* Inheritance
* Polymorphism
* Abstraction
* Interfaces
* AI-generated code review

---

## Project Structure

The project contains the following tasks:

### Task 1 – Broken Vault: Encapsulation

In this task, a `DigitalWallet` class was designed using encapsulation.

The class protects important information such as:

* Account holder
* Balance
* PIN code

The balance cannot be negative, and the PIN is assigned only through the constructor. The `withdraw()` method checks the entered PIN and available balance before completing a withdrawal.

**Files:**

* `DigitalWallet.java`
* `WalletMain.java`

---

### Task 2 – Evolving Workforce: Inheritance and Polymorphism

This task demonstrates inheritance and runtime polymorphism using different types of employees.

The program contains:

* `Employee` – Parent class
* `Developer` – Child class with technology allowance
* `SalesManager` – Child class with sales commission
* `Task2Main` – Main class for testing

Both employee types are stored in an `Employee` list. The `calculatePay()` method is overridden in the child classes so that each employee type can calculate its pay differently.

**Files:**

* `Employee.java`
* `Developer.java`
* `SalesManager.java`
* `Task2Main.java`

---

### Task 3 – Design by Contract: Abstraction

This task demonstrates abstraction using a Java interface.

The `SmartDevice` interface defines common methods:

* `turnOn()`
* `turnOff()`
* `getStatus()`

Two different smart devices implement this interface:

* `SmartBulb`
* `SmartThermostat`

The bulb provides brightness control, while the thermostat provides temperature control.

**Files:**

* `SmartDevice.java`
* `SmartBulb.java`
* `SmartThermostat.java`
* `SmartDeviceMain.java`

---

### Task 4 – AI Code Review

In this task, an AI tool was given the following prompt:

> "Write a Java program for a simple Library System using OOP. Include classes for Book and Member."

The generated code was reviewed to identify a good OOP feature and a design problem.

The AI-generated program correctly used separate `Book` and `Member` classes and constructors. However, the fields were not private, which resulted in weak encapsulation.

The code was improved by:

* Making fields `private`
* Adding getter methods
* Accessing data through methods instead of directly

**Classes:**

* `Book`
* `Member`
* `LibraryMain`

---

## Technologies Used

* Java
* Object-Oriented Programming
* Apache NetBeans
* Maven
* Git
* GitHub

---

## How to Run the Project

1. Clone or download this repository.
2. Open the project in **Apache NetBeans**.
3. Make sure Java is properly configured.
4. Open the required Java class.
5. Run the main/demo class for the selected task.

### Main Classes

| Task   | Main Class        |
| ------ | ----------------- |
| Task 1 | `WalletMain`      |
| Task 2 | `Task2Main`       |
| Task 3 | `SmartDeviceMain` |
| Task 4 | `LibraryMain`     |

---

## Learning Outcomes

After completing this assignment, I learned:

* How encapsulation protects class data.
* How inheritance allows classes to reuse common features.
* How polymorphism allows different objects to implement the same method differently.
* How interfaces are used to achieve abstraction.
* How to review and improve AI-generated Java code.
* Why AI-generated code should be checked instead of being copied without understanding it.

---

## Reflection

Through this assignment, I learned how OOP concepts can be applied in Java programs. I understood how encapsulation helps protect data, how inheritance supports code reuse, and how polymorphism allows different objects to use their own version of a method. I also learned how interfaces provide common rules for different classes. Finally, the AI code review helped me understand that generated code should be checked and improved according to proper OOP principles.

---

## Repository Information

**Repository Name:** `SC-Assignment-1-OOP`

This repository contains the Java source code and related work completed for Software Construction Assignment 01.
