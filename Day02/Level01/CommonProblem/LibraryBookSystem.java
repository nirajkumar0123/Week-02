import java.util.Scanner;

class LibraryBookSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the title of the Book: ");
        String title = input.nextLine();

        System.out.print("Enter the author of the Book: ");
        String author = input.nextLine();

        System.out.print("Enter the price of the Book: ");
        double price = input.nextDouble();
        input.nextLine(); // Consume the leftover newline character

        Books book = new Books(title, author, price);

        // Borrowing a book
        System.out.println("\nAttempting to borrow the book...");
        book.borrowBook();

        // Attempting to borrow the book again
        System.out.println("Attempting to borrow the book again...");
        book.borrowBook();

        input.close();
    }
}

class Books {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Parameterized Constructor Constructor to initialize book details
    public Books(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true; // Book is available by default
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false; // Mark the book as unavailable
            System.out.println("The book \"" + title + "\" by " + author + " has been borrowed successfully.");
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is currently unavailable.");
        }
    }
}
