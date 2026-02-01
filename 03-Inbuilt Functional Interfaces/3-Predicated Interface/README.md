

# Predicate Interface in Java 8

`Predicate<T>` is a built-in functional interface from:

```

java.util.function

````

It is used to **test a condition** on data and return a boolean result.

---

## ❓ What is Predicate?

A Predicate contains one abstract method:

```java
boolean test(T t);
````

* Accepts one input
* Checks a condition
* Returns `true` or `false`

---

## ✅ Basic Example — Check Even or Odd

```java
Predicate<Integer> isEven = n -> n % 2 == 0;

System.out.println(isEven.test(10)); // true
```

---

## 🔗 Combining Multiple Conditions — `and()`

Predicate provides default methods to combine conditions:

* `and()`
* `or()`
* `negate()`

### Example: Number between 10 and 20

```java
Predicate<Integer> greaterThan10 = n -> n >= 10;
Predicate<Integer> lessThan20  = n -> n <= 20;

Predicate<Integer> between = greaterThan10.and(lessThan20);

System.out.println(between.test(12)); // true
```

---

## 🧠 Important Predicate Methods

| Method      | Purpose                      |
| ----------- | ---------------------------- |
| `test(T t)` | Check condition              |
| `and()`     | Combine two predicates (AND) |
| `or()`      | Combine conditions (OR)      |
| `negate()`  | Reverse condition            |
| `isEqual()` | Compare equality             |
| `not()`     | Negate another predicate     |

---

## 🔄 Using Predicate with `forEach()` and Consumer

A very common real-world use case is filtering data from a collection.

### Example: Print Only Even Numbers from List

```java
import java.util.*;
import java.util.function.*;

List<Integer> list = List.of(1,2,4,6,7,9,12,14,16,19);

Predicate<Integer> isEven = n -> n % 2 == 0;

list.forEach(n -> {
    if (isEven.test(n)) {
        System.out.println(n);
    }
});
```

---

## 🔍 Understanding the Flow

1. `Predicate` checks condition.
2. `forEach()` iterates the list.
3. `Consumer` prints only values that satisfy the predicate.

---

## 🎯 Where Predicate is Mostly Used?

* Stream API → `filter()`
* Validations
* Condition checking
* Data filtering from collections

---

## 🏁 Outcome

After this topic, you should be able to:

* Write conditions using `Predicate`
* Combine multiple conditions using `and()`, `or()`
* Use Predicate with collections and `forEach()`
* Prepare for Stream API filtering



