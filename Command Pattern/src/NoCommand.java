
public class NoCommand implements ICommand {

	@Override
	public void execute() {
		System.out.println("No Command");

	}

	@Override
	public void undo() {
		System.out.println("No command");

	}

}
