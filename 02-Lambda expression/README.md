
# Lambda Expression in Java 8

Lambda Expressions are one of the most powerful features introduced in Java 8.  
They reduce boilerplate code and enable a **functional programming style** in Java.

Before understanding lambda expressions, it is important to understand the concept of **Anonymous Inner Classes**.

---

## ❓ What is an Anonymous Inner Class?

An **Anonymous Inner Class** is a class without a name that is declared and instantiated at the same time.

It is commonly used to:
- Use an **interface** without creating a separate implementation class
- Use an **abstract class** without inheritance

### Example

```java
@FunctionalInterface
interface ABC {
    void show();
}

ABC obj = new ABC() {
    @Override
    public void show() {
        System.out.println("Hello from Anonymous Inner Class");
    }
};

obj.show();
````

---

## ❗ Limitation of Anonymous Inner Class

Anonymous inner classes introduce **boilerplate code**.

> Boilerplate code = Code that is necessary for syntax but not related to business logic.

This makes the code:

* Lengthy
* Less readable
* Harder to maintain

To overcome this limitation, **Java 8 introduced Lambda Expressions**.

---

## ❓ What is a Lambda Expression?

A **Lambda Expression** is a concise way to represent an anonymous function.

It is:

* Anonymous (no class name)
* No object creation syntax
* No method name
* Works only with **Functional Interfaces**

---

## 🔄 Converting Anonymous Inner Class to Lambda

### Using Anonymous Inner Class

```java
ABC obj = new ABC() {
    @Override
    public void show() {
        System.out.println("Hello");
    }
};
```

### Using Lambda Expression

```java
ABC obj = () -> System.out.println("Hello");
```

---

## 🧠 Rules for Writing Lambda Expressions

1. If the method has **only one line**, `{ }` braces are optional.
2. If there is **a single return statement**, the `return` keyword is optional.
3. Works only with **Functional Interfaces**.
4. Method parameters do not require data types (optional).

---

## ✍️ Example: Square of a Number

### Functional Interface

```java
@FunctionalInterface
interface Square {
    int getSquare(int no);
}
```

### Using Anonymous Inner Class

```java
Square obj = new Square() {
    @Override
    public int getSquare(int no) {
        return no * no;
    }
};
```

### Using Lambda Expression (Java 8 Style)

```java
Square obj = (no) -> no * no;

System.out.println(obj.getSquare(5));  // Output: 25
```

---

## ✅ Key Takeaways

* Lambda expressions remove boilerplate code
* Improve readability and maintainability
* Require a functional interface
* Make Java code concise and modern
* Replace most uses of anonymous inner classes

---

