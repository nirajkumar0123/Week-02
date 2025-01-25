package inheritance.hybridinheritance.vehiclemanagementsystem;

// Subclass: ElectricVehicle
public class ElectricVehicle extends Vehicle {
    private int batteryCapacity;  // Battery capacity in kWh

    public ElectricVehicle(int maxSpeed, String model, int batteryCapacity) {
        super(maxSpeed, model);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println(model + " is charging with " + batteryCapacity + " kWh battery capacity.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

