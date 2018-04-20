package Model;

public class Monster extends Character {
	private String name;
	private String monsterInfo;

	public Monster(String name, int maxHP, int health, int maxHit, String monsterInfo) {
		super(maxHP, health, maxHit);
		this.monsterInfo = monsterInfo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMonsterInfo() {
		return monsterInfo;
	}

	public void setMonsterInfo(String monsterInfo) {
		this.monsterInfo = monsterInfo;
	}
}
