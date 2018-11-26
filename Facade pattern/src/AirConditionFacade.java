
public class AirConditionFacade  {

	SubSystemEnergy subSystemEnergy;
	SubSystemIonzer subSystemIonzer;
	SubSystemMode subSystemMode;
	SubSystemTempAndSpeed subSystemTempAndSpeed;
	SubSystemTimer subSystemTimer;

	public AirConditionFacade() {
		setSubSystemEnergy(new SubSystemEnergy());
		setSubSystemIonzer(new SubSystemIonzer());
		setSubSystemMode(new SubSystemMode());
		setSubSystemTempAndSpeed(new SubSystemTempAndSpeed());
		setSubSystemTimer(new SubSystemTimer());
	}

	
	public void startAirconditioningSystem() {
		System.out.println("Strating airconditioning...");
		System.out.println();

		subSystemMode.setMode("Mode 2");
		subSystemTempAndSpeed.setTemp(23);
		subSystemTempAndSpeed.setFanSpeed(120);
		subSystemIonzer.setIonz(true);
		subSystemEnergy.on();
		subSystemEnergy.setMode("Energy mode 3");
		subSystemEnergy.start();
		subSystemTimer.setProgram(5);
		subSystemTimer.setOn(true);

	}
	
	public void stopAirconditioningSystem() {
		System.out.println("Airconditioning shutting down...");
		System.out.println();
		subSystemTempAndSpeed.setFanSpeed(0);
		subSystemIonzer.setIonz(false);
		subSystemEnergy.off();
		subSystemEnergy.stop();
		subSystemTimer.setOn(false);

	}

	public void setSubSystemEnergy(SubSystemEnergy subSystemEnergy) {
		this.subSystemEnergy = subSystemEnergy;
	}

	public void setSubSystemIonzer(SubSystemIonzer subSystemIonzer) {
		this.subSystemIonzer = subSystemIonzer;
	}

	public void setSubSystemMode(SubSystemMode subSystemMode) {
		this.subSystemMode = subSystemMode;
	}

	public void setSubSystemTempAndSpeed(SubSystemTempAndSpeed subSystemTempAndSpeed) {
		this.subSystemTempAndSpeed = subSystemTempAndSpeed;
	}

	public void setSubSystemTimer(SubSystemTimer subSystemTimer) {
		this.subSystemTimer = subSystemTimer;
	}
	
	

}
