import java.util.Scanner;

class BookDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of Author: ");
        String author = input.nextLine();

        System.out.print("Enter the title of Book: ");
        String title = input.nextLine();

        System.out.print("Enter the price of Book: ");
        int price = input.nextInt();

        Book book1 = new Book();
        Book book2 = new Book(title, author, price);
        System.out.println();

        book1.displayBookStatus();

        book2.displayBookStatus();

        input.close();
    }
}

class Book {
    private String title;
    private String author;
    private int price;

    // Default Constructor
    Book() {
        System.out.println("You are in default constructor.");
    }

    // Parameterized Constructor
    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("You are in parameterized constructor.");
    }

    public void displayBookStatus() {
        if (title == null) {
            System.out.println("Object Not Initialized!");
        } else {
            System.out.println(title + " is written by " + author + " and costs " + price + " units.");
        }
        System.out.println();
    }
}
