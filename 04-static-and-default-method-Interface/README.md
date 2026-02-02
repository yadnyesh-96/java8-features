
# Static and Default Methods in Interface (Java 8)

Before Java 8, interfaces could contain **only abstract methods**.

Java 8 introduced the ability to define **method implementations inside interfaces** using:

- `static` methods
- `default` methods

This was a major enhancement to support **API evolution without breaking existing code**.

---

## ❓ Why Did Java Allow Methods in Interfaces?

This change was introduced for **API reconstruction**.

### Example: `Iterable` Interface

Before Java 8, `Iterable` had only:

```java
Iterator<T> iterator();
````

In Java 8, a new method was added:

```java
forEach(Consumer action)
```

If this method were abstract, then **every class implementing `Iterable`** would be forced to override it, which would require modifying the entire Java Collection Framework.

To avoid this, Java introduced **default methods** so new functionality could be added without affecting existing implementations.

---

## 🔹 Static Method in Interface

A static method belongs to the interface itself.

### Example

```java
interface ABC {
    static void show() {
        System.out.println("I am static method in interface");
    }

    void display();
}
```

Call using the interface name:

```java
ABC.show();
```

---

## 🔹 Default Method in Interface

A default method provides a **default implementation** that implementing classes can use or override.

### Example

```java
interface ABC {

    default void display() {
        System.out.println("I am default method");
    }
}

class MNO implements ABC {
    // No need to override display()
}

public class Test {
    public static void main(String[] args) {
        MNO obj = new MNO();
        obj.display();
    }
}
```

---

## 🧠 Key Differences

| Feature           | Static Method          | Default Method                      |
| ----------------- | ---------------------- | ----------------------------------- |
| Called using      | Interface name         | Object of class                     |
| Can be overridden | No                     | Yes                                 |
| Purpose           | Utility/helper methods | API extension without breaking code |

---

## 🎯 Benefits

* Helps extend existing APIs
* Avoids breaking old implementations
* Reduces code duplication
* Supports backward compatibility

---

## 🏁 Outcome

After this topic, you should understand:

* Why Java 8 allowed method definitions in interfaces
* How to use static methods in interfaces
* How default methods help in API evolution

