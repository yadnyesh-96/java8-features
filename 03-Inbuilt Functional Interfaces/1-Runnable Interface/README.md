

---

```markdown
# Runnable Interface in Java 8

`Runnable` is a built-in **functional interface** present in:

```

java.lang

````

It is mainly used for **multithreading** in Java.

Java 8 treats `Runnable` as a functional interface, which means it can be implemented using **Lambda Expressions**.

---

## ❓ What is Runnable?

`Runnable` is a functional interface that contains only one abstract method:

```java
void run();
````

* Takes **no parameters**
* Returns **no value**
* Contains the code that a thread will execute

---

## 🧠 Purpose of Runnable

Runnable is used to define the **task** that a thread will perform.

When a thread starts, it executes the `run()` method.

---

## ✅ Example 1 — Using Anonymous Inner Class

```java
public class RunnableExample {
    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running...");
            }
        };

        Thread t = new Thread(r);
        t.start();
    }
}
```

---

## ✅ Example 2 — Using Lambda Expression

```java
public class RunnableExample {
    public static void main(String[] args) {

        Runnable r = () -> {
            System.out.println("Thread is running...");
        };

        Thread t = new Thread(r);
        t.start();
    }
}
```

---

## ✅ Example 3 — Short Lambda Style

```java
public class RunnableExample {
    public static void main(String[] args) {

        Runnable r = () -> System.out.println("Thread is running...");

        new Thread(r).start();
    }
}
```

---

## 🔍 Understanding the Flow

1. Create a `Runnable` task.
2. Pass it to the `Thread` object.
3. Call `start()` on the thread.
4. Internally, the thread calls the `run()` method.

---

## 🧾 Key Characteristics

| Feature    | Description     |
| ---------- | --------------- |
| Input      | No parameters   |
| Output     | No return value |
| Package    | `java.lang`     |
| Common Use | Multithreading  |
| Method     | `run()`         |

---

## 🎯 When to Use Runnable?

Use `Runnable` when:

* You want to run code in a separate thread
* You want to implement multithreading without extending `Thread`
* You want to use lambda expressions for thread tasks

---

## 🏁 Outcome

After this topic, you should be able to:

* Understand how threads execute tasks
* Use `Runnable` with anonymous class and lambda
* Write simple multithreaded programs using Java 8 style


