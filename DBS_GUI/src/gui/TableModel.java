package gui;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.User;

public class TableModel extends AbstractTableModel {

	private List<User> db ;
	private String[] colmName  = {"ID","Name","Mail","Education","Employment","Region"};
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return db.size();
	}

	@Override
	public Object getValueAt(int row, int column) {

		switch (column) {
		case 0:
			db.get(row).getId();
			break;
		case 1:
			db.get(row).getName();
			break;
		case 2:
			db.get(row).getMail();
			break;
		case 3:
			db.get(row).getEducation();
			break;
		case 4:
			db.get(row).getEmployment();
			break;
		case 5:
			db.get(row).getRegion();
			break;

		}

		return null;
	}

	
	@Override
	public String getColumnName(int column) {
		return colmName[column];
	}

	public void setData2Table(List<User> db) {
		this.db = db;
	}

}
