package assistedproblems.vehicletransportsystem;

public class VehicleTransportSystem {
    public static void main(String[] args) {
        Vehicle car = new Car(150, "Petrol", 5);
        Vehicle truck = new Truck(80, "Diesel", 10.5);
        Vehicle bike = new Motorcycle(180, "Petrol", "Honda CBR");

        // Store objects in an array of Vehicle type
        Vehicle[] vehicles = {car, truck, bike};

        // Demonstrate polymorphism
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getClass().getSimpleName() + " Details:");
            vehicle.displayInfo();
            System.out.println();
        }
    }
}
