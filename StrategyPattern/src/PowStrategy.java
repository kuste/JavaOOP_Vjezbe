
public class PowStrategy implements CalculationStrategy {

	@Override
	public float calculation(float num1, float num2) {
		float rez = (float) Math.pow(num1, (int) num2);
		return rez;
	}

}
