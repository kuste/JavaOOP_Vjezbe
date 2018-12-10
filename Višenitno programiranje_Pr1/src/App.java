public class App {
	public static void main(String[] args) throws InterruptedException {

		Robot robi = new Robot("RoboCop");
		Runnable job = new ThreadJob();
		Thread thr = new Thread(job);
		thr.setName("Prva nit");

	
		System.out.println("********************** Before in main **********************");
		System.out.println("Message in the program that precede thread run ...");
		robi.robotDescription();
		thr.start();
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().sleep(2000);
		System.out.println("************************ After in main ******************");
		System.out.println("Message - final in main .......");
		

	}

}