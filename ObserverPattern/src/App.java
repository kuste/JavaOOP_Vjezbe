import java.util.Timer;
import java.util.TimerTask;

public class App {

	public static void main(String[] args) {

		Observable c1 = new Casopis("ComputerWorld");
		Observable c2 = new Casopis("Redmond Magazine");
		Observable c3 = new Casopis("Network Computing");
		Observable c4 = new Casopis("Linux Magazine ");
		Observable c5 = new Casopis("The Next Web");
		Observable c6 = new Casopis("Recode");

		Pretplatnik p1 = new Pretplatnik("Mate");
		Pretplatnik p2 = new Pretplatnik("Stipe");
		Pretplatnik p3 = new Pretplatnik("Ana");

		p1.subscribe(c1);
		p1.subscribe(c2);
		p1.subscribe(c6);
		p2.subscribe(c1);
		p2.subscribe(c3);
		p3.subscribe(c4);
		p3.subscribe(c5);
		p3.subscribe(c6);

		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				c1.mainLogic();
				c3.mainLogic();
				c5.mainLogic();
			}
		};
		Timer timer = new Timer();
		long delay = 0;
		long intevalPeriod = 3 * 1000;

		timer.scheduleAtFixedRate(task, delay, intevalPeriod);

		TimerTask task2 = new TimerTask() {
			@Override
			public void run() {
				c2.mainLogic();
				c4.mainLogic();
				c6.mainLogic();

			}
		};
		Timer timer2 = new Timer();
		long delay2 = 0;
		long intevalPeriod2 = 9 * 1000;

		timer.scheduleAtFixedRate(task2, delay2, intevalPeriod2);

		TimerTask task3 = new TimerTask() {
			@Override
			public void run() {
				p1.unsubscribe(c6);
				p1.subscribe(c4);
				p3.unsubscribe(c5);
				p2.subscribe(c2);
			}
		};
		Timer timer3 = new Timer();

		timer.schedule(task3, 12000);
	}

}
