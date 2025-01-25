package inheritance.hierarchicalinheritance.bankmanagementsystem;

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

