import java.util.Random;

public class Level2 extends KnightLeveling {

	private String weapon = "Two-handed Axe";

	public Level2(Knight knight) {
		super(knight);
		strenght = 15;
		arsenal[2] = this.weapon;
	}

	@Override
	public int attack() {
		Random rnd = new Random();
		int attack = rnd.nextInt((80 - 60) + 1) + 60;
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
