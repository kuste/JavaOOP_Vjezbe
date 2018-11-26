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
				Promatrac p = new KonkretniPromatrac("ime", "prom1@email.com");
				Promatrac p1 = new KonkretniPromatrac("ime2", "prom2@email.com");
				Promatrac p2 = new KonkretniPromatracAVG("ime3", "prom1@email.com");
				Promatrac p3 = new KonkretniPromatracAVG("ime4", "prom1@email.com");

				ws.getBtnDodajNaListu().addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						activateAll(p, ws);
						activateAll(p1, ws);
						activateAll(p2, ws);
						activateAll(p3, ws);

					}
				});

			}
		});

	}

	public static void activateAll(Promatrac p, WeatherStation ws) {
		String name = ws.getTextFieldPromatrac().getText();
		if (name.matches(p.getTitle())) {
			p.subscribe(ws);
		}

	}

}
