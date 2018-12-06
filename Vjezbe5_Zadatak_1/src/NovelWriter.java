
public class NovelWriter implements Writer {

	@Override
	public void write(int type) {
		switch (type) {
		case 1:
			System.out.println("Historic novel...");
			break;
		case 2:
			System.out.println("Romantic novel...");
			break;
		case 3:
			System.out.println("Thirller novel..");
			break;
		default:
			System.out.println("Unknown novel...");
		}
	}

}
