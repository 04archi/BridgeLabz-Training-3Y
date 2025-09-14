public class BankAccount {
    
    // Example fields
    private String accountHolder;
    private int accountNumber;
    private double balance;
    
    // Constructor
    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    // Main method: Entry point
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("John Doe", 123456, 1000.50);
        myAccount.displayAccountDetails();
    }
}
