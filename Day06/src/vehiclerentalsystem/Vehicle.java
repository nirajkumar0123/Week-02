package vehiclerentalsystem;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    private String insurancePolicyNumber;

    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    // Encapsulation: Allow access to sensitive details only through specific methods
    public String getInsurancePolicyDetails() {
        return "Policy Number: " + insurancePolicyNumber;
    }

    public abstract double calculateRentalCost(int days);

    public void displayInfo(int days) {
        System.out.println("Vehicle Type: " + type);
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Rental Cost for - " + days + " days: " + calculateRentalCost(days));

        // Check if the vehicle implements Insurable
        if (this instanceof Insurable insurable) {
            System.out.println(insurable.getInsuranceDetails());
        }
        System.out.println("-------------");
    }
}

