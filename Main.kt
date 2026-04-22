package miniproject

fun main() {

    val library = Library()

    val book1 = Book("The Alchemist", "Paulo Coelho")
    val book2 = Book("1984", "George Orwell")
    val book3 = Book("Atomic Habits", "James Clear")

    library.addBook(book1)
    library.addBook(book2)
    library.addBook(book3)

    println()
    library.showBooks()

    println()
    library.removeBook("1984")

    println()
    library.showBooks()
}