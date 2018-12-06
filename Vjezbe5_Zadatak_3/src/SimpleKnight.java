import java.util.Random;

public class SimpleKnight implements Knight {

	String Weapon = "Knife";

	@Override
	public void attack() {
		Random rnd = new Random();
		int attack = rnd.nextInt(50) + 1;
		System.out.println("You attacked with " + Weapon + " for " + attack + "damage");

	}

	@Override
	public int movement(int mov) {

		return mov;
	}

	@Override
	public int strenght(int str) {

		return str;
	}

	@Override
	public void goAwa() {
		System.out.println("You ran from enemy");

	}

	@Override
	public void changeWeapon(int weapon) {
		System.out.println("You dont have any other weapons");
		
	}
	
	@Override
	public  String getWeapon() {
		return Weapon;
	}

	
}
