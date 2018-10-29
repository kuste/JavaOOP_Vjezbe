import java.util.Scanner;

public class SimpleCalculator extends Calculator{


	
	public SimpleCalculator() {
		
	}

	
	@Override
	public float performCalculation(float num1, float num2) {
		
		float rez = cs.calculation(num1, num2);
		//display(rez);
		
		return rez;
	}
	
	@Override
	public void setStrategy(CalculationStrategy cs) {
		// TODO Auto-generated method stub
		super.setStrategy(cs);
	}

	
	
}
