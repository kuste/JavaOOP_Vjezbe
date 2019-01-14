
public class Indija implements IndianRec, Info {

	String recept = "neodredjeni recept";

	@Override
	public void generateIndianRecipe() {
		this.recept = "Indijski recept";

	}

	@Override
	public void provideAdditionalInfo() {
		System.out.println("ovo je neki " + recept);

	}

	@Override
	public void recommendWebSources() {
		// TODO Auto-generated method stub

	}

}
