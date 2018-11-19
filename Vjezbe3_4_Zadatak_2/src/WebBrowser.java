
public class WebBrowser implements AbsWebBrowser {
	private AbsDocument absDoc;

	public WebBrowser() {

	}

	@Override
	public void openDocument() {
		absDoc.open();

	}

	@Override
	public void closeDocument() {
		absDoc.close();
	}

	@Override
	public void saveDocument() {
		absDoc.save();

	}

	@Override
	public AbsDocument fethcDocument(String url) {
		System.out.println("Fetching document from a web server...");

		if (url.equals("PDF")) {
			return absDoc = new PDF();
		} else if (url.equals("DOC")) {
			return absDoc = new DOC();
		} else if (url.equals("PPT")) {
			return absDoc = new PPT();

			
		}
		return absDoc;
	}
}
