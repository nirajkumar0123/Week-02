// Base class Book
class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }
}

// Subclass EBook to demonstrate access to public and protected members
class EBook extends Book {

    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    // Method to display ISBN and title
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
    }
}

public class BookLibrarySystem {
    public static void main(String[] args) {

        EBook eBook = new EBook("978", "Java Programming", "John");

        // Access public and protected members
        eBook.displayBookDetails();

        // Access private member through getter
        System.out.println("Author: " + eBook.getAuthor());

        // Modify private member through setter
        eBook.setAuthor("Jane Smith");
        System.out.println("Updated Author: " + eBook.getAuthor());
    }
}
