package sectionE

abstract class Shape {
    abstract fun area(): Double
}

class Circle(private val radius: Double) : Shape() {
    override fun area() = Math.PI * radius * radius
}

class Rectangle(private val length: Double, private val width: Double) : Shape() {
    override fun area() = length * width
}

fun main() {
    val shapes: List<Shape> = listOf(
        Circle(7.0),
        Rectangle(10.0, 5.0),
        Circle(3.5)
    )

    shapes.forEach { shape ->
        println("Area: ${"%.2f".format(shape.area())}")
    }
}