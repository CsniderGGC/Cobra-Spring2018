package medicalRaptureMain;

public class Player extends Character {
	public final int maxHp = 100;
	public final int maxHit = 30;

	private final String name;

	public Player(String name, int maxHP, int health, int maxHit) {
		super(maxHP, health, maxHit);
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getMaxhp() {
		return maxHp;
	}

	public static int getMaxhit() {
		return maxHit;
	}

	public void utilizeItem() {
		health = health + healthPack;
	}

}
