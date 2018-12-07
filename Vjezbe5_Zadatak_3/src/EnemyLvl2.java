
public class EnemyLvl2 extends Enemy {
	private Enemy enemy;
	public EnemyLvl2(Enemy enemy) {
		this.enemy = enemy;
		this.health = 600;
		this.xpValue = 20;
	}
}
