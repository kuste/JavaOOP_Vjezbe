
public class AdapterNovel implements Writer {
	SFWriter oldWriter;

	public AdapterNovel(SFWriter wr) {
		this.oldWriter = wr;
	}

	@Override
	public void write(int type) {

		oldWriter.writeSFNover();
	}

}
