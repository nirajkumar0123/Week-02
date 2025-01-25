package inheritance.singleinheritance.librarysystem;

public class LibrarySystem {
    public static void main(String[] args) {
        Author author = new Author(
                "Effective Java",
                2018,
                "Niraj Kumar",
                "Niraj Kumar is a software engineer and author, best known for his work on Java."
        );

        // Display the details of the book and its author
        System.out.println("Library System Details:");
        author.displayInfo();
    }
}
