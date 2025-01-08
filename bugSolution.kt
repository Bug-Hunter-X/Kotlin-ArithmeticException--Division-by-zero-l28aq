```kotlin
fun calculate(a: Int, b: Int): Int {
    return if (b == 0) {
        0 // Or throw a custom exception: throw IllegalArgumentException("Cannot divide by zero")
    } else {
        a / b
    }
}

fun main() {
    val result1 = calculate(10, 0) 
    println(result1) // Output: 0
    val result2 = calculate(10, 2)
    println(result2) // Output: 5
}
```