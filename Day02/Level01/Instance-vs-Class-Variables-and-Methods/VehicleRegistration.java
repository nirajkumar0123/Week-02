class VehicleRegistration {
    public static void main(String[] args) {
        // Setting the initial registration fee
        Vehicle.updateRegistrationFee(5000.0);

        Vehicle vehicle1 = new Vehicle("John Doe", "Car");
        Vehicle vehicle2 = new Vehicle("Jane Smith", "Motorcycle");
        Vehicle vehicle3 = new Vehicle("Emily Johnson", "Truck");

        // Displaying vehicle details
        System.out.println("\nVehicle Details:");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        vehicle3.displayVehicleDetails();

        // Updating the registration fee
        System.out.println("\nUpdating Registration Fee...");
        Vehicle.updateRegistrationFee(7000.0);

        // Displaying vehicle details again with the updated registration fee
        System.out.println("\nVehicle Details After Registration Fee Update:");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        vehicle3.displayVehicleDetails();
    }
}

class Vehicle {

    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Class variable
    private static double registrationFee; // Shared among all Vehicle objects

    // Parameterized Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        System.out.println("A new vehicle has been registered: " + vehicleType + " owned by " + ownerName);
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Class method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration Fee has been updated to: $" + registrationFee);
    }
}
