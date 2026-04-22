package miniproject

class Library {

    private val books = mutableListOf<Book>()   // encapsulated list

    fun addBook(book: Book) {
        books.add(book)
        println("Book added: ${book.getTitle()}")
    }

    fun removeBook(title: String) {
        val book = books.find { it.getTitle() == title }

        if (book != null) {
            books.remove(book)
            println("Book removed: $title")
        } else {
            println("Book not found")
        }
    }

    fun showBooks() {
        if (books.isEmpty()) {
            println("Library is empty")
        } else {
            println("Books in library:")
            for (book in books) {
                book.display()
            }
        }
    }
}