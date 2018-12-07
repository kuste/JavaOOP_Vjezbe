
public class EnemyLvl5 extends Enemy {
	private Enemy enemy;

	public EnemyLvl5(Enemy enemy) {
		this.enemy = enemy;
		this.health = 10000;
		this.xpValue = 20;
	}
}
