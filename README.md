# Kotlin ArithmeticException: Division by zero

This repository demonstrates a common error in Kotlin: the `ArithmeticException` that occurs when dividing by zero.  The `bug.kt` file shows the erroneous code, while `bugSolution.kt` provides a solution.

## Bug Description

The `calculate` function attempts to divide `a` by `b`. If `b` is zero, an `ArithmeticException` is thrown.

## Solution

The solution involves adding a check to prevent division by zero. The `bugSolution.kt` file shows how this is done using an `if` statement and returning an appropriate value such as 0 or throwing an exception with more specific error message.