fun main() {
    val numbers = intArrayOf(4, 8, 15, 16, 23, 42)
    var sum = 0
    for (num in numbers) {
        sum += num
    }
    println("Array: ${numbers.joinToString()}")
    println("Sum: $sum")
}
