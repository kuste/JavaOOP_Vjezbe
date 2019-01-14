
public class TwoStar implements Categories {

	private String two = "Two Star";

	public TwoStar() {
	}

	@Override
	public void info() {
		System.out.println("Categorie set to twostars");

	}

	@Override
	public String getStars() {
		return two;
	}
}
