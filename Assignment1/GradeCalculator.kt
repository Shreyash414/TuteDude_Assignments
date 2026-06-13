import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter marks: ")
    if (scanner.hasNextInt()) {
        val marks = scanner.nextInt()
        val grade = when (marks) {
            in 90..100 -> "A"
            in 80..89 -> "B"
            in 70..79 -> "C"
            in 60..69 -> "D"
            in 0..59 -> "F"
            else -> "Invalid Marks"
        }
        println("Grade: $grade")
    } else {
        println("Invalid input")
    }
}
