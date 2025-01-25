package inheritance.hybridinheritance.vehiclemanagementsystem;

// Main class: VehicleManagementSystem
public class VehicleManagementSystem {
    public static void main(String[] args) {
        // Create instances of ElectricVehicle and PetrolVehicle
        ElectricVehicle electricCar = new ElectricVehicle(150, "Tesla Model S", 100);
        PetrolVehicle petrolCar = new PetrolVehicle(180, "BMW 320i", 60);

        // Display information and perform actions
        electricCar.displayInfo();
        electricCar.charge();
        System.out.println();

        petrolCar.displayInfo();
        petrolCar.refuel();
    }
}

