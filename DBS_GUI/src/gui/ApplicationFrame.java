package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import controler.Controler;

public class ApplicationFrame extends JFrame {
	private DataForm dataForm;
	private ViewDataPanel view;
	private Controler controler;
	private TablePanel tablePanel;

	public ApplicationFrame() {

		setLayout(new BorderLayout());
		setSize(700, 650);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);

		initAll();
		layoutAll();
		activateAll();
		setVisible(true);

	}

	private void initAll() {
		dataForm = new DataForm();
		view = new ViewDataPanel();
		controler = new Controler();
		tablePanel = new TablePanel();
		tablePanel.setDataForTable(controler.getData4Db());
	}

	private void layoutAll() {
		add(dataForm, BorderLayout.SOUTH);
		add(view, BorderLayout.WEST);
		add(tablePanel, BorderLayout.EAST);
		

	}

	private void activateAll() {

		dataForm.setFormListener(new FormListener() {

			@Override
			public void dataFormEventOccired(FormDataObject fdo) {
				String name = fdo.getName();
				String mail = fdo.getMail();
				String education = fdo.getEducation();
				String region = fdo.getRegion();
				String employment = fdo.getEmployment();

				String all = name + " * " + mail + " * " + education + " * " + region + " * " + employment;
				view.showFormData(all);
				controler.addUser2Dbs(fdo);
				tablePanel.refresh();

			}
		});
	}
}
