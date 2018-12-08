import java.util.Random;

public class SimpleKnight extends Knight {

	private String weapon = "Fists";
	private int strenght = 5;

	public SimpleKnight() {
		arsenal[0] = this.weapon;
	}

	@Override
	public int attack() {
		Random rnd = new Random();
		int attack = rnd.nextInt((20 - 10) + 1) + 10;
		damage = (attack / 2) * (strenght / 2);
		return damage;
	}

	@Override
	public void goAway() {
		System.out.println("You ran from enemy");
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
