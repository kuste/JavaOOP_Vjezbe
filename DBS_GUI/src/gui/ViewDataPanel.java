package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ViewDataPanel extends JPanel {
	private JTextArea txtArea;
	private JScrollPane scrolPane;

	public ViewDataPanel() {
		setLayout(new BorderLayout());

		initComp();
		add(scrolPane, BorderLayout.CENTER);
		Dimension dim = getPreferredSize();
		dim.width = 350;
		setPreferredSize(dim);
	}

	private void initComp() {

		txtArea = new JTextArea();
		txtArea.setEditable(false);
		scrolPane = new JScrollPane(txtArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	}

	public void showFormData(String text) {
		txtArea.append(text);
	}
}
