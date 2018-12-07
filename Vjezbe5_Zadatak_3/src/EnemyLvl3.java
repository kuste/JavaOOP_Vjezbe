
public class EnemyLvl3 extends Enemy {
	private Enemy enemy;
	public EnemyLvl3(Enemy enemy) {
		this.enemy = enemy;
		this.health = 1000;
		this.xpValue = 20;
	}
}
