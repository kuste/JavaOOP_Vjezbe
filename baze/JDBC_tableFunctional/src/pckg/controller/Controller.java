package pckg.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import pckg.gui_View.FormEvent;
import pckg.gui_View.TablePanel;
import pckg.gui_View.ViewPanel;
import pckg.model.Cl_DBS;
import pckg.model.Client;

public class Controller {

	private Cl_DBS dataBase;

	public Controller() {

		dataBase = new Cl_DBS();
	}

	public void setNewClient2DBS(FormEvent fe, int sz) {

		String name = fe.getName();
		String mail = fe.getMail();
		String edu = fe.getEdu();
		String region = fe.getRegion();
		String emplStatus = fe.getEmplStatus();

		Client client = new Client(name, mail, edu, region, emplStatus, sz);
		dataBase.addClient2DB(client);
	}

	public List<Client> getAll4DBS() {

		return dataBase.getAllClients();
	}

	public void removeClientFromDB(int indx) {
		dataBase.removeClient(indx);
	}

	public Cl_DBS getDBS() {

		return dataBase;
	}

	public void save2FileDBS(File file) throws IOException {
		dataBase.save2File(file);
	}

	public void getDataBase4File(File file) throws ClassNotFoundException, IOException {
		dataBase.open4File(file);
	}

	public void refreshTable(TablePanel tablePanel) {

		tablePanel.refreshTableView();
	}

	public void refreshViewPanel(ViewPanel viewPanel) {
		viewPanel.refreshViewPanelTextArea();
	}

	public void connect2MySQL() {

		try {
			dataBase.connent2DBS();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void save2DBS() {
		dataBase.save2MySQL();
	}

	public void loadFromDbS() {

		dataBase.loadFromMySQL();
	}

	public void disconnnectFromDBS() {

		dataBase.disconnectFromDBS();
	}

}
