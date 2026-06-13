class Book(val title: String, val author: String) {
    fun display() {
        println("\"$title\" by $author")
    }
}

class Library {
    private val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
        println("Added: \"${book.title}\"")
    }

    fun removeBook(title: String) {
        val book = books.find { it.title == title }
        if (book != null) {
            books.remove(book)
            println("Removed: \"$title\"")
        } else {
            println("Book \"$title\" not found in the library.")
        }
    }

    fun showBooks() {
        if (books.isEmpty()) {
            println("The library has no books.")
        } else {
            println("Books in the library:")
            for (book in books) {
                book.display()
            }
        }
    }
}

fun main() {
    val library = Library()

    library.addBook(Book("The Alchemist", "Paulo Coelho"))
    library.addBook(Book("Atomic Habits", "James Clear"))
    library.addBook(Book("Clean Code", "Robert C. Martin"))

    library.showBooks()

    library.removeBook("Atomic Habits")

    library.showBooks()

    library.removeBook("Harry Potter")
}
