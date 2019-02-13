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

	private static JMenu fileMenu = new JMenu("File");
	private static JMenuItem saveItem = new JMenuItem("Save as...");
	private static JMenuItem openItem = new JMenuItem("Open...");
	private static JMenuItem exitItem = new JMenuItem("Exit");
	private static JFileChooser fileChooser;

	public AppMenuBar() {
		initMenuBar();
	}

	private void initMenuBar() {

		fileMenu = new JMenu("File");
		saveItem = new JMenuItem("Save as...");
		openItem = new JMenuItem("Open...");
		exitItem = new JMenuItem("Exit");

		fileMenu.add(saveItem);
		fileMenu.add(openItem);
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
