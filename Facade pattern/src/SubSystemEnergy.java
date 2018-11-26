
public class SubSystemEnergy {

	private String mode;

	public void setMode(String mode) {
		this.mode = mode;
		
		System.out.println("Energy mode "+mode);
	}
	
	public void on() {
		System.out.println("Turning Energy mode on...");
	}
	
	public void start() {
		System.out.println("Energy mode Starting...");
	}
	public void off() {
		System.out.println("Turning Energy mode off...");
	}
	public void stop() {
		System.out.println("Energy mode stopping...");
	}
}
