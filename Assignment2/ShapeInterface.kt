import kotlin.math.PI

interface Shape {
    fun area(): Double
}

class Circle(val radius: Double) : Shape {
    override fun area(): Double {
        return PI * radius * radius
    }
}

class Rectangle(val length: Double, val breadth: Double) : Shape {
    override fun area(): Double {
        return length * breadth
    }
}

fun main() {
    val circle = Circle(7.0)
    val rectangle = Rectangle(5.0, 3.0)

    println("Circle area: ${"%.2f".format(circle.area())}")
    println("Rectangle area: ${"%.2f".format(rectangle.area())}")
}
