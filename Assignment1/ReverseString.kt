import java.util.Scanner

fun reverseString(text: String): String {
    val builder = StringBuilder()
    for (i in text.length - 1 downTo 0) {
        builder.append(text[i])
    }
    return builder.toString()
}

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter a string: ")
    val input = scanner.nextLine() ?: ""
    val reversed = reverseString(input)
    println("Reversed string: $reversed")
}
