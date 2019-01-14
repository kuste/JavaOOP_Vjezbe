
public class App {

	public static void main(String[] args) {

		Apartment a = new Apartment();

		a.setCategory(new OneStar());
		a.categorize();
		a.description();
		a.setReservationMethod(new WebPage());

		User u = new User("Sime");
		u.bookApartment(a);
		u.makeCommentOnAccomodation(a);
	}

}
