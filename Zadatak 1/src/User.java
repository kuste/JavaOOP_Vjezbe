
public class User {

	private String name;
	private int id;
	private int cnt;
	private Apartment a;

	public User(String name) {
		this.name = name;
	}

	public void bookApartment(Apartment a) {
		this.a = a;
		a.setBooked(true);
		a.setPayment(new Cash());
		
	}

	public void cancelBooking(Apartment a) {
		a.setBooked(false);

	}

	public void makeCommentOnAccomodation(Apartment a) {

	}

}
