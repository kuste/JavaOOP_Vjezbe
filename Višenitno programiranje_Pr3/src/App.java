
public class App {

	public static void main(String[] args) {

		
		BankAccount account = new BankAccount(1000.00);
		Runnable transaction = new BankTransaction(account);
		Thread entOne = new Thread(transaction);
		Thread entTwo = new Thread(transaction);

	
		entOne.setName("Ivan");
		entTwo.setName("Brother");

	
		entOne.start();
		entTwo.start();
		
		//kom
		
		
		
	}

}
