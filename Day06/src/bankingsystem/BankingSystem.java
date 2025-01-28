package bankingsystem;
import java.util.ArrayList;

public class BankingSystem {
    public static void main(String[] args) {
        // Create accounts
        BankAccount savingsAccount = new SavingsAccount("SAV123", "Alice", 10000);
        CurrentAccount currentAccount = new CurrentAccount("CUR456", "Bob", 20000);

        // Store accounts in a list
        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(savingsAccount);
        accounts.add(currentAccount);

        // Process accounts dynamically using polymorphism
        for (BankAccount account : accounts) {
            account.displayAccountDetails();
            System.out.println("Interest: " + account.calculateInterest());

            if (account instanceof Loanable loanable) {
                loanable.applyForLoan();
                System.out.println("Loan Eligibility: " + loanable.calculateLoanEligibility());
            }
            System.out.println("-------------------");
        }
    }
}
