
public class App {

	public static void main(String[] args) {

		AirConditionFacade acf = new AirConditionFacade();
		acf.startAirconditioningSystem();
		System.out.println("*****************************");
		acf.stopAirconditioningSystem();
	}
}
