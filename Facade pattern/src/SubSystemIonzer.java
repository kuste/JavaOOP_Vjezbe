
public class SubSystemIonzer {

	private boolean ionz;

	public void setIonz(boolean ionz) {
		this.ionz = ionz;

		if (ionz == true) {
			System.out.println("Ionizer on");
		}else {
			System.out.println("Ionizer off");
		}

	}

}
