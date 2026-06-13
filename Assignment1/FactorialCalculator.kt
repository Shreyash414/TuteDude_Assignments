import java.util.Scanner

fun factorial(n: Int): Long {
    if (n < 0) {
        return -1L
    }
    var result = 1L
    for (i in 1..n) {
        result *= i
    }
    return result
}

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter a non-negative integer: ")
    if (scanner.hasNextInt()) {
        val number = scanner.nextInt()
        val result = factorial(number)
        if (result == -1L) {
            println("Factorial is not defined for negative numbers")
        } else {
            println("Factorial of $number is $result")
        }
    } else {
        println("Invalid input")
    }
}
