package firstProgram;

class CurrentAccount extends Account {
	public CurrentAccount(double initialBalance, double initialInterestRate) {
		super(initialBalance, initialInterestRate);
	}

	// Implementing overridden methods
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}

	@Override
	public void calculateInterest() {
		System.out.println("Current accounts do not earn interest.");
	}
}
