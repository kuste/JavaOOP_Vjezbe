
public class App {

	public static void main(String[] args) {
		
		Knight simpleKnight = new SimpleKnight();
		
		simpleKnight.attack();
		
		System.out.println("///////////////////");
		Knight lvl1 = new KnighFirstLevel(new SimpleKnight());

		lvl1.attack();
		lvl1.changeWeapon(1);
		lvl1.attack();
	}

}
