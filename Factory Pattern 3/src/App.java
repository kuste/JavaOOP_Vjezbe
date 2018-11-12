import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		/**
		 * Application app1 = new Application(new WINGUI_factory()); app1.createUI();
		 * app1.paint();
		 * System.out.println("*****************************************"); Application
		 * app2= new Application(new MACGUI_factory()); app2.createUI(); app2.paint();
		 **/

		String ui;
		Application app;
		while (true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("************************************");
		System.out.println("Unesite win ili mac");
		ui = sc.nextLine();
		
			if (ui.equals("win")) {
				app = new Application(new WINGUI_factory());
				app.createUI();
				app.paint();
			} else if (ui.equals("mac")) {
				app = new Application(new MACGUI_factory());
				app.createUI();
				app.paint();

			} else {
				System.out.println("Nije dobar unos");
			}
		}
	}

}
