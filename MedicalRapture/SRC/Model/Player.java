package Model;

public class Player extends Character {
	public static  int maxHp = 100;
	public static int maxHit = 30;
	public int CurrentHealth= 100; 
	public static int extraDamage = 0;
	public static Item equiped;

	private  String name;
	static Item[] inventory = new Item[18];

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

	public static void equipItem(int slot) {
		if (inventory[slot].isEquipeable())
		equiped = inventory[slot];
	}
	public static void unEquipItem() {
		
		equiped = null;
	}
	public static int getMaxhp() {
		return maxHp;
	}

	public static int getMaxhit() {
		if (equiped != null) {
		return maxHit + extraDamage;
		}
		else 
			return maxHit;
		
	}
    
	

}
