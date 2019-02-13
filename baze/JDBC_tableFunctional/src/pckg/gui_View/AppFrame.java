package pckg.gui_View;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import pckg.controller.Controller;

public class AppFrame extends JFrame {
	
	private ViewPanel viewPanel;
	private FormPanel formPanel;
	private TablePanel tablePanel;
	private Controller controller;
	private AppMenuBar appMenuBar;
	
	
	public AppFrame() {
		super("DB application");
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);;
		initALL();
		layoutALL();
		activateApp();
	}
	
	
	private void layoutALL() {
		
		setLayout(new BorderLayout());
		add(viewPanel, BorderLayout.WEST);
		add(tablePanel, BorderLayout.EAST);
		add(formPanel,BorderLayout.SOUTH);
	}
	
	private void initALL() {
		controller = new Controller();
		viewPanel = new ViewPanel(controller);
		formPanel = new FormPanel();
		tablePanel = new TablePanel(controller.getDBS());
		this.setJMenuBar(new AppMenuBar());
		AppMenuBar.activateMenuBar(controller, tablePanel, viewPanel);
	}
	
	private void activateApp() {
		
		
		formPanel.setFormListener(new FormListener() {
			
			@Override
			public void formEventOccured(FormEvent fe) {
				
				String name = fe.getName();
				String mail = fe.getMail();
				String edu = fe.getEdu();
				String region = fe.getRegion();
				String emplStatus = fe.getEmplStatus();
				
				String data = name + " <-> " + mail + " <-> " + edu + " <-> " + region + " <-> " + emplStatus;
				viewPanel.appendTxt(data);
				int sz = controller.getAll4DBS().size();
				controller.setNewClient2DBS(fe, sz);
				tablePanel.refreshTableView();
				
			}
		});
		
		tablePanel.setTablePanelListener(new TablePanelListener() {
			
			@Override
			public void tableEventOccured(int row) {
				
				controller.removeClientFromDB(row);
				tablePanel.getTableMode().fireTableRowsDeleted(row, row);
				controller.refreshViewPanel(viewPanel);
			}
		});
	
	}
	
}
