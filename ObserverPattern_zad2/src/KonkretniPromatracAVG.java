import java.util.ArrayList;

public class KonkretniPromatracAVG extends Promatrac {

	private static ArrayList<Float> listTemp = new ArrayList<>();
	private static ArrayList<Float> listVla = new ArrayList<>();
	private static ArrayList<Float> listTlak = new ArrayList<>();

	public KonkretniPromatracAVG(String name) {
		super(name);
		super.lblTemperatura.setText(lblTemperatura.getText() + "/AVG");
		super.lblVlaznost.setText(lblVlaznost.getText() + "/AVG");
		super.lblTlak.setText(lblTlak.getText() + "/AVG");

	}

	@Override
	public void update(float temp, float vla, float tlak) {

		listTemp.add(temp);
		listVla.add(vla);
		listTlak.add(tlak);
		textFieldTemp.setText(String.valueOf(calcAVG(listTemp)));
		textFieldVlaznost.setText(String.valueOf(calcAVG(listVla)));
		textFieldTlak.setText(String.valueOf(calcAVG(listTlak)));

	}

	public float calcAVG(ArrayList<Float> list) {
		Float sum = (float) 0;
		if (!list.isEmpty()) {
			for (Float mark : list) {
				sum += mark;
			}
			return (float) (sum.doubleValue() / list.size());
		}
		return sum;

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
