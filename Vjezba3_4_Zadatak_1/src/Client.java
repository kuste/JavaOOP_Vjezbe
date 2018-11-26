
public class Client {
	private AbsFactoryTheme abt;
	private ToolBar toolBar;
	private ScrollBar scrollBar;
	private MenuBar menuBar;
	private StatusBar statusBar;
	private Window window;

	public Client(AbsFactoryTheme abt) {
		this.abt = abt;
	}

	public void createUI() {
		this.toolBar = abt.createToolBar();
		this.scrollBar = abt.createScrollBar();
		this.menuBar = abt.createMenuBar();
		this.statusBar = abt.createStatusBar();
		this.window = abt.CreateWindow();
	}

	public void paint() {

		toolBar.paint();
		scrollBar.paint();
		menuBar.paint();
		statusBar.paint();
		window.paint();
		
	}

}
