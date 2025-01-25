package assistedproblems.vehicletransportsystem;

public class Motorcycle extends Vehicle {
    private String bikeModel;

    public Motorcycle(int maxSpeed, String fuelType, String bikeModel) {
        super(maxSpeed, fuelType);
        this.bikeModel = bikeModel;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bike model: " + bikeModel);
    }
}
