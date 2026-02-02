
# Method Reference in Java 8

Method Reference is a feature introduced in Java 8 to make **lambda expressions even shorter and more readable**.

It is used when a lambda expression simply calls an existing method.

---

## ❓ What is Method Reference?

A **method reference** is a shorthand way of writing a lambda expression that calls a method.

### Lambda Style

```java
n -> System.out.println(n);
````

### Method Reference Style

```java
System.out::println
```

---

## 🧠 Why Use Method Reference?

* Reduces boilerplate code
* Improves readability
* Makes code cleaner and more expressive
* Works perfectly with functional interfaces

---

## 🔹 Types of Method References

| Type                     | Syntax                  | Example               |
| ------------------------ | ----------------------- | --------------------- |
| Static Method            | `ClassName::methodName` | `Math::sqrt`          |
| Instance Method          | `object::methodName`    | `System.out::println` |
| Instance Method of Class | `ClassName::methodName` | `String::toUpperCase` |
| Constructor Reference    | `ClassName::new`        | `ArrayList::new`      |

---

## ✅ Example — Using forEach()

### Lambda Expression

```java
list.forEach(n -> System.out.println(n));
```

### Method Reference

```java
list.forEach(System.out::println);
```

---

## ✅ Example — Static Method Reference

```java
Function<Integer, Double> f = Math::sqrt;

System.out.println(f.apply(16)); // 4.0
```

---

## ✅ Example — Instance Method of Class

```java
Function<String, String> f = String::toUpperCase;

System.out.println(f.apply("java"));
```

---

## ✅ Example — Constructor Reference

```java
Supplier<ArrayList<String>> s = ArrayList::new;

ArrayList<String> list = s.get();
```

---

## 🎯 Where Method Reference is Used?

* Stream API
* forEach()
* map(), filter()
* Functional interfaces like Function, Consumer, Supplier

---

## 🏁 Outcome

After this topic, you should be able to:

* Replace simple lambda expressions with method references
* Understand different types of method references
* Write cleaner and more readable Java 8 code
