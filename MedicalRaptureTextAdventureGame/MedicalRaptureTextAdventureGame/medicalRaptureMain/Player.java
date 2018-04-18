package medicalRaptureMain;


public class Player extends Character {
	public final static int maxHp = 100;
	public final static int maxHit = 10;

	private final String name;
	item[] inventory = new item[18];

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
