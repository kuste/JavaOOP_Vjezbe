
public class SolarizedThemeFactory implements AbsFactoryTheme {

	@Override
	public ScrollBar createScrollBar() {
		SolarizedThemeScrollbar darkScrollbar = new SolarizedThemeScrollbar();
		return darkScrollbar;
	}

	@Override
	public MenuBar createMenuBar() {
		SolarizedThemeMenubar darkMenubar = new SolarizedThemeMenubar();
		return darkMenubar;
	}

	@Override
	public StatusBar createStatusBar() {
		SolarizedThemeStatusbar darkStatusbar = new SolarizedThemeStatusbar();
		return darkStatusbar;
	}

	@Override
	public ToolBar createToolBar() {
		SolarizedToolbarTheme darkToolbar = new SolarizedToolbarTheme();
		return darkToolbar;
	}

	@Override
	public Window CreateWindow() {
		SolarizedThemeWindow darkWindow = new SolarizedThemeWindow();
		return darkWindow;
	}

}
