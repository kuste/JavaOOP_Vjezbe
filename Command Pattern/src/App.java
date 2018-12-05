import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Remote controler");
		System.out.println("Pretisnite 1 za upaliti svitla 2 za ugasiti svitla");
		System.out.println("Pretisnite 3 za Garazna vrata gore 4 za Garazna vrata doli");
		System.out.println("Pretisnite 5 za upaliti stereo 6 za ugaziti stereo");
		System.out.println("Pritisnite 0 za undo");
		System.out.println("Pritisnite anykey za exit");
		// invoker
		RemoteControl remote = new RemoteControl();
		// reciever
		Light light = new Light();
		GarageDoor door = new GarageDoor();
		StereoDevice stereo = new StereoDevice();
		// cmd objects on
		LightOnCommand lightCmdOn = new LightOnCommand(light);
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(door);
		StereoCmdOn stereoOn = new StereoCmdOn(stereo);

		// cmd objects off
		LightOffCommand lightCmdOff = new LightOffCommand(light);
		GarageDoorCloseCommand garageClose = new GarageDoorCloseCommand(door);
		StereoCmdOff stereoOff = new StereoCmdOff(stereo);

		// --------------------
		remote.setCommand(0, lightCmdOn, lightCmdOff);
		remote.setCommand(1, garageOpen, garageClose);
		remote.setCommand(2, stereoOn, stereoOff);
		System.out.println(remote);
		while (true) {
			String input = sc.next();
			if (input.equals("1")) {
				remote.btnOnWasPressed(0);
			} else if (input.equals("2")) {
				remote.btnOffWasPressed(0);

			} else if (input.equals("3")) {
				remote.btnOnWasPressed(1);

			} else if (input.equals("4")) {
				remote.btnOffWasPressed(1);

			} else if (input.equals("5")) {
				remote.btnOnWasPressed(2);

			} else if (input.equals("6")) {
				remote.btnOffWasPressed(2);

			} else if (input.equals("0")) {
				remote.buttonUndoPressed();
			}

			else {
				System.exit(0);
			}
		}

		// info for invoker

		// --------------------------------------

	}
}
