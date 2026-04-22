package sectionC

open class Person(val name: String, val age: Int) {
    open fun display() {
        println("Name: $name, Age: $age")
    }
}

class Teacher(name: String, age: Int, val subject: String) : Person(name, age) {
    override fun display() {
        super.display()
        println("Role: Teacher | Subject: $subject")
    }
}

class Student(name: String, age: Int, val rollNo: Int) : Person(name, age) {
    override fun display() {
        super.display()
        println("Role: Student | Roll No: $rollNo")
    }
}

fun main() {
    val teacher = Teacher("Mr. Sharma", 45, "Mathematics")
    val student = Student("Soumyadeep", 20, 101)
    teacher.display()
    println()
    student.display()
}