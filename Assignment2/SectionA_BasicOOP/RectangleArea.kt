package Assignment2.SectionA_BasicOOP

class Rectangle(val length: Double, val breadth: Double) {
    fun area(): Double {
        return length * breadth
    }
}

fun main() {
    val rect = Rectangle(8.5, 4.0)
    println("Length: ${rect.length}, Breadth: ${rect.breadth}")
    println("Area: ${rect.area()}")
}
