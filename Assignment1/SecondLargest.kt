fun main() {
    val items = listOf(12, 45, 7, 89, 34, 56, 2, 89)
    val distinctSorted = items.distinct().sortedDescending()
    if (distinctSorted.size < 2) {
        println("No second largest element found")
    } else {
        println("List: $items")
        println("Second largest element: ${distinctSorted[1]}")
    }
}
