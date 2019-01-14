
public class ReserveAccomodations {
	private Payment p;
	private ReservationMethod m;
	private Apartment a;

	public ReserveAccomodations() {
		// TODO Auto-generated constructor stub
	}

	public void setReservationMethod(ReservationMethod m) {
		this.m = m;
	}

	public void makeBooking(Apartment a) {
		this.a = a;
		a.setBooked(true);
	}

	public void makePayment(Payment p) {

		this.p = p;

	}

}
