public class App {
	public static void main(String[] args) throws InterruptedException {

		Robot robi = new Robot("RoboCop");
		Runnable job = new ThreadJob();
		Thread thr1 = new Thread(job);
		Thread thr2 = new Thread(job);
		thr1.setName("Prva nit");
		thr2.setName("Druga nit");

		System.out.println("********************** Before in main **********************");
		System.out.println("Message in the program that precede thread run ...");
		System.out.println(Thread.currentThread().getName() + " - start");

		robi.robotDescription();
		thr1.start();
		Thread.currentThread().sleep(1000);
		thr2.start();
		Thread.currentThread().sleep(1000);
		System.out.println(Thread.currentThread().getName() + " - end");

	}

}