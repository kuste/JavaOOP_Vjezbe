
public class GarageDoorOpenCommand  implements ICommand{
	GarageDoor garDoor;


	public GarageDoorOpenCommand(GarageDoor gd) {
		garDoor = gd;
	}

	@Override
	public void execute() {

		garDoor.up();
		garDoor.lightOn();
		garDoor.stop();

	}

	@Override
	public void undo() {

		garDoor.down();
		garDoor.lightOff();

	}
}
