class Vehicle {

    //static variables
    static double registrationFee = 300.0; 
	
	//instance variables
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;
    
	//constructor
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    
	//upgrade registration fee
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
    
	//display the vehicle Details
    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: " + registrationFee);
        } else {
            System.out.println("This object is not an instance of Vehicle.");
        }
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("AB123CD", "John Doe", "Car");
        Vehicle vehicle2 = new Vehicle("EF456GH", "Jane Smith", "Truck");

        vehicle1.displayDetails();
        System.out.println();
        vehicle2.displayDetails();
        
        Vehicle.updateRegistrationFee(600.0); // Updating registration fee

        System.out.println("\nAfter updating registration fee:");
		System.out.println();
		 
        vehicle1.displayDetails();
        System.out.println();
        vehicle2.displayDetails();
    }
}
