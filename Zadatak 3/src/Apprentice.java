public class Apprentice implements Aprentice {

	private String name;
	private String description;

	public Apprentice(String name) {

		this.name = name;
		if (description == null) {
			this.description = "Apprentice";
		}

	}

	@Override
	public void askforQuestion() {

		System.out.println(description + " ask question...");

	}

	@Override
	public void bringTools() {

		System.out.println("Every repairman can and should bring a tool bag ...");

	}

}