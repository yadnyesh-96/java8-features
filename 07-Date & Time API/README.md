
# Date & Time API in Java 8

Before Java 8, Java used `Date` and `Calendar` classes for handling date and time.

These old APIs had several issues:

- Mutable and not thread-safe
- Confusing and hard to use
- Time zone related bugs

To solve these problems, Java 8 introduced a new **Date and Time API** in the package:

```

java.time

````

---

## 🎯 Advantages of New Date-Time API

- Immutable and thread-safe
- Clear and simple API
- Proper time zone handling
- Easy date formatting and parsing

---

## 🧩 Important Classes

| Class | Purpose |
|-------|---------|
| `LocalDate` | Represents date (yyyy-mm-dd) |
| `LocalTime` | Represents time (hh:mm:ss) |
| `LocalDateTime` | Date and time without zone |
| `ZonedDateTime` | Date and time with time zone |
| `ZoneId` | Represents time zone |
| `Period` | Date difference |
| `Duration` | Time difference |
| `DateTimeFormatter` | Formatting and parsing |

---

## ✅ LocalDate Example

```java
LocalDate date = LocalDate.now();
System.out.println(date);
````

---

## ✅ LocalTime Example

```java
LocalTime time = LocalTime.now();
System.out.println(time);
```

---

## ✅ LocalDateTime Example

```java
LocalDateTime dt = LocalDateTime.now();
System.out.println(dt);
```

---

## ✅ ZonedDateTime Example (Time Zone)

```java
ZonedDateTime india =
    ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

ZonedDateTime usa =
    ZonedDateTime.now(ZoneId.of("America/New_York"));

System.out.println(india);
System.out.println(usa);
```

---

## 🗓️ Date Formatting and Parsing

```java
DateTimeFormatter formatter =
    DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

String formatted =
    LocalDateTime.now().format(formatter);

System.out.println(formatted);
```

---

## ⏳ Period and Duration

```java
Period p = Period.between(
    LocalDate.of(2000,1,1),
    LocalDate.now()
);

Duration d = Duration.between(
    LocalTime.now(),
    LocalTime.now().plusHours(2)
);
```

---

## 🧠 Why This API is Better?

* No more `Date` and `Calendar` complexity
* Safer for multithreading
* Easy to handle time zones
* Clean and readable code

---

## 🏁 Outcome

After this topic, you should be able to:

* Work with date and time using modern Java API
* Handle time zones correctly
* Format and parse date/time easily
