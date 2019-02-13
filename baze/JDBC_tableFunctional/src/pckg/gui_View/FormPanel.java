package pckg.gui_View;

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
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class FormPanel extends JPanel {

	private JTextField nameField;
	private JTextField mailField;
	private JRadioButton emplRadio;
	private JRadioButton unemplRadio;
	private ButtonGroup emplRadioGroup;
	private JComboBox<String> eduCombo;
	private JList<String> regionLst;
	private JButton btnSubmit;
	private FormListener listener;

	public FormPanel() {

		Dimension dim = getPreferredSize();
		dim.height = 260;
		setPreferredSize(dim);

		initComps();
		layoutComps();
		setFormBorder();
		activateForm();
	}
	
	private void activateForm() {
		
		btnSubmit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String edu = (String) eduCombo.getSelectedItem();
				String region = regionLst.getSelectedValue();
				String name = nameField.getText();
				String mail = mailField.getText();
				String emplStatus = emplRadioGroup.getSelection().getActionCommand();
				
				System.out.println(name + " <-> " + mail + " <-> " + edu + " <-> " + region + " <-> " + emplStatus);
				
				if(listener != null) {
					FormEvent formEv = new FormEvent(this, name, mail, emplStatus, region, edu);
					listener.formEventOccured(formEv);
				}
				refreshForm();
				
			}
		});
		
		
	}
	
	public void setFormListener(FormListener lst) {
		this.listener = lst;
	}
	
	private void refreshForm() {
		
		nameField.setText("");
		nameField.requestFocus();
		mailField.setText("");
		emplRadio.setSelected(true);
		eduCombo.setSelectedIndex(0);
		regionLst.setSelectedIndex(0);
	}

	private void initComps() {

		nameField = new JTextField(14);
		mailField = new JTextField(14);
		emplRadio = new JRadioButton("Employed");
		unemplRadio = new JRadioButton("Unemployed");
		emplRadio.setActionCommand("Employed");
		unemplRadio.setActionCommand("Unemployed");
		emplRadio.setSelected(true);

		emplRadioGroup = new ButtonGroup();
		emplRadioGroup.add(emplRadio);
		emplRadioGroup.add(unemplRadio);
		

		eduCombo = new JComboBox<>();
		DefaultComboBoxModel<String> combModel = new DefaultComboBoxModel<>();
		combModel.addElement("Elementary school");
		combModel.addElement("Higher education");
		combModel.addElement("Bachelor's degree");
		combModel.addElement("Master's degree");
		combModel.addElement("PhD");
		eduCombo.setModel(combModel);
		eduCombo.setSelectedIndex(0);

		regionLst = new JList<>();
		DefaultListModel<String> lstModel = new DefaultListModel<>();
		lstModel.addElement("North region");
		lstModel.addElement("South region");
		lstModel.addElement("West region");
		lstModel.addElement("East region");
		regionLst.setModel(lstModel);
		regionLst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		regionLst.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		regionLst.setSelectedIndex(0);
		JScrollPane scpList = new JScrollPane(regionLst, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		Dimension dim = regionLst.getPreferredScrollableViewportSize();
		dim.width = 200;
		scpList.getViewport().setViewSize(dim);

		btnSubmit = new JButton("Submit");

	}

	private void layoutComps() {

		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.weightx = 0;
		gbc.weighty = 0.5;

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.FIRST_LINE_END;
		gbc.insets = new Insets(10, 5, 0, 5);
		add(new JLabel("Name:"), gbc);

		gbc.gridx = 1;
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;
		gbc.insets = new Insets(10, 0, 0, 0);
		add(nameField, gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weighty = 0;
		gbc.anchor = GridBagConstraints.FIRST_LINE_END;
		gbc.insets = new Insets(0, 5, 0, 5);
		add(new JLabel("Mail:"), gbc);

		gbc.gridx = 1;
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;
		gbc.insets = new Insets(0, 0, 0, 0);
		add(mailField, gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.insets = new Insets(0, 5, 0, 5);
		gbc.anchor = GridBagConstraints.FIRST_LINE_END;
		add(new JLabel("Status:"), gbc);

		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(emplRadio, gbc);

		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.weighty = 0.35;
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(unemplRadio, gbc);

		// empty column
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.weighty = 0.2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		add(Box.createHorizontalStrut(40), gbc);

		gbc.gridx = 3;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.FIRST_LINE_END;
		gbc.insets = new Insets(10, 0, 0, 5);
		add(new JLabel("Education degree: "), gbc);

		gbc.gridx = 3;
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;
		gbc.insets = new Insets(0, 0, 0, 0);
		add(eduCombo, gbc);

		// empty column
		gbc.gridx = 4;
		gbc.gridy = 0;
		gbc.weighty = 0.2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		add(Box.createHorizontalStrut(40), gbc);

		gbc.gridx = 5;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.FIRST_LINE_END;
		gbc.insets = new Insets(10, 0, 0, 5);
		add(new JLabel("Region: "), gbc);

		gbc.gridx = 5;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.weightx = 0.1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;
		gbc.insets = new Insets(0, 0, 0, 0);
		add(regionLst, gbc);

		gbc.gridx = 6;
		gbc.gridy = 5;
		gbc.weightx = 0.2;
		gbc.weighty = 1;
		gbc.insets = new Insets(0, 0, 15, 15);
		add(btnSubmit, gbc);

	}
	
	private void setFormBorder() {
		
		Border outer = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		Border inner = BorderFactory.createTitledBorder("User data");
		Border brd = BorderFactory.createCompoundBorder(outer, inner);
		this.setBorder(brd);
	}

}
