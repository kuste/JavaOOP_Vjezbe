
public class LightThemeFactory implements AbsFactoryTheme {

	@Override
	public ScrollBar createScrollBar() {
		LightThemeScrollbar darkScrollbar = new LightThemeScrollbar();
		return darkScrollbar;
	}

	@Override
	public MenuBar createMenuBar() {
		LightThemeMenubar darkMenubar = new LightThemeMenubar();
		return darkMenubar;
	}

	@Override
	public StatusBar createStatusBar() {
		LightThemeStatusbar darkStatusbar = new LightThemeStatusbar();
		return darkStatusbar;
	}

	@Override
	public ToolBar createToolBar() {
		LightThemeToolbar darkToolbar = new LightThemeToolbar();
		return darkToolbar;
	}

	@Override
	public Window CreateWindow() {
		LightThemeWindow darkWindow = new LightThemeWindow();
		return darkWindow;
	}

}
