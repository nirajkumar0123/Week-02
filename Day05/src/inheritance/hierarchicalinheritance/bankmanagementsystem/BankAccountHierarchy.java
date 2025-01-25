package inheritance.hierarchicalinheritance.bankmanagementsystem;

public class BankAccountHierarchy {

    public static void main(String[] args) {
        // Create instances of each account type
        SavingsAccount savingsAccount = new SavingsAccount("SA123", 5000, 3.5);
        CheckingAccount checkingAccount = new CheckingAccount("CA456", 3000, 1000);
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("FD789", 10000, 12, 5.0);

        // Display information about each account type
        savingsAccount.displayAccountType();
        System.out.println();

        checkingAccount.displayAccountType();
        System.out.println();

        fixedDepositAccount.displayAccountType();
    }
}

