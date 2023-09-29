package firstProgram;

class SavingsAccount extends Account {
	public SavingsAccount(double initialBalance, double initialInterestRate) {
		super(initialBalance, initialInterestRate);
	}

	// Implementing overridden methods
	@Override
	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Insufficient balance.");
		}
	}

	@Override
	public void calculateInterest() {
		double calculatedInterest = balance * interestRate / 100;
		balance += calculatedInterest;
	}
}
