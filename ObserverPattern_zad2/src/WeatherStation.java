import java.awt.BorderLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class WeatherStation extends JFrame implements Observable {
	private JTextField textField;
	private JTextField textTemp;
	private JTextField textVlaznost;
	private JTextField textTlak;
	private JPanel panelMain, panelGL, panelDL, panelGD, panelDD;
	private JComboBox<String> comboBoxPromatraci;
	private JButton btnDodajNaListu;
	private JButton btnIzlistaj;
	private JButton btnUkloni;
	private JButton btnUnesiPromjene;
	private JTextArea textAreaPodatciOProm;
	private JTextArea textArea;
	private Observer p;
	private float temp;
	private float vla;
	private float tlak;

	private ArrayList<Observer> observers = new ArrayList<>();

	public WeatherStation() {

		setTitle("Weather Station");
		setSize(962, 701);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		panelMain = new JPanel();
		getContentPane().add(panelMain, BorderLayout.CENTER);
		panelMain.setLayout(null);

		layoutcomp();
		acitvateComp();

	}

	private void layoutcompPanelGL() {

		panelGL = new JPanel();
		panelGL.setBounds(22, 13, 423, 219);
		panelMain.add(panelGL);
		panelGL.setLayout(null);

		JLabel lblNoviPromatrac = new JLabel("Novi promatrac");
		lblNoviPromatrac.setBounds(12, 40, 114, 16);
		panelGL.add(lblNoviPromatrac);

		textField = new JTextField();
		textField.setBounds(12, 69, 198, 22);
		panelGL.add(textField);
		textField.setColumns(10);

		btnDodajNaListu = new JButton("Dodaj na listu");
		btnDodajNaListu.setBounds(12, 135, 155, 25);
		panelGL.add(btnDodajNaListu);

	}

	private void layoutcompPanelDL() {

		panelDL = new JPanel();
		panelDL.setBorder(new TitledBorder("Podatci o promatracu"));
		panelDL.setBounds(22, 245, 423, 363);
		panelMain.add(panelDL);
		panelDL.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 39, 399, 120);
		panelDL.add(scrollPane);

		textAreaPodatciOProm = new JTextArea();
		textAreaPodatciOProm.setEditable(false);
		scrollPane.setViewportView(textAreaPodatciOProm);

		btnIzlistaj = new JButton("Izlistaj");
		btnIzlistaj.setBounds(159, 187, 97, 25);
		panelDL.add(btnIzlistaj);

		JLabel lblNewLabel = new JLabel("Ukloni s liste");
		lblNewLabel.setBounds(50, 236, 86, 16);
		panelDL.add(lblNewLabel);

		comboBoxPromatraci = new JComboBox();

		comboBoxPromatraci.setBounds(50, 265, 291, 22);
		panelDL.add(comboBoxPromatraci);

		btnUkloni = new JButton("Ukloni");
		btnUkloni.setBounds(159, 325, 97, 25);
		panelDL.add(btnUkloni);

	}

	private void layoutcompPanelGD() {
		panelGD = new JPanel();
		panelGD.setBorder(new TitledBorder("Stanje"));
		panelGD.setBounds(482, 24, 423, 287);
		panelMain.add(panelGD);
		panelGD.setLayout(null);

		JLabel iblTemp = new JLabel("Temperatura");
		iblTemp.setBounds(35, 39, 98, 16);
		panelGD.add(iblTemp);

		textTemp = new JTextField();
		textTemp.setBounds(187, 36, 184, 22);
		panelGD.add(textTemp);
		textTemp.setColumns(10);

		textVlaznost = new JTextField();
		textVlaznost.setColumns(10);
		textVlaznost.setBounds(187, 104, 184, 22);
		panelGD.add(textVlaznost);

		textTlak = new JTextField();
		textTlak.setColumns(10);
		textTlak.setBounds(187, 167, 184, 22);
		panelGD.add(textTlak);

		JLabel lblVlaznost = new JLabel("Vlaznost");
		lblVlaznost.setBounds(35, 107, 98, 16);
		panelGD.add(lblVlaznost);

		JLabel lblTlak = new JLabel("Tlak");
		lblTlak.setBounds(35, 170, 98, 16);
		panelGD.add(lblTlak);

		btnUnesiPromjene = new JButton("Unesi promjene");
		btnUnesiPromjene.setBounds(187, 230, 132, 25);
		panelGD.add(btnUnesiPromjene);

	}

	private void layoutcompPanelDD() {
		panelDD = new JPanel();
		panelDD.setBorder(new TitledBorder("Prikaz"));
		panelDD.setBounds(482, 337, 423, 219);
		panelMain.add(panelDD);
		panelDD.setLayout(null);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(23, 38, 377, 155);
		panelDD.add(scrollPane_1);

		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane_1.setViewportView(textArea);

	}

	private void layoutcomp() {
		layoutcompPanelGL();
		layoutcompPanelDL();
		layoutcompPanelGD();
		layoutcompPanelDD();

	}

	private void acitvateComp() {

		btnUnesiPromjene.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					temp = Float.parseFloat(textTemp.getText());
					vla = Float.parseFloat(textVlaznost.getText());
					tlak = Float.parseFloat(textTlak.getText());

				} catch (Exception e1) {

				}
				notifyObs();

			}
		});

		btnIzlistaj.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					textAreaPodatciOProm.append(comboBoxPromatraci.getSelectedItem().toString() + "\n");
					int ind = comboBoxPromatraci.getSelectedIndex();
					((Window) observers.get(ind)).setVisible(true);
				} catch (Exception e1) {
					textAreaPodatciOProm.append("Nema promatraca\n");
				}
			}

		});
		btnUkloni.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int ind = comboBoxPromatraci.getSelectedIndex();
					remove(observers.get(ind));
				} catch (Exception e1) {
					textAreaPodatciOProm.append("Lista je prazna\n");
				}
			}
		});

	}

	@Override
	public void add(Observer o) {
		if (observers.contains(o)) {
			textArea.append("Observer s tim imenom je vec dodan!\n");
		} else {
			observers.add(o);
			comboBoxPromatraci.addItem(observers.get(observers.size() - 1).toString());
			String name = textField.getText();

			if (observers.get(observers.size() - 1).title().equals(name)) {
				textArea.append("Observer " + name + " added\n");
			}
		}
	}

	@Override
	public void remove(Observer o) {
		int index = observers.indexOf(o);
		observers.remove(index);
		textArea.append("Observer removed!\n");
		comboBoxPromatraci.removeItemAt((comboBoxPromatraci.getSelectedIndex()));

	}

	@Override
	public void notifyObs() {
		for (Observer o : observers) {
			o.update(temp, vla, tlak);
			textArea.append("Podatci poslani!\n");

		}

	}

	public JButton getBtnDodajNaListu() {
		return btnDodajNaListu;
	}

	public JTextField getTextField() {
		return textField;
	}

}
