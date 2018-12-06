
public class Add {

	public static void main(String[] args) {

		NovelWriter newWriter = new NovelWriter();
		newWriter.write(1);

		Writer oldWriter = new AdapterNovel(new SFWriter());
		oldWriter.write(0);
	}
}
