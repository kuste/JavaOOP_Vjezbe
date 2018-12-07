import java.util.Random;

public class SimpleKnight extends Knight {

	
	private String weapon = "Fists";
	@Override
	public int attack() {
		Random rnd = new Random();
		int attack = rnd.nextInt((20 - 10) + 1) + 10;
		damage = attack;
		return damage;
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
	public void goAway() {
		System.out.println("You ran from enemy");
	}

	@Override
	public void changeWeapon(int weapon) {
		System.out.println("You dont have any other weapons");
	}

	@Override
	public String getWeapon() {
		return weapon;
	}

	@Override
	public void status() {
		System.out.println("You attacked with " + getWeapon() + " for " + damage + " dmg");
	}





}
