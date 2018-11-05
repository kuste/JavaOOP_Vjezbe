
public class Trokut implements BasicShape{

public static final String nameCircle = "Trokut";
	
	private String shName;

	@Override
	public String shapeName(String name) {
		this.shName = nameCircle;
		return shName;
	}

	@Override
	public void draw() {
		System.out.println("Drawing---> " + shName);

	}

	@Override
	public void resize(int size) {
		System.out.println("Basic shape resized " + size + " times");

	}

	@Override
	public String descritption() {
		String des = "Basic shape " + shName;
		return des;
	}

	@Override
	public boolean isHide(int num) {
		if (num == 1) {
			return true;
		} else {
			return false;
		}
	}


}
