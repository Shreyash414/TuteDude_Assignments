import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter an integer: ")
    if (scanner.hasNextInt()) {
        val number = scanner.nextInt()
        if (number % 2 == 0) {
            println("$number is even")
        } else {
            println("$number is odd")
        }
    } else {
        println("Invalid input")
    }
}
