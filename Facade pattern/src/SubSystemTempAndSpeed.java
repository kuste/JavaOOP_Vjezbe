
public class SubSystemTempAndSpeed {
private float temp;
private int fanSpeed;

public void setTemp(float temp) {
	this.temp = temp;
	
	System.out.println("Temperature set to "+temp+ " C°");
}

public void setFanSpeed(int fanSpeed) {
	this.fanSpeed = fanSpeed;
	System.out.println("Fan speed set to: "+fanSpeed+ " RPM");
}

	
	
	
}
