
public class DarkThemeFactory implements AbsFactoryTheme {

	@Override
	public ScrollBar createScrollBar() {
		DarkThemeScrollBar darkScrollbar = new DarkThemeScrollBar();
		return darkScrollbar;
	}

	@Override
	public MenuBar createMenuBar() {
		DarkThemeMenubar darkMenubar = new DarkThemeMenubar();
		return darkMenubar;
	}

	@Override
	public StatusBar createStatusBar() {
		DarkThemeStatusbar darkStatusbar = new DarkThemeStatusbar();
		return darkStatusbar;
	}

	@Override
	public ToolBar createToolBar() {
		DarkThemeToolbar darkToolbar = new DarkThemeToolbar();
		return darkToolbar;
	}

	@Override
	public Window CreateWindow() {
		DarkThemeWindow darkWindow = new DarkThemeWindow();
		return darkWindow;
	}

}
