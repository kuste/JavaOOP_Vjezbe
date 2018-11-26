
public class Application {

	private GUIFactory guiFactiory;
	private Button btn;
	private CheckBox chb;

	public Application(GUIFactory guiFactory) {
		this.guiFactiory = guiFactory;
	}

	public void createUI() {
		btn = guiFactiory.createButton();
		chb = guiFactiory.createCheckBox();
	}

	public void paint() {
		
		btn.paint();
		chb.paint();

	}
}
