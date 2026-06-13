import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter a number: ")
    if (scanner.hasNextInt()) {
        val number = scanner.nextInt()
        for (i in 1..10) {
            println("$number x $i = ${number * i}")
        }
    } else {
        println("Invalid input")
    }
}
