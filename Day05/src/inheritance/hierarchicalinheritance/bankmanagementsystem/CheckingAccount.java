package inheritance.hierarchicalinheritance.bankmanagementsystem;
// Subclass: CheckingAccount
class CheckingAccount extends BankAccount {
    private double withdrawalLimit; // Daily withdrawal limit

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        displayAccountInfo();
        System.out.println("Withdrawal Limit:" + withdrawalLimit + " per day");
    }
}

