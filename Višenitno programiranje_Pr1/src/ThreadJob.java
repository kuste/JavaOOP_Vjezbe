
public class ThreadJob implements Runnable {

	@Override
	public void run() {
		run2();
		System.out.println("Final message in the thread");
		System.out.println(Thread.currentThread().getName());
		
	}

	private void run2() {
		addInitionalMethod();

	}

	private void addInitionalMethod() {
		System.out.println("Some message from thread one...");
	}
}
