```kotlin
fun calculate(a: Int, b: Int): Int {
    return a / b
}

fun main() {
    val result = calculate(10, 0) 
    println(result) //This will throw an ArithmeticException
}
```