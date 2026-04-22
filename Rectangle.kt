class Rectangle(val length: Double, val breadth: Double) {
    fun area(): Double {
        return length * breadth
    }
}

fun main() {
    val rect = Rectangle(10.0, 5.0)
    println("Area of rectangle: ${rect.area()} sq units")
}