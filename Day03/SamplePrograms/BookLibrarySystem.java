//Base class
class Book{
	//static variable
	static String libraryName = "TIT";
    
	//instance variable
    private final String ISBN;
    private String title;
    private String author;
	
	//constructor
	public Book(String title, String author){
		this.ISBN = generateISBN();
		this.title = title;
		this.author = author;
	}
	
	
	//static method to displayLibraryName
	static void displayLibraryName(){
		System.out.println("Library Name : "+libraryName);
	}
	
	
    // Method to generate a random ISBN
	private String generateISBN() {
        // Simple random ISBN generation for the example (not a valid ISBN generator)
        return String.format("%013d", (long) (Math.random() * 10000000000000L));
    }
	
	public void displayDetails(){
	    if(this instanceof Book){
			System.out.println("ISBN number : "+ISBN);
			System.out.println("Book Title : "+title);
			System.out.println("Book Author : "+author);
		}
		else{
			System.out.println("This object is not instance of Book");
		}
	}
}

class BookLibrarySystem{
	public static void main(String[] args){
		Book book1 = new Book("Gullivers Travel", "Anthony Gedy");
		
		//displayDetails
		book1.displayDetails();
		
		System.out.println();
		
		Book book2 = new Book("Money Heist", "Professor");
		//displayDetails
		book2.displayDetails();
		
		System.out.println();
			
		// Display library name (static method)
		Book.displayLibraryName();
		
        System.out.println();
		
		// Check the behavior of instanceof
        if (book1 instanceof Book) {
            System.out.println("book1 is an instance of the Book class.");
			} else {
            System.out.println("book1 is not an instance of the Book class.");
		}
	}
}