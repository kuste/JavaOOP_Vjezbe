public class BankAccount {
	
	private double balance;
	
	public BankAccount(double balance) {
		
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
	
	public void withdrawFromAcc(double amount) {
	
		balance = balance - amount;
	}
}
