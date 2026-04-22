package sectionB

class Employee(private var _salary: Double) {
    var salary: Double
        get() = _salary
        set(value) {
            if (value >= 0) {
                _salary = value
                println("Salary updated to: ₹$value")
            } else {
                println("Salary cannot be negative!")
            }
        }
}

fun main() {
    val emp = Employee(45000.0)
    println("Initial Salary: ₹${emp.salary}")
    emp.salary = 60000.0
    emp.salary = -1000.0 // Invalid
}