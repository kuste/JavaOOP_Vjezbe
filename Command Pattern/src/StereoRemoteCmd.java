
public class StereoRemoteCmd implements ICommand{

	StereoDevice stereo;

	public StereoRemoteCmd(StereoDevice stereo) {

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
