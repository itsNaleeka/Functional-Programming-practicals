import scala.collection.mutable

// Define the Book case class
case class Book(title: String, author: String, isbn: String)

object LibraryManagement {
  // Initialize the library collection with some books
  val library: mutable.Set[Book] = mutable.Set(
    Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565"),
    Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084"),
    Book("1984", "George Orwell", "978-0451524935")
  )

  // Add a new book to the library
  def addBook(book: Book): Unit = {
    library += book
    println(s"Added book: ${book.title} by ${book.author}")
  }

  // Remove a book from the library by its ISBN
  def removeBook(isbn: String): Unit = {
    library.find(_.isbn == isbn) match {
      case Some(book) =>
        library -= book
        println(s"Removed book: ${book.title} by ${book.author}")
      case None =>
        println(s"No book found with ISBN $isbn")
    }
  }

  // Check if a book is already in the library by its ISBN
  def containsBook(isbn: String): Boolean = library.exists(_.isbn == isbn)

  // Display the current library collection
  def displayLibrary(): Unit = {
    println("Library Collection:")
    library.foreach(book => println(s"${book.title} by ${book.author} (ISBN: ${book.isbn})"))
  }

  // Search for a book by its title and display its details if found
  def searchByTitle(title: String): Unit = {
    library.find(_.title.equalsIgnoreCase(title)) match {
      case Some(book) =>
        println(s"Book found: ${book.title} by ${book.author} (ISBN: ${book.isbn})")
      case None =>
        println(s"No book found with title '$title'")
    }
  }

  // Display all books by a specific author
  def displayBooksByAuthor(author: String): Unit = {
    val booksByAuthor = library.filter(_.author.equalsIgnoreCase(author))
    if (booksByAuthor.nonEmpty) {
      println(s"Books by $author:")
      booksByAuthor.foreach(book => println(s"${book.title} (ISBN: ${book.isbn})"))
    } else {
      println(s"No books found by author '$author'")
    }
  }

  def main(args: Array[String]): Unit = {
    // Example usage
    addBook(Book("Pride and Prejudice", "Jane Austen", "978-0141439518"))
    removeBook("978-0061120084")
    displayLibrary()
    searchByTitle("1984")
    displayBooksByAuthor("F. Scott Fitzgerald")
  }
}
