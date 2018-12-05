
public class StereoCmdOff implements ICommand{

	StereoDevice stereo;

	public StereoCmdOff(StereoDevice stereo) {

		this.stereo = stereo;
	}

	@Override
	public void execute() {

		stereo.off();
	}

	@Override
	public void undo() {
		stereo.on();

	}

}
