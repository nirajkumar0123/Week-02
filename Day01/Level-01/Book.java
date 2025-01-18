public class Book {
    //Attributes
    public String title;
    public String author; 
    public int price;

    //constructor
    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("Book details are : ");
        System.out.println("Book title :" +title);
        System.out.println("Book author :"+author);
        System.out.println("Book price :"+price);
    }
    public static void main(String[] args) {
        //create object of Book class
        Book book1 = new Book("OS", "NirajKumar", 500);

        //display details
        book1.displayDetails();
    }
}
