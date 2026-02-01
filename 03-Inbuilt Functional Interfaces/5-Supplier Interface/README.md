
# Supplier Interface in Java 8

`Supplier<T>` is a built-in functional interface from:

```

java.util.function

````

It is used when we want to:

> Return a value **without taking any input parameter**.

---

## ❓ Abstract Method

```java
T get();
````

* Takes no input
* Returns a result of type `T`

---

## 🧠 Why Use Supplier?

Supplier is useful in scenarios like:

* Lazy object creation
* Generating dynamic or random values
* Providing default configuration values
* Getting system date/time

---

## ✅ Example — Creating Date Object

```java
import java.util.Date;
import java.util.function.Supplier;

Supplier<Date> dateSupplier = () -> new Date();

Date sysDate = dateSupplier.get();
System.out.println(sysDate);
```

---

## ✅ Example — Generating Random Numbers

```java
import java.util.Random;
import java.util.function.Supplier;

Supplier<Integer> randomSupplier = () -> new Random().nextInt(100);

System.out.println(randomSupplier.get());
System.out.println(randomSupplier.get());
System.out.println(randomSupplier.get());
```

---

## 🔍 Understanding the Flow

1. `Supplier` does not take any input.
2. `get()` method generates or supplies data.
3. Each call can return a new or dynamic value.

---

## 🧾 Key Characteristics

| Feature    | Description                              |
| ---------- | ---------------------------------------- |
| Input      | No parameters                            |
| Output     | Returns a value                          |
| Package    | `java.util.function`                     |
| Method     | `get()`                                  |
| Common Use | Object creation, random values, defaults |

---

## 🎯 Where Supplier is Used?

* Stream API
* Utility methods
* Lazy initialization
* Configuration providers

---

## 🏁 Outcome

After this topic, you should be able to:

* Use `Supplier` for dynamic value generation
* Avoid unnecessary object creation
* Apply Supplier in practical scenarios
