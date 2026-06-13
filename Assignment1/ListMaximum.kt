fun main() {
    val items = listOf(12, 45, 7, 89, 34, 56, 2)
    if (items.isEmpty()) {
        println("The list is empty")
        return
    }
    var max = items[0]
    for (item in items) {
        if (item > max) {
            max = item
        }
    }
    println("List: $items")
    println("Maximum: $max")
}
