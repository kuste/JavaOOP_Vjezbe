
public class Pretplatnik implements Observer {

	private String name;

	public Pretplatnik(String name) {
		this.name = name;
	}

	public void subscribe(Observable o) {
		o.add(this);
		System.out.println("Novi pretplatnik " + name + " za casopis " + o.getName());
	}

	public void unsubscribe(Observable o) {
		o.remove(this);
	}

	@Override
	public void update(String s) {

		System.out.println("*************************");
		System.out.println(name + " " + s);

	}

	@Override
	public String getName() {

		return name;
	}

}
