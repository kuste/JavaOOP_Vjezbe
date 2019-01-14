
public class App {

	public static void main(String[] args) {

		Indija ind = new Indija();
		ind.provideAdditionalInfo();
		ind.generateIndianRecipe();
		ind.provideAdditionalInfo();

		Mediteran med = new Mediteran();

		med.provideAdditionalInfo();
		med.generateMeditrraneanRecipe();
		med.provideAdditionalInfo();
	}

}
