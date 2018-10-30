
public class ConcreteProduct extends Product {

	public ConcreteProduct(String name) {
		super(name);

	}

	@Override
	public String pay() {
		String s1 = ps.commitPayment();
		String s2 ="Your "+super.toString()+" is ready for dilivery!";
		return s2+"\n"+s1;
	}

}
