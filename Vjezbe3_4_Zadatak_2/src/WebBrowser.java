
public class WebBrowser implements AbsWebBrowser {
	protected AbsDocument absDoc;

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
			PDFPlugin pdf = new PDFPlugin();
			return absDoc = pdf.getDocument();
		} else if (url.equals("DOC")) {
			DOCPlugin doc = new DOCPlugin();
			return absDoc = doc.getDocument();
		} else if (url.equals("PPT")) {
			PPTPlugin ppt = new PPTPlugin();
			return absDoc = ppt.getDocument();
		}
		return absDoc = new HTML();
	}

}
