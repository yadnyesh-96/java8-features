

---

```markdown
# Inbuilt Functional Interfaces in Java 8

Java 8 introduced several inbuilt functional interfaces under the package:

```

java.util.function



These interfaces are ready-made targets for **Lambda Expressions** and are widely used in **Collections**, **Streams**, and **Multithreading**.

This section covers the most important inbuilt functional interfaces with examples and use cases.

---

## 🎯 What are Inbuilt Functional Interfaces?

They are predefined interfaces provided by Java that contain **only one abstract method** and are used to perform common functional operations like:

- Consuming data
- Producing data
- Testing conditions
- Transforming data
- Running tasks

---

## 📚 Interfaces Covered in This Section

| Interface | Purpose | Abstract Method |
|-----------|---------|------------------|
| **Runnable** | Execute task in a thread | `void run()` |
| **Consumer<T>** | Accept data and perform operation | `void accept(T t)` |
| **Predicate<T>** | Test a condition on data | `boolean test(T t)` |
| **Function<T, R>** | Transform input into output | `R apply(T t)` |
| **Supplier<T>** | Provide data without input | `T get()` |
| **BiFunction<T, U, R>** | Take two inputs and return result | `R apply(T t, U u)` |

---

## 🧠 Where Are These Used?

These interfaces are heavily used in:

- `forEach()` method
- Stream API (`map`, `filter`, `collect`)
- Multithreading
- Data processing
- Functional programming style in Java

---

## 📝 Short Introduction to Each

### 🔹 Runnable
Used to define a task that runs in a separate thread.

### 🔹 Consumer
Used when we want to perform an operation on data without returning anything.

### 🔹 Predicate
Used to test a condition and return true/false.

### 🔹 Function
Used to convert or transform data from one form to another.

### 🔹 Supplier
Used when we need to supply data without taking input.

### 🔹 BiFunction
Used when an operation requires two inputs to produce a result.

---

## ✅ Why These Are Important?

These interfaces:
- Reduce the need to create custom interfaces
- Work perfectly with Lambda Expressions
- Make code shorter, cleaner, and more readable
- Form the backbone of Java 8 Streams and Collections enhancements

---

## 🏁 Outcome

After completing this section, you will be able to:
- Understand the role of each functional interface
- Use them with lambda expressions
- Apply them in collections, streams, and multithreading
- Write modern Java 8 style code efficiently


