
public class StereoCmdOn implements ICommand{

	StereoDevice stereo;

	public StereoCmdOn(StereoDevice stereo) {

		this.stereo =stereo;
	}

	@Override
	public void execute() {

		stereo.on();
	}

	@Override
	public void undo() {
		stereo.off();

	}

}
