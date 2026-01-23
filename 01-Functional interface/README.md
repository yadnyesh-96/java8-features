

---


# Functional Interface Concept in Java 8

Java 8 introduced the concept of **Functional Interfaces** to support **Lambda Expressions** and enable a functional programming style in Java.

This module explains what a functional interface is, why it is important, and how it is used in modern Java programming.

---

## ❓ What is a Functional Interface?

A **Functional Interface** is an interface that contains **only one abstract method**.

It can have:
- Multiple **default methods**
- Multiple **static methods**

But **only one abstract method**.

---

## 🏷️ `@FunctionalInterface` Annotation

Java provides the `@FunctionalInterface` annotation to explicitly declare that an interface is functional.

### Why use it?

- Ensures the interface has only **one abstract method**
- Gives **compile-time error** if violated
- Improves readability and intention


```java
@FunctionalInterface
interface MyFunctionalInterface {
    void display();   // Only one abstract method
}
````
![Functional_Interface](<Screenshot 2026-01-23 232451.png>)
---

## ❓ Why Did Java Introduce Functional Interfaces?

The main purpose is to:

> Enable **Lambda Expressions** and support **Functional Programming** in Java.

Functional interfaces act as the **target type** for lambda expressions.

---

## 💡 Example Without Lambda

```java
class Test implements MyFunctionalInterface {
    public void display() {
        System.out.println("Hello");
    }
}
```

---

## 💡 Example With Lambda (Java 8 Style)

```java
MyFunctionalInterface obj = () -> {
    System.out.println("Hello");
};

obj.display();
```
---

## ✅ Key Points to Remember

* Only **one abstract method** is allowed
* Can contain multiple **default** and **static** methods
* Used primarily with **Lambda Expressions**
* Mark with `@FunctionalInterface` for safety
* Forms the foundation of **modern Java programming**

---

## 📌 Real Inbuilt Functional Interfaces

Java 8 provides many built-in functional interfaces in `java.util.function`:

* `Runnable`
* `Consumer`
* `Predicate`
* `Function`
* `Supplier`
* `BiFunction`

These are covered in the next section of this repository.

---

