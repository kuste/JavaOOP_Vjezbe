import java.util.Random;

public class Level4 extends KnightLeveling{

	private String Weapon = "Two-handed Hammer";
	
	public Level4(Knight knight) {
		super(knight);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int attack() {
		Random rnd = new Random();
		int attack = rnd.nextInt((120 - 100) + 1) + 100;
		damage = attack;
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
	public String getWeapon() {
		return Weapon;
	}

	@Override
	public void addXp(int xp) {
		this.xp = this.xp + xp;
	}
}
