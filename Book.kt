package miniproject

class Book(private val title: String, private val author: String) {

    fun getTitle(): String {
        return title
    }

    fun getAuthor(): String {
        return author
    }

    fun display() {
        println("$title by $author")
    }
}