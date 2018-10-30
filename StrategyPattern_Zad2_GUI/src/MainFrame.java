import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class MainFrame extends JFrame {
	private JTextField textField;
	private JButton btnPurchase;
	private JTextArea textArea;
	private JRadioButton rdbtnPaypal, rdbtnOnDelivery, rdbtnCreditcard;

	public MainFrame() {

		setSize(492, 720);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		layoutcomp();
		acitvateComp();
	}

	private void layoutcomp() {
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Enter product name");
		lblNewLabel.setBounds(53, 81, 134, 16);
		panel.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(199, 78, 116, 22);
		panel.add(textField);
		textField.setColumns(10);

		rdbtnPaypal = new JRadioButton("PayPal");
		rdbtnPaypal.setBounds(53, 220, 86, 25);
		panel.add(rdbtnPaypal);

		rdbtnOnDelivery = new JRadioButton("On delivery");
		rdbtnOnDelivery.setBounds(143, 220, 102, 25);
		panel.add(rdbtnOnDelivery);

		rdbtnCreditcard = new JRadioButton("Creditcard");
		rdbtnCreditcard.setBounds(274, 220, 102, 25);
		panel.add(rdbtnCreditcard);

		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnCreditcard);
		bg.add(rdbtnPaypal);
		bg.add(rdbtnOnDelivery);

		JLabel lblChoosePaymentMethod = new JLabel("Choose payment method");
		lblChoosePaymentMethod.setBounds(53, 195, 213, 16);
		panel.add(lblChoosePaymentMethod);

		btnPurchase = new JButton("Purchase");
		btnPurchase.setBounds(182, 297, 97, 25);
		panel.add(btnPurchase);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(53, 390, 363, 232);
		panel.add(scrollPane);

		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

	}

	private void acitvateComp() {
		btnPurchase.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String name = textField.getText();
				Product p1 = new ConcreteProduct(name);

				if (rdbtnCreditcard.isSelected()) {
					p1.setPayment(new PayWithCreditcard());
				} else if (rdbtnOnDelivery.isSelected()) {
					p1.setPayment(new PayOnDelivery());
				} else if (rdbtnPaypal.isSelected()) {
					p1.setPayment(new PayWithPayPal());
				}
				textArea.append(p1.pay()+"\n");
				textArea.append("========================\n");

			}
		});

	}
}
