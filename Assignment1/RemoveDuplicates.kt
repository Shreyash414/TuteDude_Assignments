fun main() {
    val items = listOf("apple", "banana", "apple", "cherry", "banana", "date")
    val uniqueItems = mutableListOf<String>()
    for (item in items) {
        if (item !in uniqueItems) {
            uniqueItems.add(item)
        }
    }
    println("Original: $items")
    println("Unique: $uniqueItems")
}
