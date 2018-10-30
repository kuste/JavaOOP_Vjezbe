import java.util.ArrayList;

public class Casopis implements Observable {

	private Observer o;
	private String obavjest;
	private ArrayList<Observer> observers = new ArrayList<>();
	private String casopis;

	public Casopis(String name) {
		this.casopis = name;

	}

	@Override
	public void add(Observer o) {
		observers.add(o);

	}

	@Override
	public void remove(Observer o) {
		int index = observers.indexOf(o);
		System.out.println("======================================");
		System.out.println("Pretplatnik " + o.getName() + " unsubscribed from " + casopis);
		observers.remove(index);
	}

	@Override
	public void notifyObs() {
		for (Observer o : observers) {
			o.update(obavjest);
		}

	}

	@Override
	public void mainLogic() {
		obavjest = "Izasao je novi br (" + casopis + ")";
		notifyObs();

	}

	@Override
	public String getName() {
		return casopis;

	}

}
