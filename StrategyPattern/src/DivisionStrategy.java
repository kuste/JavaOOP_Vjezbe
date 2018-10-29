
public class DivisionStrategy implements CalculationStrategy {

	
	
	@Override
	public float calculation(float num1, float num2) {
		if(num2 == 0) {
			System.out.println("Djeljene s 0!");
		}
		
		float rez = num1 / num2;
		return rez;
	}

}
