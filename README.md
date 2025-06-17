# Ecommers_System
Simple Java OOP E-Commerce Shopping Cart. Admin can manage products, users can add to cart, place orders, choose payment (UPI, Card, Wallet), and get notifications (Email/SMS). Implements core OOP concepts: encapsulation, inheritance, polymorphism, abstraction.



# 🛒 E-Commerce Shopping Cart System - Java OOP Mini Project

This is a simple **E-Commerce Shopping Cart System** implemented in **Java (Core OOP Principles)**.  
Perfect project to practice:

✅ Encapsulation  
✅ Inheritance (Admin vs User)  
✅ Polymorphism (Payment methods)  
✅ Abstraction (Notification system)  

---

## ✨ Features

- **Admin** can add/remove products to the product list
- **User** can add products to the shopping cart
- **Cart** calculates total price
- **Order** generates Order ID and displays order summary
- **Payment** methods:
  - UPI
  - Credit Card
  - Wallet
- **Notification** system:
  - Email notification
  - SMS notification

---

## 🚀 Technologies

- Java (JDK 17 or higher recommended)
- No external dependencies — pure Java console project

---

## ⚙️ How to Run

1️⃣ Clone this repository:

```bash
git clone [https://github.com/adil7616/ECommerce-Shopping-Cart.git](https://github.com/adil7616/Ecommers_System.git)

2️⃣ Compile all Java files:

javac *.java

3️⃣ Run the main class:

java ECommerceSystem

**🏗️ Project Structure**

|-- Product.java
|-- User.java
|-- Admin.java
|-- Cart.java
|-- Order.java
|-- Payment.java (interface)
|-- CreditCardPayment.java
|-- UpiPayment.java
|-- WalletPayment.java
|-- Notification.java (abstract)
|-- EmailNotification.java
|-- SmsNotification.java
|-- ECommerceSystem.java (main class)
|-- README.md

