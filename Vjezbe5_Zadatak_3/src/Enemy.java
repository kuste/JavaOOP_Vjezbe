
public abstract class Enemy {

	protected int health;
	protected static int xpValue;
	protected boolean chechHP;

	public void checkHealth() {
		if (health > 0) {
			System.out.println("Enemy healt is " + health);

		} else {
			System.out.println("Enemy is dead");
			
		}

	}

	public static int getXpValue() {
		return xpValue;
	}

	public void recieveDmg(int dmg) {
		health = health - dmg;
	}

	public int getHp() {
		return health;
	}

}
