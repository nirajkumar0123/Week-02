package ridehailingapplication;

import java.util.List;

public class RideFareCalculator {
    public static void calculateFares(List<Vehicle> vehicles, double distance) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails());
            System.out.println("Fare for " + distance + " km: " + vehicle.calculateFare(distance));

            // If the vehicle supports GPS
            if (vehicle instanceof GPS) {
                GPS gpsEnabledVehicle = (GPS) vehicle;
                System.out.println("Current Location: " + gpsEnabledVehicle.getCurrentLocation());
            }
            System.out.println("---------------------------");
        }
    }
}
