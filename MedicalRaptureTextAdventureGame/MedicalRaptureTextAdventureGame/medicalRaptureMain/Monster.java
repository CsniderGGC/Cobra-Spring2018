package medicalRaptureMain;

public class Monster extends Character {
	private String name;
	private String monsterInfo;
	public boolean isAlive;

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
	
	public boolean getIsAlive() {
		return isAlive;
	}
	public void setIsAlive(boolean killed) {
		isAlive = false;
	}
}
