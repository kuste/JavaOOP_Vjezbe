
public class Mediteran implements MediteranRec, Info {

	String recept = "neodredjeni recept";

	@Override
	public void generateMeditrraneanRecipe() {
		this.recept = "Mediteranski recept";
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
