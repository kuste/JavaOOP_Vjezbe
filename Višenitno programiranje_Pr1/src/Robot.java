import java.util.concurrent.ThreadLocalRandom;

public class Robot {

	private String name;
	private int id;

	public Robot(String name) {
		this.name = name;
		id = ThreadLocalRandom.current().nextInt();
	}

	public void robotDescription() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		String desc = "Robot name: " + name + " id: " + id;
		return desc;
	}

}
