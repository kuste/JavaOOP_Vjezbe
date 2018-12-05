
public class GarageDoorCloseCommand implements ICommand {
	GarageDoor door;

	public GarageDoorCloseCommand(GarageDoor door) {
		this.door = door;
	}

	@Override
	public void undo() {

		door.up();
		door.lightOn();
		door.stop();
	}

	@Override
	public void execute() {

		door.down();
		door.lightOff();

	}

}
