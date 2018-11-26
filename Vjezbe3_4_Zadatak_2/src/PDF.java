
public class PDF extends AbsDocument {

	@Override
	public void open() {
		super.open();
		System.out.println("... *.pdf document...");
	}

	@Override
	public void save() {
		System.out.println("Saving *.pdf document...");

	}

}
