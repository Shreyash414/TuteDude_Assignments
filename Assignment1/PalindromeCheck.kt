import java.util.Scanner

fun isPalindrome(number: Int): Boolean {
    if (number < 0) {
        return false
    }
    var original = number
    var reversed = 0
    while (original > 0) {
        val digit = original % 10
        reversed = reversed * 10 + digit
        original /= 10
    }
    return number == reversed
}

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter an integer: ")
    if (scanner.hasNextInt()) {
        val number = scanner.nextInt()
        if (isPalindrome(number)) {
            println("$number is a palindrome")
        } else {
            println("$number is not a palindrome")
        }
    } else {
        println("Invalid input")
    }
}
