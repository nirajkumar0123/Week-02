package ridehailingapplication;

import java.util.ArrayList;
import java.util.List;

public class RideHailingApp {
    public static void main(String[] args) {
        // Create a list of vehicles
        List<Vehicle> vehicles = new ArrayList<>();

        // Add vehicles to the list
        Vehicle car = new Car("CAR123", "Alice", 15);
        Vehicle bike = new Bike("BIKE456", "Bob", 8);
        Vehicle auto = new Auto("AUTO789", "Charlie", 12);

        // Update GPS locations for vehicles
        ((GPS) car).updateLocation("Downtown");
        ((GPS) bike).updateLocation("City Center");
        ((GPS) auto).updateLocation("Suburbs");

        // Add vehicles to the list
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        // Calculate and display fares for each vehicle
        double distance = 10;
        RideFareCalculator.calculateFares(vehicles, distance);
    }
}

