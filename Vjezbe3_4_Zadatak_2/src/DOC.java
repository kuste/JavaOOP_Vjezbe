
public class DOC extends AbsDocument {

	@Override
	public void open() {
		super.open();
		System.out.println("... *.doc document...");
	}

	@Override
	public void save() {
		System.out.println("Saving *.doc document...");

	}

}
