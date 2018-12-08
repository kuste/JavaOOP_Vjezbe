import java.util.Random;

public class Level3 extends KnightLeveling {

	private String weapon = "Dual-Wield Axe";

	public Level3(Knight knight) {
		super(knight);
		strenght = 20;
		arsenal[3] = this.weapon;
	}

	@Override
	public int attack() {
		Random rnd = new Random();
		int attack = rnd.nextInt((100 - 80) + 1) + 80;
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
