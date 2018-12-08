import java.util.Random;

public class Level5 extends KnightLeveling {

	private String weapon = "Holy Handgranade";

	public Level5(Knight knight) {
		super(knight);
		strenght = 25;
		arsenal[5] = this.weapon;
	}

	@Override
	public int attack() {
		Random rnd = new Random();
		int attack = rnd.nextInt((400 - 200) + 1) + 200;
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
