import java.util.Scanner;

class CarRentalSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String customerName = input.nextLine();

        System.out.print("Enter Car Model: ");
        String carModel = input.nextLine();

        System.out.print("Enter Number of Rental Days: ");
        int rentalDays = input.nextInt();

        CarRental rental = new CarRental(customerName, carModel, rentalDays);

        // Display rental details
        System.out.println("\nRental Details:");
        rental.displayDetails();

        // Calculate and display the total cost
        System.out.println("\nCalculating Total Cost...");
        rental.calculateTotalCost();

        input.close();
    }
}

class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private final double costPerDay = 50.0; // Fixed cost per day

    // Default Constructor
    public CarRental() {
        System.out.println("You are in the default constructor.");
    }

    // Parameterized Constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        System.out.println("You are in the parameterized constructor.");
    }

    // Method to calculate and display total cost
    public void calculateTotalCost() {
        if (customerName == null || carModel == null || rentalDays <= 0) {
            System.out.println("Object Not Initialized Properly!");
        } else {
            double totalCost = rentalDays * costPerDay;
            System.out.println(
                    "The total cost for renting \"" + carModel + "\" for " + rentalDays + " days is: $" + totalCost);
        }
    }

    // Method to display rental details
    public void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Cost Per Day: $" + costPerDay);
    }
}
