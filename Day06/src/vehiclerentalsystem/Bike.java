package vehiclerentalsystem;

class Bike extends Vehicle implements Insurable {

    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.03; // 3% of the rental rate as insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance: " + calculateInsurance();
    }
}

