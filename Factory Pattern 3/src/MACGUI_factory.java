
public class MACGUI_factory implements GUIFactory {

	@Override
	public Button createButton() {
		MacBtn macBtn = new MacBtn();
		return macBtn;
	}

	@Override
	public CheckBox createCheckBox() {
		MacChcBox macChcBox = new MacChcBox();
		return macChcBox;
	}

}
