import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		
		

		Random rnd = new Random();
		int num = rnd.nextInt(5) + 1;

		if (num == 1) {

			WebBrowser web = new WebBrowser();
			web.fethcDocument("PDF");
			web.openDocument();
			web.saveDocument();
			web.closeDocument();
			System.out.println("/////////////////////////////");

		} else if (num == 2)

		{

			WebBrowser web = new WebBrowser();
			web.fethcDocument("DOC");
			web.openDocument();
			web.saveDocument();
			web.closeDocument();
			System.out.println("/////////////////////////////");
		}

		else if (num == 3) {

			WebBrowser web = new WebBrowser();
			web.fethcDocument("PPT");
			web.openDocument();
			web.saveDocument();
			web.closeDocument();
			System.out.println("/////////////////////////////");
		}else {
			WebBrowser web = new WebBrowser();
			web.fethcDocument("");
			web.openDocument();
			web.saveDocument();
			web.closeDocument();
			System.out.println("/////////////////////////////");
		}
	}
}
