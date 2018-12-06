
public class App {

	public static void main(String[] args) {

		AbsFacade order = new ConcreteFacade();
		order.login();
		order.confirmation();
		order.payment();
		order.delivery();
	}

}
