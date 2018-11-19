
public interface AbsWebBrowser {

	void openDocument();
	void closeDocument();
	void saveDocument();
	
	AbsDocument fethcDocument(String url);
	
}
