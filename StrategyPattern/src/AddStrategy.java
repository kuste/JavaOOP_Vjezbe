
public class AddStrategy implements CalculationStrategy {

	@Override
	public float calculation(float num1, float num2) {
		float rez = num1 + num2;
		return rez;
	}

}
