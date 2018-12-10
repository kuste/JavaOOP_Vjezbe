
public abstract class Knight {

	protected String weapon;

	protected static int xp = 0;

	protected int damage;

	protected int strenght;

	protected static String arsenal[] ={"Empty slot","Empty slot","Empty slot","Empty slot","Empty slot","Empty slot"};

	abstract int attack();

	abstract void changeWeapon(int weapon);

	abstract String getWeapon();

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
