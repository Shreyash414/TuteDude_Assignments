import java.util.Scanner

fun findLargest(a: Int, b: Int, c: Int): Int {
    return if (a >= b && a >= c) {
        a
    } else if (b >= a && b >= c) {
        b
    } else {
        c
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter three integers: ")
    if (scanner.hasNextInt()) {
        val num1 = scanner.nextInt()
        if (scanner.hasNextInt()) {
            val num2 = scanner.nextInt()
            if (scanner.hasNextInt()) {
                val num3 = scanner.nextInt()
                val result = findLargest(num1, num2, num3)
                println("The largest number is $result")
            } else {
                println("Invalid input")
            }
        } else {
            println("Invalid input")
        }
    } else {
        println("Invalid input")
    }
}
