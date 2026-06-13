import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var running = true
    while (running) {
        println("Math Operations:")
        println("1. Add")
        println("2. Subtract")
        println("3. Multiply")
        println("4. Divide")
        println("5. Exit")
        print("Choose an option: ")
        if (scanner.hasNextInt()) {
            val choice = scanner.nextInt()
            if (choice == 5) {
                running = false
                continue
            }
            if (choice in 1..4) {
                print("Enter first number: ")
                if (scanner.hasNextDouble()) {
                    val num1 = scanner.nextDouble()
                    print("Enter second number: ")
                    if (scanner.hasNextDouble()) {
                        val num2 = scanner.nextDouble()
                        when (choice) {
                            1 -> println("Result: ${num1 + num2}")
                            2 -> println("Result: ${num1 - num2}")
                            3 -> println("Result: ${num1 * num2}")
                            4 -> {
                                if (num2 != 0.0) {
                                    println("Result: ${num1 / num2}")
                                } else {
                                    println("Error: Division by zero")
                                }
                            }
                        }
                    } else {
                        println("Invalid input")
                        scanner.next()
                    }
                } else {
                    println("Invalid input")
                    scanner.next()
                }
            } else {
                println("Invalid option")
            }
        } else {
            println("Invalid input")
            scanner.next()
        }
    }
}
