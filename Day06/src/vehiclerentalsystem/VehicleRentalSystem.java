package vehiclerentalsystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {

    public static void main(String[] args) {
        // Create a list of vehicles
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("CAR123", 1000, "POLICY1234"));
        vehicles.add(new Bike("BIKE456", 300, "POLICY5678"));
        vehicles.add(new Truck("TRUCK789", 2000, "POLICY9101"));

        // Display information for each vehicle
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo(5); // Call the method with the number of rental days
        }
    }
}
