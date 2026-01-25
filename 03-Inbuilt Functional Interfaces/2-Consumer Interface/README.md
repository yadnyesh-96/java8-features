
---

```markdown
# Consumer Interface in Java 8

The **Consumer Interface** is a built-in functional interface introduced in Java 8 under the package:

```

java.util.function

````

It is mainly used when we want to perform an operation on data without returning any result.

---

## ❓ What is Consumer?

`Consumer<T>` is a functional interface that contains one abstract method:

```java
void accept(T t);
````

* It takes **one input parameter**
* It **does not return** anything
* Used to perform operations like printing, modifying, logging, etc.

---

## 🧠 Where is Consumer Used?

Java 8 uses `Consumer` in many places, most commonly in:

### `forEach()` method of:

* Collections
* Stream API

```java
void forEach(Consumer<? super T> action);
```

Using `forEach()`, we can process elements of a collection or stream.

---

## ✅ Example 1 — Using Anonymous Inner Class

```java
import java.util.function.*;
import java.util.*;

public class AnonymApplication {
    public static void main(String x[]) {

        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        Consumer<Integer> c = new Consumer<Integer>() {
            public void accept(Integer val) {
                System.out.println(val);
            }
        };

        list.forEach(c);
    }
}
```

---

## ✅ Example 2 — Using Lambda Expression

```java
import java.util.function.*;
import java.util.*;

public class AnonymApplication {
    public static void main(String x[]) {

        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        Consumer<Integer> c = (Integer val) -> {
            System.out.println(val);
        };

        list.forEach(c);
    }
}
```

---

## ✅ Example 3 — Short Lambda Style

```java
import java.util.function.*;
import java.util.*;

public class AnonymApplication {
    public static void main(String x[]) {

        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        Consumer<Integer> c = (Integer val) -> System.out.println(val);

        list.forEach(c);
    }
}
```

---

## 🔍 Understanding the Flow

1. List contains elements.
2. `forEach()` takes a `Consumer`.
3. `accept()` method runs for each element.
4. Operation is performed on each item.

---

## 🧾 Key Characteristics

| Feature    | Description                          |
| ---------- | ------------------------------------ |
| Input      | One parameter                        |
| Output     | No return value                      |
| Package    | `java.util.function`                 |
| Common Use | `forEach()` in Collections & Streams |
| Purpose    | Perform operation on data            |

---

## 🎯 When to Use Consumer?

Use `Consumer` when:

* You only need to **use** the data
* No result needs to be returned
* Printing, logging, updating, or processing elements

---

## 🏁 Outcome

After this topic, you should be able to:

* Understand the purpose of `Consumer`
* Use it with `forEach()`
* Replace anonymous classes with lambda expressions
* Apply it in collections and streams


