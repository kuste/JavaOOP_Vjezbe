import java.text.DecimalFormat;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class BankTransaction implements Runnable {

	private BankAccount account;
	private double withdraw;
	private static DecimalFormat df2 = new DecimalFormat("0.##");

	public BankTransaction(BankAccount account) {
		this.account = account;

	}

	@Override
	public void run() {

		for (int k = 1; k <= 10; k++) {
			
			withdraw = ThreadLocalRandom.current().nextDouble(100, 300);

			// System.out.println("++++++++++++++++++++++ "+
			// Thread.currentThread().getName());

			if (account.getBalance() > 0) {
				System.out.println("Stanje racuna --> " + account.getBalance());
				makeWithdrawal(withdraw);
				

			} else {
				System.out.println("Accout has no more money");
				System.out.println("Stanje racuna --> " + account.getBalance());
				// Thread.currentThread().stop();

			}
			
		}

	}

	private synchronized void makeWithdrawal(double amount) {

		if (account.getBalance() > amount) {
			// System.out.println("Stanje racuna --> " + account.getBalance());
			System.out.println(Thread.currentThread().getName() + " is ready to withdraw for " + amount);
			try {
				// System.out.println(Thread.currentThread().getName()+" goes to sleep");
				Thread.sleep(500);

			} catch (InterruptedException e) {

			}
			// System.out.println(Thread.currentThread().getName() + " --> woke up...");
			account.withdrawFromAcc(amount);

			System.out.println(Thread.currentThread().getName() + " completes the withdrawal for " + amount);
		}

		else {

			System.out.println(Thread.currentThread().getName() + " is ready to withdraw for " + amount);
			System.out.println("Account balance : " + account.getBalance());

			System.out.println(
					Thread.currentThread().getName() + " completes the withdrawal for " + account.getBalance());
			
			Thread.currentThread().stop();
			
			account.withdrawFromAcc(account.getBalance());

		}

	}

}
