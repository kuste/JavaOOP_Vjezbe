import java.util.Random;

public class Level1 extends KnightLeveling {

	private String weapon = "Sword";

	public Level1(Knight knight) {
		super(knight);
		strenght = 10;
		arsenal[1] = this.weapon;

	}

	@Override
	public int attack() {
		Random rnd = new Random();
		int attack = rnd.nextInt((40 - 20) + 1) + 20;
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

}
