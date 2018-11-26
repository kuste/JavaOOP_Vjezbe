import java.awt.Color;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public abstract class Promatrac extends JFrame implements Observer {

	protected JPanel panelMain;
	protected JTextField textFieldTemp;
	protected JTextField textFieldVlaznost;
	protected JTextField textFieldTlak;
	protected JLabel lblTemperatura;
	protected JLabel lblVlaznost;
	protected JLabel lblTlak;
	protected String name;
	protected String email;
	protected int id;
	public Promatrac(String name,String email) {
		this.name=name;
		this.email=email;
		
		Random r = new Random();
		int id = r.nextInt(1000)+100;
		this.id=id;
		
		
		
		setTitle(name);
		setSize(462, 380);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);

		panelMain = new JPanel();
		panelMain.setBounds(12, 13, 420, 307);
		getContentPane().add(panelMain);
		panelMain.setLayout(null);
		panelMain.setBorder(new TitledBorder("Stanje"));
		layoutcomp();
	}

	private void layoutcomp() {

		lblTemperatura = new JLabel("Temperatura");
		lblTemperatura.setBounds(27, 48, 112, 16);
		panelMain.add(lblTemperatura);

		lblVlaznost = new JLabel("Vlaznost");
		lblVlaznost.setBounds(27, 111, 112, 16);
		panelMain.add(lblVlaznost);

		lblTlak = new JLabel("Tlak");
		lblTlak.setBounds(27, 178, 112, 16);
		panelMain.add(lblTlak);

		textFieldTemp = new JTextField();
		textFieldTemp.setEditable(false);
		textFieldTemp.setBackground(Color.white);
		textFieldTemp.setBounds(185, 45, 139, 22);
	
		panelMain.add(textFieldTemp);
		textFieldTemp.setColumns(10);

		textFieldVlaznost = new JTextField();
		textFieldVlaznost.setBounds(185, 108, 139, 22);
		textFieldVlaznost.setEditable(false);
		textFieldVlaznost.setBackground(Color.white);
		panelMain.add(textFieldVlaznost);
		textFieldVlaznost.setColumns(10);

		textFieldTlak = new JTextField();
		textFieldTlak.setBounds(185, 175, 139, 22);
		textFieldTlak.setEditable(false);
		textFieldTlak.setBackground(Color.white);
		panelMain.add(textFieldTlak);
		textFieldTlak.setColumns(10);

	}
}
