package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import model.User;

public class TablePanel extends JPanel {

	private JTable table;
	private TableModel model;

	public TablePanel() {

		setLayout(new BorderLayout());
		Dimension dim = getPreferredSize();
		dim.width = 350;
		setPreferredSize(dim);
		initComp();
		layoutComp();
	}

	private void initComp() {
		model = new TableModel();
		table = new JTable(model);

	}

	private void layoutComp() {
		add(new JScrollPane(table), BorderLayout.CENTER);
	}

	public void setDataForTable(List<User> db) {

		model.setData2Table(db);
	}

	public void refresh() {
		model.fireTableDataChanged();

	}
}
