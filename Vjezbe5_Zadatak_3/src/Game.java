import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {

	private Knight knight = new SimpleKnight();;
	private Enemy enemy = new SimpleEnemy();
	private Scanner sc = new Scanner(System.in);
	private static int xpstate = 0;
	private int xp;

	public void playGame() {
		System.out.println("Welcome to awesome RPG game!");
		System.out.println("Press a for attack, h for help, r to run away from enemy, c for weapon select, 0 for exit");
		enemy = new SimpleEnemy();
		System.out.println("New enemy SimpleEnemy spawned");
		System.out.println("Enemy hp is " + enemy.getHp());
		while (true) {
			String input = sc.next();
			if (input.matches("a")) {
				executeAttack();
			} else if (input.matches("0")) {
				System.out.println("You left the game, thank you for playing.");
				System.exit(0);
			} else if (input.matches("h")) {
				System.out.println(
						"Press a for attack, h for help, r to run away from enemy, c for weapon select, 0 for exit");
			} else if (input.matches("r")) {
				knight.goAway();
				enemy.health = 0;
				enemy = new SimpleEnemy();
				System.out.println("New enemy SimpleEnemy spawned");
				System.out.println("Enemy hp is " + enemy.getHp());
			} else if (input.matches("c")) {
				System.out.println("Press 1 trough 6 to select a weapon ");
				int cnt = 1;
				for (String s : knight.arsenal) {
					System.out.println(cnt + " --> " + s);
					cnt++;
				}
				try {
					int input2 = sc.nextInt();
					knight.changeWeapon(input2);
				} catch (Exception e) {
				}
			} else {
				System.out.println("Invalid input, press h for help, c for weapon select");
			}
		}
	}

	private void executeAttack() {

		if (enemy.getHp() > 0) {
			checkLevel();
			enemy.recieveDmg(knight.attack());
			knight.status();
			enemy.checkHealth();
			System.out.println("---------------------------------------------");
		}
		enemySpawn();

	}

	private void enemySpawn() {
		if (enemy.getHp() <= 0) {
			System.out.println("You earned " + enemy.getXpValue() + " xp for killing the enemy");
			knight.addXp(enemy.getXpValue());
			Random num = new Random();
			int enemySpawn = num.nextInt((5 - 0) + 0) + 0;

			switch (enemySpawn) {
			case 0:
				enemy = new SimpleEnemy();
				System.out.println("New enemy SimpleEnemy spawned");
				System.out.println("Enemy hp is " + enemy.getHp());
				break;
			case 1:
				enemy = new EnemyLvl1(enemy);
				System.out.println("New enemy Level 1 spawned");
				System.out.println("Enemy hp is " + enemy.getHp());
				break;
			case 2:
				enemy = new EnemyLvl2(enemy);
				System.out.println("New enemy Level 2 spawned");
				System.out.println("Enemy hp is " + enemy.getHp());
				break;
			case 3:
				enemy = new EnemyLvl3(enemy);
				System.out.println("New enemy Level 3 spawned");
				System.out.println("Enemy hp is " + enemy.getHp());
				break;
			case 4:
				enemy = new EnemyLvl4(enemy);
				System.out.println("New enemy Level 4 spawned");
				System.out.println("Enemy hp is " + enemy.getHp());
				break;
			case 5:
				enemy = new EnemyLvl5(enemy);
				System.out.println("New enemy Level 5 spawned");
				System.out.println("Enemy hp is " + enemy.getHp());
			}

		}
	}

	private void checkLevel() {
		xp = knight.getXp();

		if ((xp > 100 && xp < 200) && (xpstate != 100) && knight.getClass().isInstance(new SimpleKnight())) {
			xpstate = 100;
			knight = new Level1(knight);
		} else if ((xp > 200 && xp < 400) && (xpstate != 200) && knight.getClass().isInstance(new Level1(knight))) {
			xpstate = 200;
			knight = new Level2(knight);

		} else if ((xp > 400 && xp < 800) && (xpstate != 3) && knight.getClass().isInstance(new Level2(knight))) {
			xpstate = 3;
			knight = new Level3(knight);

		} else if ((xp > 800 && xp < 1600) && (xpstate != 4) && knight.getClass().isInstance(new Level3(knight))) {
			xpstate = 4;
			knight = new Level4(knight);

		} else if ((xp > 1600 && xp < 3500) && (xpstate != 5) && knight.getClass().isInstance(new Level4(knight))) {
			xpstate = 5;
			knight = new Level5(knight);

		} else {
			xpstate = 0;
		}

		switch (xpstate) {
		case 100:
			System.out.println("*********************************************");
			System.out.println("Level Up! you are now Level 1");
			System.out.println("You got a new weapon, strenght is iscreased, damage is increased!");
			System.out.println("*********************************************");
			break;
		case 200:
			System.out.println("*********************************************");
			System.out.println("Level Up! you are now Level 2");
			System.out.println("You got a new weapon, strenght is iscreased, damage is increased!");
			System.out.println("*********************************************");
			break;
		case 3:
			System.out.println("*********************************************");
			System.out.println("Level Up! you are now Level 3");
			System.out.println("You got a new weapon, strenght is iscreased, damage is increased!");
			System.out.println("*********************************************");
			break;
		case 4:
			System.out.println("*********************************************");
			System.out.println("Level Up! you are now Level 4");
			System.out.println("You got a new weapon, strenght is iscreased, damage is increased!");
			System.out.println("*********************************************");
			break;
		case 5:
			System.out.println("*********************************************");
			System.out.println("Level Up! you are now Level 5");
			System.out.println("You got a new weapon, strenght is iscreased, damage is increased!");
			System.out.println("*********************************************");
			break;

		}

	}

}
