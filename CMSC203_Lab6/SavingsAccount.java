
public class SavingsAccount extends BankAccount {
    // Instance variables
    private static final double RATE = 0.025; // Annual interest rate
    private static int savingsNumber = 0; // Number to identify individual savings accounts
    private String accountNumber; // Hides the accountNumber from the superclass
    private double rate = 0.025; // Annual interest rate set to 2.5%

    // Constructor
    public SavingsAccount(String name, double initialBalance) {
        // Call superclass constructor
        super(name, initialBalance);
        
        // Increment savingsNumber and construct the accountNumber
        savingsNumber++;
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    // Method to calculate and deposit monthly interest
    public void postInterest() {
        double monthlyInterest = getBalance() * rate / 12;
        deposit(monthlyInterest);
    }

    // Override getAccountNumber method
    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    // Copy constructor
    public SavingsAccount(SavingsAccount oldAccount, double initialBalance) {
        // Call superclass copy constructor
        super(oldAccount, initialBalance);
        
        // Increment savingsNumber and construct the accountNumber
        savingsNumber++;
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

	/**
	 * @return the rate
	 */
	public static double getRate() {
		return RATE;
	}
}
 