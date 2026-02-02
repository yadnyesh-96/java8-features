
# Optional Class in Java 8

`Optional` is a final class introduced in Java 8 to handle **null values** in a better and safer way.

It helps to avoid **NullPointerException** and makes the code more readable and expressive.

---

## ❓ What is Optional?

`Optional<T>` is a container that may:

- Hold a non-null value
- Be empty (no value)

Instead of returning `null`, methods can return an `Optional`.

---

## 🎯 Why Use Optional?

- Avoid NullPointerException
- Improve code readability
- Represent absence of value clearly
- Reduce manual null checks

---

## 🧩 Common Methods of Optional

| Method | Purpose |
|--------|---------|
| `Optional.of(value)` | Create Optional with non-null value |
| `Optional.ofNullable(value)` | Wrap value that may be null |
| `Optional.empty()` | Create empty Optional |
| `isPresent()` | Check if value exists |
| `ifPresent()` | Execute logic if value exists |
| `orElse()` | Provide default value if empty |
| `orElseThrow()` | Throw exception if empty |

---

## ✅ Example — Using `isPresent()` and `ifPresent()`

```java
Optional<String> name = getName(1);

if (name.isPresent()) {
    name.ifPresent(n -> System.out.println(n.toUpperCase()));
} else {
    System.out.println("No name found");
}

public static Optional<String> getName(int id) {
    if (id == 1) {
        return Optional.of("india");
    }
    return Optional.empty();
}
````

---

## ✅ Example — Using `orElse()`

```java
Optional<String> o = Optional.empty();

String name = o.orElse("no data found");
System.out.println(name);
```

---

## 🧠 When to Use Optional?

* When a method may return no result
* When you want to avoid returning `null`
* In API design for safer code

---

## 🏁 Outcome

After this topic, you should be able to:

* Use Optional instead of null
* Handle missing values safely
* Write cleaner and more readable Java code

