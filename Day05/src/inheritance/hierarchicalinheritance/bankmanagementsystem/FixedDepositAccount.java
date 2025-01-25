package inheritance.hierarchicalinheritance.bankmanagementsystem;

// Subclass: FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    private int maturityPeriod; // in months
    private double fixedInterestRate;

    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod, double fixedInterestRate) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
        this.fixedInterestRate = fixedInterestRate;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        displayAccountInfo();
        System.out.println("Maturity Period: " + maturityPeriod + " months");
        System.out.println("Fixed Interest Rate: " + fixedInterestRate + "%");
    }
}

