import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter a string: ")
    val input = scanner.nextLine() ?: ""
    val vowels = "aeiouAEIOU"
    val count = input.count { it in vowels }
    println("Number of vowels: $count")
}
