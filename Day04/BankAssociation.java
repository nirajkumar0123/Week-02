import java.util.ArrayList;

// BankAccount class
class BankAccount {
    private Bank bank;
    private Customer customer;
    private double balance;
	
    // Constructor
    public BankAccount(Bank bank, Customer customer) {
        this.bank = bank;
        this.customer = customer;
        this.balance = 0.0; // Default balance
	}
	
    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(customer.getName() + " deposited: " + amount + " into " + bank.getName());
			} else {
            System.out.println("Invalid deposit amount.");
		}
	}
	
    // Method to view balance
    public void viewBalance() {
        System.out.println("Customer: " + customer.getName() + " at " + bank.getName() + ", Balance: " + balance);
	}
	
    // Getter for the bank
    public Bank getBank() {
        return bank;
	}
	
    // Getter for the customer
    public Customer getCustomer() {
        return customer;
	}
}

// Customer class
class Customer {
    private String name;
    private int customerId;
	
    // Constructor
    public Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
	}
	
    // Getter for customerId
    public int getCustomerId() {
        return customerId;
	}
	
    // Getter for name
    public String getName() {
        return name;
	}
}

// Bank class
class Bank {
    private String name;
    private ArrayList<BankAccount> accounts;
	
    // Constructor
    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
	}
	
    // Method to open a new account
    public void openAccount(Customer customer) {
        BankAccount account = new BankAccount(this, customer);
        accounts.add(account);
        System.out.println("Account opened for: " + customer.getName() + " in " + name);
	}
	
    // Getter for accounts
    public ArrayList<BankAccount> getAccounts() {
        return accounts;
	}
	
    // Method to display all accounts in the bank
    public void displayAccounts() {
        System.out.println("Bank: " + name + " - Accounts:");
        for (BankAccount account : accounts) {
            System.out.println("Customer ID: " + account.getCustomer().getCustomerId() + ", Name: " + account.getCustomer().getName());
		}
	}
	
    // Getter for bank name
    public String getName() {
        return name;
	}
}

// Main class
public class BankAssociation {
    public static void main(String[] args) {
        // Create banks
        Bank bank1 = new Bank("National Bank");
        Bank bank2 = new Bank("City Bank");
		
        // Create customers
        Customer customer1 = new Customer("Alice", 101);
        Customer customer2 = new Customer("Bob", 102);
		
        // Open accounts for customers in multiple banks
        bank1.openAccount(customer1);
        bank1.openAccount(customer2);
		
        bank2.openAccount(customer1);
		
        // Deposit money into accounts (simulating deposits for different banks)
        for (BankAccount account : bank1.getAccounts()) {
            if (account.getCustomer().equals(customer1)) {
                account.deposit(5000);
			}
		}
		
        for (BankAccount account : bank2.getAccounts()) {
            if (account.getCustomer().equals(customer1)) {
                account.deposit(3000);
			}
		}
		
        // Display accounts in each bank
        bank1.displayAccounts();
        System.out.println();
        bank2.displayAccounts();
	}
}
