
public class CheckingAccount  extends BankAccount {

	private static final double FEE = 0.15; // 15 cents

	// Constructor
    public CheckingAccount(String name, double amount) {
        // Call superclass constructor
        super(name, amount);
        
        // Modify accountNumber to identify it as a checking account
        String modifiedAccountNumber = getAccountNumber() + "-10";
        
        // Set the modified accountNumber using the mutator method
        setAccountNumber(modifiedAccountNumber);
    }

    // Withdraw method overriding the superclass method
    @Override
    public boolean withdraw(double amount) {
        // Add fee for clearing a check
        amount += FEE;
        return super.withdraw(amount);
}
    }

    

 
