
public class HTML extends AbsDocument {

	@Override
	public void open() {
		super.open();
		System.out.println("... *.html document...");
	}

	@Override
	public void save() {
		System.out.println("Saving *.html document...");

	}

}
