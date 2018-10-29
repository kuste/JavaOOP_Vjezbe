
import java.util.Scanner;

import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new MainFrame();
				
			}
		});
		
/*
		Scanner input = new Scanner(System.in);

		Calculator ds = new SimpleCalculator();
		String prekid = "p";
		try {
			while (true) {
				System.out.println("Dobrodosli u simple Calculator app, unesite anykey za prekid!");
				System.out.println("unesite 2 broja!");
				float num1 = input.nextFloat();
				float num2 = input.nextFloat();
				input.nextLine();
				System.out.println("Unesite operaciju +, -, * ili /");
				String s = input.nextLine();

				if (s.equals("+")) {
					ds.setStrategy(new AddStrategy());
					ds.performCalculation((num1), (num2));
				} else if (s.equals("-")) {
					ds.setStrategy(new DivisionStrategy());
					ds.performCalculation((num1), (num2));
				} else if (s.equals("*")) {
					ds.setStrategy(new SubsStrategy());
					ds.performCalculation((num1), (num2));
				} else if (s.equals("/")) {
					ds.setStrategy(new MultiplyStrategy());
					ds.performCalculation((num1), (num2));
				}

			}
		}

		catch (Exception e) {
			System.out.println("Bye!");
		}*/
	}
	
	
	

}
