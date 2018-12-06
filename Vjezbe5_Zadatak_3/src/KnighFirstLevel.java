import java.util.Random;

public class KnighFirstLevel implements Knight {

	Knight knight;
	String Weapon = "Sword";

	public KnighFirstLevel(Knight knight) {
		this.knight = knight;
	}

	@Override
	public void attack() {
		Random rnd = new Random();
		int attack = rnd.nextInt(100) + 50;
		System.out.println("You attacked with " + Weapon + " for " + attack + "damage");

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
	public void goAwa() {
		System.out.println("You ran from enemy");

	}

	@Override
	public String getWeapon() {
		// TODO Auto-generated method stub
		return null;
	}

}
