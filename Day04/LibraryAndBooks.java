import java.util.ArrayList;

// Book class
class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
		System.out.println("Author: " + author);
    }
}

// Library class
class Library {
    private String name;
    private ArrayList<Book> books;

    // Constructor
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    // Display all books in the library
    public void displayBooks() {
        System.out.println("Library: " + name);
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books) {
                book.displayBookDetails();
            }
        }
    }
}

public class LibraryAndBooks {
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        // Create libraries
        Library library1 = new Library("City Library");
        Library library2 = new Library("University Library");

        // Add books to libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book2); // Same book in multiple libraries
        library2.addBook(book3);

        // Display books in each library
        library1.displayBooks();
		System.out.println();
        library2.displayBooks();
    }
}
