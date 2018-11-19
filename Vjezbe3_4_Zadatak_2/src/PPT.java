
public class PPT extends AbsDocument {

	@Override
	public void open() {
		super.open();
		System.out.println("... *.ppt document...");
	}

	@Override
	public void save() {
		System.out.println("Saving *.ppt document...");

	}

}
