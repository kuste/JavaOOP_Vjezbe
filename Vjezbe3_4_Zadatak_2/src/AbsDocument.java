
public abstract class AbsDocument {

	public void open() {
		
		System.out.println("Opening document...");

	}

	public void close() {
		System.out.println("Closing document...");

	}

	public abstract void save();

}
