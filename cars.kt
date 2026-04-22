

class Cars(val brand: String, val model: String, val price: Double) {
    fun display() {
        println("Car: $brand $model | Price: ₹$price")
    }
}

fun main() {
    val car1 = Car("Toyota", "Camry", 2500000.0)
    val car2 = Car("Honda", "City", 1200000.0)
    val car3 = Car("Mahindra", "Thar", 1800000.0)

    car1.display()
    car2.display()
    car3.display()
}