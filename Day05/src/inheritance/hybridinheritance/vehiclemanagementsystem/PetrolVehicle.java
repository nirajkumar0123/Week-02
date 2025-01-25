package inheritance.hybridinheritance.vehiclemanagementsystem;

// Subclass: PetrolVehicle
public class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelTankCapacity;  // Fuel tank capacity in liters

    public PetrolVehicle(int maxSpeed, String model, int fuelTankCapacity) {
        super(maxSpeed, model);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling with a " + fuelTankCapacity + " liter fuel tank.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
    }
}

