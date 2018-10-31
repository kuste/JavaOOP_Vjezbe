import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {

				WeatherStation ws = new WeatherStation();
				Promatrac p1 = new KonkretniPromatrac("Promatrac1");
				Promatrac p2 = new KonkretniPromatrac("Promatrac2");
				Promatrac p3 = new KonkretniPromatracAVG("Promatrac3");
				Promatrac p4 = new KonkretniPromatracAVG("4");

				ws.getBtnDodajNaListu().addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {

						String name = ws.getTextField().getText();
						activateAll(p1, ws, name);
						activateAll(p2, ws, name);
						activateAll(p3, ws, name);
						activateAll(p4, ws, name);
					}
				});

			}
		});

	}

	public static void activateAll(Promatrac p, WeatherStation ws, String name) {

		if (p.getTitle().equals(name)) {
			p.subscribe(ws);

		} else {
			JOptionPane.showMessageDialog(ws, "Takav promatrac ne postoji", "Message", JOptionPane.ERROR_MESSAGE);
		}

	}

}
