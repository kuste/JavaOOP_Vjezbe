import java.util.Random;

public class Level3 extends KnightLeveling {

	private String Weapon = "Dual-Wield Axe";

	public Level3(Knight knight) {
		super(knight);
		strenght = 20;
	
	}

	@Override
	public int attack() {
		Random rnd = new Random();
		int attack = rnd.nextInt((100 - 80) + 1) + 80;
		damage = (attack / 2) * (strenght / 2);
		return damage;
	}

	@Override
	public void changeWeapon(int weapon) {
		if (weapon == 1) {
			this.Weapon = knight.getWeapon();
		} else if (weapon == 2) {
			this.Weapon = "Sword";
		}
	}

	@Override
	public void goAway() {
		System.out.println("You ran from enemy");

	}

	@Override
	public String getWeapon() {
		return Weapon;
	}

	@Override
	public void addXp(int xp) {
		this.xp = this.xp + xp;
	}
}
