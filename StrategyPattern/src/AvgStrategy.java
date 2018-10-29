
public class AvgStrategy implements CalculationStrategy {

	@Override
	public float calculation(float num1, float num2) {
		float rez = num1 + num2;
		float avg = rez / 2;
		return avg;
	}

}
