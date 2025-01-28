package ridehailingapplication;

// Subclass for Auto
class Auto extends Vehicle implements GPS {
    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation != null ? currentLocation : "Location not set";
    }

    @Override
    public void updateLocation(String location) {
        this.currentLocation = location;
    }
}