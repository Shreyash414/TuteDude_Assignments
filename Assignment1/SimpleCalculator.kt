import java.util.Scanner

fun add(a: Double, b: Double): Double {
    return a + b
}

fun subtract(a: Double, b: Double): Double {
    return a - b
}

fun multiply(a: Double, b: Double): Double {
    return a * b
}

fun divide(a: Double, b: Double): Double {
    return a / b
}

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter first number: ")
    if (scanner.hasNextDouble()) {
        val num1 = scanner.nextDouble()
        print("Enter second number: ")
        if (scanner.hasNextDouble()) {
            val num2 = scanner.nextDouble()
            println("Addition: ${add(num1, num2)}")
            println("Subtraction: ${subtract(num1, num2)}")
            println("Multiplication: ${multiply(num1, num2)}")
            if (num2 != 0.0) {
                println("Division: ${divide(num1, num2)}")
            } else {
                println("Division: Cannot divide by zero")
            }
        } else {
            println("Invalid input")
        }
    } else {
        println("Invalid input")
    }
}
