
public class Apartment {

	private String location;
	private Categories categories;
	private String categorie;
	private boolean isBooked;
	private ReservationMethod res;
	private Payment p;

	public Apartment() {

		this.location = "Zadar";
	}

	public void setPayment(Payment p) {
		this.p = p;
	}

	public void setReservationMethod(ReservationMethod res) {
		this.res = res;
	}

	public void description() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Apartment -->\nlocation = " + location + "\nCategorie = " + categorie;
	}

	public void categorize() {
		categories.info();
		this.categorie = categories.getStars();
	}

	public void setCategory(Categories category) {
		this.categories = category;
	}

	public void setBooked(boolean b) {
		this.isBooked = b;
	}

}
