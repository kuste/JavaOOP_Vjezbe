package pckg.gui_View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;

import pckg.controller.Controller;
import pckg.model.Cl_DBS;

public class TablePanel extends JPanel {

	private JTable table;
	private Cl_DBS dataBase;
	private AbstractTableModel tableModel;
	private JPopupMenu popup;
	private JMenuItem deleteItem = new JMenuItem("Delete row");
	private TablePanelListener listener;


	public TablePanel(Cl_DBS dbs) {
		
		setLayout(new BorderLayout());
		this.dataBase = dbs;
		Dimension dim = getPreferredSize();
		dim.height = 300;
		dim.width = 380;
		setPreferredSize(dim);
		initComps();
		add(new JScrollPane(table),BorderLayout.CENTER);

	}
	
	
	public AbstractTableModel getTableMode() {
		return tableModel;
	}

	private void initComps() {

		tableModel = new AbstractTableModel() {

			String[] columNames = { "ID", "Name", "Mail", "Education", "Region", "Employment" };

			@Override
			public String getColumnName(int col) {
				return columNames[col];
			}

			@Override
			public Object getValueAt(int row, int col) {
				switch (col) {

				case (0):
					return dataBase.getAllClients().get(row).getId();
				case (1):
					return dataBase.getAllClients().get(row).getName();
				case (2):
					return dataBase.getAllClients().get(row).getMail();
				case (3):
					return dataBase.getAllClients().get(row).getEduCat();
				case (4):
					return dataBase.getAllClients().get(row).getRegCat();
				case (5):
					return dataBase.getAllClients().get(row).getEmplCat();
				}
				return null;
			}

			@Override
			public int getRowCount() {
				int sz = dataBase.getAllClients().size();
				return sz;
			}

			@Override
			public int getColumnCount() {
				return columNames.length;
			}
		};

		table = new JTable(tableModel);
		
		JTableUtilities.setCellsAlignment(table, SwingConstants.CENTER);
		popup = createPopUpMenu();
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent mev) {
				
				int row = table.rowAtPoint(mev.getPoint());
				table.getSelectionModel().setSelectionInterval(row, row);
				
				if(mev.getButton() == MouseEvent.BUTTON3) {
					popup.show(table, mev.getX(), mev.getY());
				}
			}
		});
	}
	
	public void refreshTableView() {
		
		tableModel.fireTableDataChanged();
	}
	
	private static class JTableUtilities
	{
	    public static void setCellsAlignment(JTable table, int alignment)
	    {
	        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
	        rightRenderer.setHorizontalAlignment(alignment);

	        TableModel tableModel = table.getModel();

	        for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++)
	        {
	            table.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRenderer);
	        }
	    }
	}
	
	private JPopupMenu createPopUpMenu() {
		
		JPopupMenu popup = new JPopupMenu("Table popup");
		popup.add(deleteItem);
		activateDeleteRowFunctionality();
		return popup;
		
	}
	
	private void activateDeleteRowFunctionality() {
		
		deleteItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent ev) {
				int row = table.getSelectedRow();
				if(listener != null) {
					listener.tableEventOccured(row);
				}
				System.out.println("Selected row to delete -> " + row);
				
			}
		});
	}
	
	public void setTablePanelListener(TablePanelListener lst) {
		this.listener = lst;
	}

}
