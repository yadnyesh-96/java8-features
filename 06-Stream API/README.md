# Stream API in Java 8

Stream API is used to **process collections of data in a functional style**.

> Stream is NOT a data structure.  
> It takes data from collections, arrays, or I/O channels and performs operations on it.

⚠️ Stream API is different from I/O Streams.

---

## 🔹 Creating a Stream

```java
List<Integer> list = List.of(10,20,30,40,50);
Stream<Integer> stream = list.stream();
````

---

## ✨ Key Features

* Does not modify original data
* Supports method chaining
* Intermediate operations are lazy
* Terminal operation produces result

---

## 🧩 Important Intermediate Operations

| Method       | Purpose                    |
| ------------ | -------------------------- |
| `map()`      | Transform data             |
| `filter()`   | Apply condition            |
| `sorted()`   | Sorting                    |
| `flatMap()`  | Flatten nested collections |
| `distinct()` | Remove duplicates          |
| `peek()`     | Debugging                  |

---

## 🧪 Important Terminal Operations

| Method       | Purpose                       |
| ------------ | ----------------------------- |
| `forEach()`  | Iterate elements              |
| `collect()`  | Convert to List/Set/Map       |
| `reduce()`   | Aggregate result              |
| `count()`    | Count elements                |
| `anyMatch()` | Any element matches condition |
| `allMatch()` | All elements match condition  |

---

## 🔹 `map()` — Transform Data

```java
List.of(10,20,30)
    .stream()
    .map(n -> n * n)
    .forEach(System.out::println);
```

---

## 🔹 `filter()` — Apply Condition

```java
List.of(10,11,12,13)
    .stream()
    .filter(n -> n % 2 == 0)
    .forEach(System.out::println);
```

---

## 🔹 Filtering Objects

```java
list.stream()
    .filter(emp -> emp.getSal() > 10000)
    .forEach(System.out::println);
```

---

## 🔹 `sorted()` — Sorting

### Primitive

```java
Arrays.asList(5,2,9,1)
      .stream()
      .sorted()
      .forEach(System.out::println);
```

### Custom Object

```java
list.stream()
    .sorted(Comparator.comparing(Employee::getId))
    .forEach(System.out::println);
```

---

## 🔹 `flatMap()` — Flatten Nested Collections

```java
List<List<String>> list = Arrays.asList(
    Arrays.asList("A","B"),
    Arrays.asList("C","D")
);

list.stream()
    .flatMap(inner -> inner.stream())
    .forEach(System.out::println);
```

---

## 🔹 `distinct()` — Remove Duplicates

```java
Arrays.asList(10,10,20,30)
      .stream()
      .distinct()
      .forEach(System.out::println);
```

---

## 🔹 `collect()` — Convert Stream

```java
List<Integer> result =
    list.stream().distinct().collect(Collectors.toList());
```

---

## 🔹 `reduce()` — Aggregate Result (Sum)

```java
int sum = List.of(10,20,30,40)
              .stream()
              .reduce(0, (a,b) -> a + b);
```

---

## 🔹 `count()`

```java
long total = list.stream().count();
```

---

## 🔹 `anyMatch()` and `allMatch()`

```java
boolean anyEven = list.stream().anyMatch(n -> n % 2 == 0);
boolean allEven = list.stream().allMatch(n -> n % 2 == 0);
```

---

## 🎯 Where Stream API is Mostly Used?

* Data filtering
* Data transformation
* Sorting collections
* Removing duplicates
* Aggregating results

---

## 🏁 Outcome

After this topic, you should be able to:

* Process collections using functional style
* Use `map`, `filter`, `sorted`, `flatMap`
* Convert streams using `collect`
* Perform aggregation using `reduce`
---
✨ Take the reference of covered examples in repository 

