public class SupremeMaster extends Master implements Evaluate {

	public SupremeMaster(String name) {
		this.name = name;
		if(description == null) {
			this.description = "SupremeMaster";
		}

	}

	@Override
	public void askforAdvice() {

		System.out.println(description + " ask for an advice...");

	}

	@Override
	public void giveAdvice() {
		System.out.println(description + " provide useful advice ...");

	}

	@Override
	public void bringTools() {

		System.out.println("Every repairman can and should bring a tool bag ...");

	}

	@Override
	public void performRepair() {

		System.out.println(description + " performing a repair ... ");

	}

	@Override
	public void performMaintance() {

		System.out.println(description + "provide a good maintenance ...");

	}

	@Override
	public void evaluateWork(Master repairman) {
		System.out.println(name + " evaluets work of "+repairman.description);
		
	}


}