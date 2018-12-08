import java.util.Random;

public class SimpleKnight extends Knight {

	private String weapon = "Fists";
	private int strenght = 5;

	public SimpleKnight() {
		arsenal[0] = this.weapon;
	}

	@Override
	public int attack() {
		Random rnd = new Random();
		int attack = rnd.nextInt((20 - 10) + 1) + 10;
		damage = (attack / 2) * (strenght / 2);
		return damage;
	}

	@Override
	public void goAway() {
		System.out.println("You ran from enemy");
	}

	@Override
	public void changeWeapon(int weapon) {
		if (weapon == 1) {
			this.weapon = arsenal[0];
			System.out.println("You have selected " + arsenal[0]);
		} else if (weapon == 2) {
			if (arsenal[1] != "Empty slot") {
				this.weapon = arsenal[1];
				System.out.println("You have selected " + arsenal[1]);
			} else {
				System.out.println("You don't have any other weapons");
			}
		} else if (weapon == 3) {
			if (arsenal[2] != "Empty slot") {
				this.weapon = arsenal[2];
				System.out.println("You have selected " + arsenal[2]);
			} else {
				System.out.println("You don't have any other weapons");
			}
		} else if (weapon == 4) {
			if (arsenal[3] != "Empty slot") {
				this.weapon = arsenal[3];
				System.out.println("You have selected " + arsenal[3]);
			} else {
				System.out.println("You don't have any other weapons");
			}
		} else if (weapon == 5) {
			if (arsenal[4] != "Empty slot") {
				this.weapon = arsenal[4];
				System.out.println("You have selected " + arsenal[4]);
			} else {
				System.out.println("You don't have any other weapons");
			}
		} else if (weapon == 6) {
			if (arsenal[5] != "Empty slot") {
				this.weapon = arsenal[5];
				System.out.println("You have selected " + arsenal[5]);
			} else {
				System.out.println("You don't have any other weapons");
			}
		}else {
			System.out.println("Invalid input, press h for help or c for Weapon selection");
		}

	}

	@Override
	public String getWeapon() {
		return weapon;
	}

	@Override
	public void status() {
		System.out.println("You attacked with " + getWeapon() + " for " + damage + " dmg");
	}

}
