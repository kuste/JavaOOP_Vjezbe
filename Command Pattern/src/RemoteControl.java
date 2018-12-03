
public class RemoteControl {

	ICommand commamndSlot;
	
	
	public void setCommand(ICommand cmd) {
		this.commamndSlot = cmd;
		
	}
	
	public void btnOnWasPressed() {
		commamndSlot.execute();
		
	}
	
	public void btnOffWasPressed() {
		commamndSlot.undo();
	}
	

	
	
}
