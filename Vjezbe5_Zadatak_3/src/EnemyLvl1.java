
public class EnemyLvl1 extends Enemy {
	private Enemy enemy;

	public EnemyLvl1(Enemy enemy) {
		this.enemy = enemy;
		this.health = 300;
		this.xpValue = 40;
	}

}
