package sectionC

open class Animal {
    fun eat() = println("Animal is eating")
    fun sleep() = println("Animal is sleeping")
}

class Dog : Animal() {
    fun bark() = println("Dog is barking: Woof Woof!")
}

fun main() {
    val dog = Dog()
    dog.eat()
    dog.sleep()
    dog.bark()
}