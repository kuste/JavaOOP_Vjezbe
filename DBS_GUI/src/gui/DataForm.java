package gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class DataForm extends JPanel {
	private JTextField nameField, mailField;
	private JRadioButton emplRadio, unemplRadio;
	private ButtonGroup groupRadio;
	private JComboBox<String> comboEducation;
	private JList<String> listRegion;
	private JButton btnSubmit;
	private FormListener formListener;

	public DataForm() {
		setLayout(new GridBagLayout());

		initComp();
		layoutComps();
		activateForm();
	}

	private void activateForm() {
		btnSubmit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String name = nameField.getText();
				String mail = mailField.getText();
				String employment = groupRadio.getSelection().getActionCommand();
				String education = (String) comboEducation.getSelectedItem();
				String region = (String) listRegion.getSelectedValue();

				FormDataObject fdo = new FormDataObject(this, name, mail, education, region, employment);

				if (formListener != null) {
					formListener.dataFormEventOccired(fdo);
				}

			}
		});
	}
	

	public void setFormListener(FormListener formListener) {
		this.formListener = formListener;
	}

	private void initComp() {
		nameField = new JTextField(10);
		mailField = new JTextField(10);

		// Radio bittons
		emplRadio = new JRadioButton("Employ");
		unemplRadio = new JRadioButton("Unemploy");
		groupRadio = new ButtonGroup();
		groupRadio.add(emplRadio);
		groupRadio.add(unemplRadio);

		emplRadio.setActionCommand("Employed");
		unemplRadio.setActionCommand("Unemployed");
		emplRadio.setSelected(true);

		// Dealing with combo box
		comboEducation = new JComboBox<>();
		DefaultComboBoxModel<String> eduComboModel = new DefaultComboBoxModel<>();
		eduComboModel.addElement("Higher education");
		eduComboModel.addElement("Elementary school");
		eduComboModel.addElement("Bachelor's degree");
		eduComboModel.addElement("Master's degree");
		eduComboModel.addElement("PhD");
		comboEducation.setModel(eduComboModel);
		comboEducation.setSelectedIndex(0);

		// Dealing with jlist
		listRegion = new JList<>();
		DefaultListModel<String> regListModel = new DefaultListModel<>();
		regListModel.addElement("North region");
		regListModel.addElement("Sout region");
		regListModel.addElement("West region");
		regListModel.addElement("East region");
		listRegion = new JList<>(regListModel);
		listRegion.setSelectedIndex(0);
		listRegion.setSize(200, 250);
		listRegion.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));

		btnSubmit = new JButton("Submit");

		// Borders
		Border outer = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		Border inner = BorderFactory.createTitledBorder("User data");
		Border bord = BorderFactory.createCompoundBorder(outer, inner);

		this.setBorder(bord);

		// Size

		Dimension dims = getPreferredSize();
		dims.height = 250;
		setPreferredSize(dims);

	}

	private void layoutComps() {

		GridBagConstraints gbc = new GridBagConstraints();
		//////////// First / Second column //////////////////
		gbc.weightx = 0;
		gbc.weighty = 0.1;

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.FIRST_LINE_END;
		gbc.insets = new Insets(10, 0, 0, 5);
		add(new JLabel("Name: "), gbc);

		gbc.gridx = 1;
		add(nameField, gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.FIRST_LINE_END;
		gbc.insets = new Insets(0, 0, 0, 5);
		add(new JLabel("Mail: "), gbc);

		gbc.gridx = 1;
		add(mailField, gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;

		gbc.anchor = GridBagConstraints.FIRST_LINE_END;
		gbc.insets = new Insets(0, 0, 0, 5);
		add(new JLabel("Employment: "), gbc);

		gbc.weighty = 0.11;
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(emplRadio, gbc);

		gbc.gridy = 4;
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(unemplRadio, gbc);

		//////////////// Third column //////////////////

		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.gridx = 2;
		gbc.gridy = 0;

		add(Box.createHorizontalStrut(20), gbc);

		//////////////// Fourt/Fift column //////////////////

		gbc.gridx = 3;
		gbc.gridy = 0;

		gbc.anchor = GridBagConstraints.FIRST_LINE_END;
		gbc.insets = new Insets(10, 0, 0, 5);
		add(new JLabel("Education: "), gbc);

		gbc.gridx = 4;
		gbc.gridy = 1;
		add(comboEducation, gbc);

		//////////////// Six/Seven column //////////////////

		gbc.gridx = 5;
		gbc.gridy = 0;

		gbc.anchor = GridBagConstraints.FIRST_LINE_END;
		gbc.insets = new Insets(10, 0, 0, 5);
		add(new JLabel("Region: "), gbc);

		gbc.gridx = 6;
		gbc.gridy = 1;
		add(listRegion, gbc);

		gbc.gridx = 5;
		gbc.gridy = 3;
		gbc.anchor = GridBagConstraints.PAGE_END;
		add(btnSubmit, gbc);

	}

}
