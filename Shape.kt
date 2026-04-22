package sectionD

interface Shape {
    fun area(): Double
}

class Circle(private val radius: Double) : Shape {
    override fun area() = Math.PI * radius * radius
}

class Rect(private val length: Double, private val breadth: Double) : Shape {
    override fun area() = length * breadth
}

fun main() {
    val circle = Circle(5.0)
    val rect = Rect(10.0, 4.0)
    println("Circle Area: ${"%.2f".format(circle.area())}")
    println("Rectangle Area: ${rect.area()}")
}