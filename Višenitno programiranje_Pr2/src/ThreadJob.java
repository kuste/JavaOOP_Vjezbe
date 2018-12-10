
public class ThreadJob implements Runnable {

	@Override
	public void run() {
		addInitionalMethod();

	}

	private void addInitionalMethod() {
		for (int k = 0; k < 20; k++)
			System.out.println("Running message: "+ Thread.currentThread().getName());
	}
}
