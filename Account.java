package firstProgram;

class Account {
	protected double balance;
	protected double interestRate;

	public Account(double initialBalance, double initialInterestRate) {
		balance = initialBalance;
		interestRate = initialInterestRate;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		System.out.println("update balance after withdraw");

	}

	public void calculateInterest() {
		System.out.println("Show calculated interest");
	}

	public void displayBalanceForSavings() {
		System.out.println("Savings account balance: " + balance);
	}

	public void displayBalanceForCurrent() {
		System.out.println("Current Account balance: " + balance);

	}
}
