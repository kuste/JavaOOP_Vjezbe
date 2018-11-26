import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Odaberite 1 za printanje nove grafike ili 2 za printanje starie grafike");
		String input = sc.nextLine();

		if (input.equals("1")) {

			Ploter ploter = new Ploter();

			ploter.printGrafike("Neka nova grafika");
		}
		else if (input.equals("2")) {
			NewSoftware soft = new PloterAdapter(new OldSoftware());

			soft.ispisGrafike("nekakva grafika");
		}
		else {
			System.out.println("krivi unos");
		}
		
	}

}
