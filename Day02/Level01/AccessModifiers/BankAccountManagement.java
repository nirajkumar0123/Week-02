// Base class BankAccount
class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance amount.");
        }
    }
}

// Subclass SavingsAccount to demonstrate access to public and protected members
class SavingsAccount extends BankAccount {

    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        // Create an instance of SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount(123456, "John Doe", 1500.00);

        // Access public and protected members
        savingsAccount.displayAccountDetails();

        // Access private member through getter
        System.out.println("Balance: " + savingsAccount.getBalance());

        // Modify private member through setter
        savingsAccount.setBalance(2000.00);
        System.out.println("Updated Balance: " + savingsAccount.getBalance());
    }
}
