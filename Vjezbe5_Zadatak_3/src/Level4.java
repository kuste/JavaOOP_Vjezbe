import java.util.Random;

public class Level4 extends KnightLeveling {

	private String weapon = "Two-handed Hammer";

	public Level4(Knight knight) {
		super(knight);
		strenght = 21;
		arsenal[4] = this.weapon;

	}

	@Override
	public int attack() {
		Random rnd = new Random();
		int attack = rnd.nextInt((120 - 100) + 1) + 100;
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
	public void addXp(int xp) {
		this.xp = this.xp + xp;
	}
}
