
# Function Interface in Java 8

`Function<T, R>` is a built-in functional interface from:



java.util.function


It is used when we want to:

> Accept one input → perform an operation → return a result.

---

## ❓ Abstract Method

```java
R apply(T t);


Takes one input of type T

Returns a result of type R

✅ Example — Square of a Number
import java.util.function.Function;

Function<Integer, Integer> square = n -> n * n;

System.out.println(square.apply(10)); // 100

🔗 Chaining Functions — andThen()

andThen() performs another operation on the result of the first function.

Example — Square and then multiply by 100
Function<Integer, Integer> square = n -> n * n;
Function<Integer, Integer> multiply = n -> n * 100;

Function<Integer, Integer> result = square.andThen(multiply);

System.out.println(result.apply(10)); // 10000

🔄 Order of Execution — compose()

compose() executes the parameter function first, then the calling function.

Function<Integer, Integer> square = n -> n * n;
Function<Integer, Integer> multiply = n -> n * 100;

Function<Integer, Integer> result = square.compose(multiply);

System.out.println(result.apply(10));


compose() → parameter function runs first
andThen() → calling function runs first
```
## 🧠 Where Function is Used?

Stream API → map()

Data transformation

Processing collections

Functional programming style

## 🎯 Outcome

After this topic, you should be able to:

Transform data using Function

Chain multiple operations

Understand execution order using andThen() and compose()