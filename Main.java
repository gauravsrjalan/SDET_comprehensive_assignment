package firstProgram;

public class Main {
	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount(1000.0, 5.0);
		savingsAccount.deposit(500.0);
		savingsAccount.calculateInterest();
		savingsAccount.displayBalanceForSavings();
		CurrentAccount currentAccount = new CurrentAccount(2000.0, 0.0);
		currentAccount.withdraw(300.0);
		currentAccount.calculateInterest();
		currentAccount.displayBalanceForCurrent();
	}
}
