
public class RemoteControl {

	ICommand[] commandOn;
	ICommand[] commandOff;
	ICommand nc = new NoCommand();
	private int slot;

	public RemoteControl() {
		commandOn = new ICommand[7];
		commandOff = new ICommand[7];

		for (int k = 0; k < commandOn.length; k++) {
			commandOn[k] = nc;
			commandOff[k] = nc;

		}

	}

	public void setCommand(int slot, ICommand onCmd, ICommand offCmd) {
		commandOn[slot] = onCmd;
		commandOff[slot] = offCmd;

	}

	public void btnOnWasPressed(int slot) {
		commandOn[slot].execute();

	}

	public void btnOffWasPressed(int slot) {
		commandOff[slot].undo();
	}

	@Override
	public String toString() {

		StringBuffer sBuff = new StringBuffer();
		sBuff.append("\n **************** Remote controller *****************\n");
		for (int i = 0; i < commandOff.length; i++) {

			sBuff.append("[slot " + i + " ]" + commandOn[i].getClass().getName() + "\t\t"
					+ commandOff[i].getClass().getSimpleName() + "\n");
		}

		return sBuff.toString();

	}

}
