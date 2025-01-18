import java.util.Scanner;

public class MovieTicket {
    //Attributes
    public String movieName;
    private int seatNumber;
    public double price;
    private boolean isBooked;

    //constructor
    public MovieTicket(String movieName, double price){
        this.movieName = movieName;
        this.price = price;
        this.isBooked = false;
        this.seatNumber = 0;
    }

    //Method to book a ticket
    public void bookTicket(int seatNumber){
        if(isBooked){
            System.out.println("Ticket is already Booked :"+this.seatNumber);
        }
        else{
            this.seatNumber = seatNumber;
            isBooked = true;
        }
    }
    
    //Display the booking result
    public void displayResult(){
        if(isBooked){
            System.out.println("Your ticket for the movie is Booked");
            System.out.println("Movie name is : " +this.movieName);
            System.out.println("Seat Number is : "+this.seatNumber);
            System.out.println("Ticket price is : "+this.price);
        }else{
            System.out.println("Ticket is not booked!");
        }
    }
    public static void main(String[] args) {
        //Scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your movie name : ");
        String movieName = input.nextLine();

        System.out.println("Enter your movie ticket price : ");
        double price = input.nextDouble();
        
        //create object 
        MovieTicket ticket = new MovieTicket(movieName, price);
        
        //Enter the seat number to book the ticket 
        System.out.println("Enter the seat number to book: ");
        int seatNumber = input.nextInt();

        ticket.bookTicket(seatNumber);
          
        // Display the booking result
        ticket.displayResult();
 
        input.close();
    }
}
