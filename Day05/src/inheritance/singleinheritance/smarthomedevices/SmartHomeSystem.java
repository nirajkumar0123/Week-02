package inheritance.singleinheritance.smarthomedevices;

public class SmartHomeSystem {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("T123", "ON", 22);

        // Display the thermostat's status
        System.out.println("Smart Home Device Status:");
        thermostat.displayStatus();
    }
}

