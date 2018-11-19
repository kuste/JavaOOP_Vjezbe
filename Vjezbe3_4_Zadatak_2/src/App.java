
public class App {

	public static void main(String[] args) {
		
		
		WebBrowser web = new WebBrowser();
		web.fethcDocument("PDF");
		web.openDocument();
		web.saveDocument();
		web.closeDocument();
		System.out.println("/////////////////////////////");
		web.fethcDocument("DOC");
		web.openDocument();
		web.saveDocument();
		web.closeDocument();
		System.out.println("/////////////////////////////");
		web.fethcDocument("PPT");
		web.openDocument();
		web.saveDocument();
		web.closeDocument();
	}

}
