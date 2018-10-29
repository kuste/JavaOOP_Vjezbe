
public abstract class Calculator {
	protected CalculationStrategy cs;
	public Calculator() {
		
	}

	public void display(float num) {

		System.out.println(num);
	}

	public abstract float performCalculation(float num1, float num2);

	public void setStrategy(CalculationStrategy cs) {
		this.cs = cs;
	}
}
