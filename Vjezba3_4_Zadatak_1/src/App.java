import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Choose your destiny:");
		System.out.println("1 - Light Theme");
		System.out.println("2 - Dark Theme");
		System.out.println("3 - Solarized Theme");
		String in = input.nextLine();
		if (in.equals("1")) {

			Client client = new Client(new LightThemeFactory());
			client.createUI();
			client.paint();

		} else if (in.equals("2")) {
			Client client = new Client(new DarkThemeFactory());
			client.createUI();
			client.paint();

		} else if (in.equals("3")) {
			Client client = new Client(new SolarizedThemeFactory());
			client.createUI();
			client.paint();

		}else {
			System.out.println("Netocan unos");
		}
			

	}

}
