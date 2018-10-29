import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JScrollPane;

public class MainFrame extends JFrame {
	private JPanel panelRez;
	private JPanel panelUnos;
	private JLabel lblPrviBr, lblDrugiBr, lblOdabir, lblRezultat, lblPrikaz;
	private JTextField tFieldPrviBr, tFieldDrugiBr, tFieldRultat;
	private JComboBox<String> odabir;
	private JTextArea tArea;
	private JButton btnizracunaj;
	private JScrollPane scrollPane;

	private ArrayList<Float> rezultati = new ArrayList<>();

	public MainFrame() {
		setSize(947, 564);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		createComp();

		getContentPane().add(panelUnos);
		getContentPane().add(panelRez);
		layoutComp();
		acitvateComp();

	}

	private void createComp() {
		panelUnos = new JPanel();
		panelUnos.setLayout(null);
		panelRez = new JPanel();
		panelRez.setLayout(null);
		panelUnos.setBorder(new TitledBorder("Unos"));
	}

	private void layoutComp() {

		scrollPane = new JScrollPane();
		scrollPane.setBounds(100, 207, 300, 266);
		panelRez.add(scrollPane);
		tArea = new JTextArea();
		scrollPane.setViewportView(tArea);
		tFieldRultat = new JTextField();
		tFieldRultat.setBounds(100, 100, 100, 25);
		panelRez.add(tFieldRultat);
		lblRezultat = new JLabel("Rezultat");
		lblRezultat.setBounds(100, 75, 100, 25);
		panelRez.add(lblRezultat);
		lblPrikaz = new JLabel("Prikaz svik rezultata");
		lblPrikaz.setBounds(101, 169, 205, 25);
		panelRez.add(lblPrikaz);

		lblPrviBr = new JLabel("Prvi broj");
		lblPrviBr.setBounds(51, 60, 100, 25);
		panelUnos.add(lblPrviBr);
		tFieldPrviBr = new JTextField();
		tFieldPrviBr.setBounds(51, 89, 100, 25);
		panelUnos.add(tFieldPrviBr);
		lblDrugiBr = new JLabel("Drugi broj");
		lblDrugiBr.setBounds(51, 141, 100, 25);
		panelUnos.add(lblDrugiBr);
		tFieldDrugiBr = new JTextField();
		tFieldDrugiBr.setBounds(51, 169, 100, 25);
		panelUnos.add(tFieldDrugiBr);
		lblOdabir = new JLabel("Odaberi racunsku operaciju");
		lblOdabir.setBounds(51, 232, 189, 25);
		panelUnos.add(lblOdabir);
		String[] operacije = { "zbrajanje", "oduzimanje", "djeljenje", "mnozenje", "prosjek", "potencija" };
		odabir = new JComboBox<>(operacije);
		odabir.setBounds(51, 258, 235, 25);
		panelUnos.add(odabir);
		btnizracunaj = new JButton("Izracunaj");
		btnizracunaj.setBounds(51, 408, 100, 25);
		panelUnos.add(btnizracunaj);

	}

	private void acitvateComp() {

		btnizracunaj.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				float num1 = Float.parseFloat(tFieldPrviBr.getText());
				float num2 = Float.parseFloat(tFieldDrugiBr.getText());
				Calculator ds = new SimpleCalculator();
				String s = odabir.getSelectedItem().toString();

				if (s.equals("zbrajanje")) {
					ds.setStrategy(new AddStrategy());

				} else if (s.equals("djeljenje")) {
					ds.setStrategy(new DivisionStrategy());

				} else if (s.equals("oduzimanje")) {
					ds.setStrategy(new SubsStrategy());

				} else if (s.equals("mnozenje")) {
					ds.setStrategy(new MultiplyStrategy());

				} else if (s.equals("prosjek")) {
					ds.setStrategy(new AvgStrategy());

				} else if (s.equals("potencija")) {
					ds.setStrategy(new PowStrategy());

				}

				float rez = ds.performCalculation(num1, num2);
				rezultati.add(rez);
				tArea.append("Rezultat " + (rezultati.size()) + " = "
						+ String.valueOf(rezultati.get(rezultati.size() - 1)) + "\n");

				tFieldRultat.setText(String.valueOf(rez));
			}
		});

	}

}
