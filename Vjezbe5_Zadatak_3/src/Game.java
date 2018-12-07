import java.util.Scanner;

public class Game {

	private Knight knight = new SimpleKnight();;
	private Enemy enemy = new SimpleEnemy();
	private Scanner sc = new Scanner(System.in);

	public Game() {

	}

	public void playGame() {
		System.out.println("Welcome to awesome RPG game!");
		System.out.println("Press a for attack, h for help, 0 for exit");
		while (true) {
			String input = sc.next();
			if (input.matches("a")) {
				executeAttack();
			} else if (input.matches("0")) {
				System.out.println("You left the game, thank you for playing.");
				System.exit(0);
			} else if (input.matches("h")) {
				System.out.println("Press a for attack, 0 for exit");
			} else {
				System.out.println("Invalid input, press h for help");
			}
		}
	}

	private void executeAttack() {

		System.out.println("---------------------------------------------");
		if (enemy.getHp() > 0) {
			checkLevel();
			enemy.recieveDmg(knight.attack());
			knight.status();
			knight.addXp(enemy.getXpValue());
			enemy.checkHealth();
			System.out.println("---------------------------------------------");
		}
		if (enemy.getHp() <= 0) {
			System.out.println("New enemy spawned");
			enemy = new SimpleEnemy();
		}
	}

	private void checkLevel() {
		int xp = knight.getXp();
		switch (xp) {
		case 100:
			knight = new Level1(knight);
			System.out.println("*********************************************");
			System.out.println("Level Up! you are now Level 1");
			System.out.println("You got a new weapon, damage is increased!");
			System.out.println("*********************************************");
			break;
		case 200:
			knight = new Level2(knight);
			System.out.println("*********************************************");
			System.out.println("Level Up! you are now Level 2");
			System.out.println("You got a new weapon, damage is increased!");
			System.out.println("*********************************************");
			break;
		case 300:
			knight = new Level3(knight);
			System.out.println("*********************************************");
			System.out.println("Level Up! you are now Level 3");
			System.out.println("You got a new weapon, damage is increased!");
			System.out.println("*********************************************");
			break;
		case 400:
			knight = new Level4(knight);
			System.out.println("*********************************************");
			System.out.println("Level Up! you are now Level 4");
			System.out.println("You got a new weapon, damage is increased!");
			System.out.println("*********************************************");
			break;
		case 500:
			knight = new Level5(knight);
			System.out.println("*********************************************");
			System.out.println("Level Up! you are now Level 5");
			System.out.println("You got a new weapon, damage is increased!");
			System.out.println("*********************************************");
			break;
		}

	}
}
