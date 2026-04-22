package sectionE

abstract class Animal {
    abstract fun makeSound()
}

class Dog : Animal() {
    override fun makeSound() = println("Dog: Woof Woof!")
}

class Cat : Animal() {
    override fun makeSound() = println("Cat: Meow Meow!")
}

class Cow : Animal() {
    override fun makeSound() = println("Cow: Moo Moo!")
}

fun main() {
    val animals: List<Animal> = listOf(Dog(), Cat(), Cow(), Dog())
    animals.forEach { it.makeSound() }
}