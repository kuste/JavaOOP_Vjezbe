import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * RemoteControl remote = new RemoteControl(); Light light = new Light();
		 * 
		 * LightOnCommand lightOn = new LightOnCommand(light);
		 * 
		 * remote.setCommand(lightOn); remote.btnOnWasPressed();
		 * remote.btnOffWasPressed();
		 * 
		 * System.out.println("*************************************"); GarageDoor
		 * garage= new GarageDoor(); GarageDoorOpenCommand garageComm = new
		 * GarageDoorOpenCommand(garage);
		 * 
		 * remote.setCommand(garageComm);
		 * System.out.println("////////////comming home/////////////");
		 * remote.btnOnWasPressed();
		 * System.out.println("////////////////going out//////////");
		 * remote.btnOffWasPressed();
		 * 
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("remote controler");
		System.out.println("pretisnite 1 za upaliti svitla 2 za ugasiti svitla");
		System.out.println("pretisnite 3 za Garazna vrata gore 4 za Garazna vrata doli");
		System.out.println("pretisnite 5 za upaliti stereo 6 za ugaziti stereo");

		RemoteControl remote = new RemoteControl();
		Light light = new Light();
		LightOnCommand lightCmd = new LightOnCommand(light);
		remote.setCommand(0, lightCmd, lightCmd);

		GarageDoor door = new GarageDoor();
		GarageDoorOpenCommand garageCmd = new GarageDoorOpenCommand(door);
		remote.setCommand(1, garageCmd, garageCmd);

		StereoDevice stereo = new StereoDevice();
		StereoRemoteCmd stereoCmd = new StereoRemoteCmd(stereo);
		remote.setCommand(2, stereoCmd, stereoCmd);
		System.out.println(remote.toString());

		while (true) {
			String input = sc.next();

			if (input.matches("1")) {
				remote.btnOnWasPressed(0);
			} else if (input.matches("2")) {
				remote.btnOffWasPressed(0);
			} else if (input.matches("3")) {
				remote.btnOnWasPressed(1);
			} else if (input.matches("4")) {
				remote.btnOffWasPressed(1);
			} else if (input.matches("5")) {
				remote.btnOnWasPressed(2);
			} else if (input.matches("6")) {
				remote.btnOffWasPressed(2);
			}
		}

	}
}
