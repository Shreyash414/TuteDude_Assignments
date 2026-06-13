package Assignment2.SectionE_Polymorphism

import kotlin.math.PI

open class Shape {
    open fun area(): Double {
        return 0.0
    }
}

class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        return PI * radius * radius
    }
}

class Rectangle(val length: Double, val breadth: Double) : Shape() {
    override fun area(): Double {
        return length * breadth
    }
}

fun main() {
    val shapes: List<Shape> = listOf(Circle(5.0), Rectangle(4.0, 6.0), Circle(3.0), Rectangle(7.0, 2.0))

    for (shape in shapes) {
        println("${shape::class.simpleName} area: ${"%.2f".format(shape.area())}")
    }
}
