
public abstract class Knight {

	protected Enemy enemy;

	protected String weapon;

	protected static int xp = 0;

	protected int damage;

	abstract int attack();

	abstract void changeWeapon(int weapon);

	abstract String getWeapon();

	abstract int movement(int mov);

	abstract int strenght(int str);

	abstract void goAway();

	abstract void status();

	protected void addXp(int xp) {
		this.xp = this.xp + xp;
	}

	protected int getXp() {
		System.out.println("You have " + xp + " xp");
		return this.xp;
	}

}
