package bankingsystem;

class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.01; // 1% annual interest

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan application submitted for Current Account: " + getAccountNumber());
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 2; // Assume loan eligibility is double the balance.
    }
}

