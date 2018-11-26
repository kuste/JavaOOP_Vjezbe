
public class KonkretniPromatrac extends Promatrac {

	public KonkretniPromatrac(String name,String email) {
		super(name, email);

	}

	@Override
	public void update(float temp, float vla, float tlak) {
		textFieldTemp.setText(String.valueOf(temp));
		textFieldVlaznost.setText(String.valueOf(vla));
		textFieldTlak.setText(String.valueOf(tlak));
	}

	@Override
	public String toString() {
		return "Konkretni Promatrac--> " + getTitle()+"\nEmail--> "+email+"\nObserver id--> "+id+"\n";
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
