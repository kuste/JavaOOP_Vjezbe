package pckg.gui_View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import pckg.controller.Controller;
import pckg.model.Client;

public class ViewPanel extends JPanel {
	
	private JTextArea txtArea;
	private JScrollPane scTxtArea;
	private Controller controller;
	
	public ViewPanel(Controller controller) {
		
		setLayout(new BorderLayout());
		txtArea = new JTextArea();
		txtArea.setEditable(false);
		scTxtArea = new JScrollPane(txtArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		add(scTxtArea,BorderLayout.CENTER);
		Dimension dim = getPreferredSize();
		dim.height = 300;
		dim.width = 400;
		this.controller = controller;
		setPreferredSize(dim);
	}
	
	public void appendTxt(String txt) {
		
		txtArea.append(txt + "\n");
	}

	public void refreshViewPanelTextArea() {
		List<Client> clients = controller.getAll4DBS();
		txtArea.selectAll();
		txtArea.replaceSelection("");
		for(Client cli : clients) {
			String data = cli.getName() + " <-> " + cli.getMail() + " <-> " + cli.getEduCat() + " <-> " + cli.getRegCat() 
			+ " <-> " + cli.getEmplCat();
			appendTxt(data);
		}
	}

}
