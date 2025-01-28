package vehiclerentalsystem;

class Truck extends Vehicle implements Insurable {

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 500;// 500 for maintenance
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.1; // 10% of the rental rate as insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance: " + calculateInsurance();
    }
}

