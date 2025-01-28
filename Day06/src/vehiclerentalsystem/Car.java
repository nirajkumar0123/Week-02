package vehiclerentalsystem;

class Car extends Vehicle implements Insurable {

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05; // 5% of the rental rate as insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance: " + calculateInsurance();
    }
}
