public class BankAccount {
    private double balance;

    // Constructor to initialize balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Public method to deposit funds
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    // Protected method to withdraw funds
    protected void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    // Default-access method to check balance
    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        // Create object of BankAccount
        BankAccount account = new BankAccount(1000.0);

        // Access public method
        account.deposit(500.0);

        // Access protected method (only within same class or subclass)
        account.withdraw(200.0);

        // Access default-access method (only within same class or same package)
        account.checkBalance();

        // Attempt to access private variable (will result in compiler error)
        // System.out.println(account.balance); // Uncomment to see error
    }
}


