
public class KnightLeveling extends Knight {
	Knight knight;

	public KnightLeveling(Knight knight) {
		this.knight = knight;
	}

	@Override
	public int attack() {
		return knight.attack();
	}

	@Override
	public void changeWeapon(int weapon) {
		knight.changeWeapon(weapon);
	}

	@Override
	public String getWeapon() {
		return knight.getWeapon();
	}

	@Override
	public void goAway() {
		knight.goAway();
	}

	@Override
	public void status() {
		System.out.println("You attacked with " + getWeapon() + " for " + damage + " dmg");
	}

}
