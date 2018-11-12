
public class WINGUI_factory implements GUIFactory {

	@Override
	public Button createButton() {
		WinBtn winBtn = new WinBtn();
		return winBtn;
	}

	@Override
	public CheckBox createCheckBox() {
		WinChcBox winChcBox = new WinChcBox();
		return winChcBox;
	}

}
