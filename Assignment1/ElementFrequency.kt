fun main() {
    val items = listOf("apple", "banana", "apple", "cherry", "banana", "apple")
    val frequencyMap = mutableMapOf<String, Int>()
    for (item in items) {
        val count = frequencyMap[item] ?: 0
        frequencyMap[item] = count + 1
    }
    println("List: $items")
    println("Frequencies:")
    for ((item, count) in frequencyMap) {
        println("$item: $count")
    }
}
