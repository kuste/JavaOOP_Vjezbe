
public class KonkretniPromatrac extends Promatrac {

	public KonkretniPromatrac(String name) {
		super(name);

	}

	@Override
	public void update(float temp, float vla, float tlak) {
		textFieldTemp.setText(String.valueOf(temp));
		textFieldVlaznost.setText(String.valueOf(vla));
		textFieldTlak.setText(String.valueOf(tlak));
	}

	@Override
	public String toString() {
		return "Konkretni Promatrac " + getTitle();
	}

	@Override
	public void subscribe(Observable o) {
		o.add(this);

	}

	@Override
	public String title() {

		return super.getTitle();
	}

}
