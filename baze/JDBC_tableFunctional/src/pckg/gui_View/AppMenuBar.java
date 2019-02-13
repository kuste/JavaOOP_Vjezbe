package pckg.gui_View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;

import pckg.controller.Controller;

public class AppMenuBar extends JMenuBar {

	private static JMenu fileMenu;
	private static JMenuItem saveItem;
	private static JMenuItem openItem;
	private static JMenuItem exitItem;
	private static JFileChooser fileChooser;
	private static JMenuItem save2Dbs;
	private static JMenuItem load2Dbs;
	private static JMenuItem disconnectFromDbs;

	public AppMenuBar() {
		initMenuBar();
	}

	private void initMenuBar() {
		save2Dbs = new JMenuItem("Save to dbs");
		load2Dbs = new JMenuItem("Load from dbs");
		disconnectFromDbs = new JMenuItem("Disconnect from dbs");

		fileMenu = new JMenu("File");
		saveItem = new JMenuItem("Save as...");
		openItem = new JMenuItem("Open...");
		exitItem = new JMenuItem("Exit");

		fileMenu.add(saveItem);
		fileMenu.add(openItem);
		fileMenu.addSeparator();
		fileMenu.add(save2Dbs);
		fileMenu.add(load2Dbs);
		fileMenu.add(disconnectFromDbs);
		fileMenu.addSeparator();
		fileMenu.add(exitItem);

		this.add(fileMenu);
	}

	public static void activateMenuBar(Controller controller, TablePanel tablePanel, ViewPanel viewPanel) {

		// Setting mnemonics to FileMenu
		fileMenu.setMnemonic(KeyEvent.VK_F);
		// Setting accelerators
		exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
		openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK));
		save2Dbs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
		load2Dbs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
		disconnectFromDbs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
		// Activate saveItem
		saveItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				fileChooser = new JFileChooser("Save file dialog");
				FileNameExtensionFilter filter = new FileNameExtensionFilter("database files", "cli");
				fileChooser.setFileFilter(filter);
				fileChooser.setMultiSelectionEnabled(false);
				int returnVal = fileChooser.showSaveDialog(null);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File file = fileChooser.getSelectedFile();
					System.out.println(file.toString());
					try {
						controller.save2FileDBS(file);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					System.out.println("You save file: " + fileChooser.getSelectedFile().getName() + " : "
							+ fileChooser.getSelectedFile().getPath());
				} else if (returnVal == JFileChooser.CANCEL_OPTION) {
					JOptionPane.showMessageDialog(null, "Canceled by user", "Cancel dialog", JOptionPane.CANCEL_OPTION);

				}

			}
		});
		save2Dbs.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					controller.connect2MySQL();
				} catch (Exception e) {
					System.out.println("Cant connent");
				}

				controller.save2DBS();
				System.out.println("Saved to dbs");
			}
		});

		load2Dbs.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				controller.connect2MySQL();
				controller.loadFromDbS();
				controller.refreshTable(tablePanel);
				controller.refreshViewPanel(viewPanel);

			}
		});

		disconnectFromDbs.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				controller.disconnnectFromDBS();
			}
		});

		// Activate openItem
		openItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				fileChooser = new JFileChooser("Open file dialog");
				FileNameExtensionFilter filter = new FileNameExtensionFilter("database files", "cli");
				fileChooser.setFileFilter(filter);
				int returnVal = fileChooser.showOpenDialog(null);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File file = fileChooser.getSelectedFile();
					try {
						controller.getDataBase4File(file);
						controller.refreshTable(tablePanel);
						controller.refreshViewPanel(viewPanel);
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					System.out.println("You choose to open file -> " + fileChooser.getSelectedFile().getName() + " : "
							+ fileChooser.getSelectedFile().getPath());
				} else if (returnVal == JFileChooser.CANCEL_OPTION) {
					JOptionPane.showMessageDialog(null, "Canceled by user", "Cancel dialog", JOptionPane.CANCEL_OPTION);
				}

			}
		});

		// Activate exitItem

		exitItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

}
