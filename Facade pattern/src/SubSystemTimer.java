
public class SubSystemTimer {

	private int program;
	private boolean isOn;

	public void setProgram(int program) {
		this.program = program;
		System.out.println("Timer program "+program+" selected");
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
		
		if(isOn == true) {
			System.out.println("Timer is on");
		}
		else {
			System.out.println("Timer is off");
		}
	}

}
