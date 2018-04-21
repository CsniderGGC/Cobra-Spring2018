package Model;

public abstract class Item {
	String itemName;
	String abilityDiscription;
	boolean equipable;
<<<<<<< HEAD
	String result;
	public String Use() {
		return result;};
=======
	
	
	public Item(String name, int maxHP, string itemInfo) {
		super(maxHP);
		this.itemInfo = monsterInfo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getItemInfo() {
		return itemInfo;
	}

	public void setItemInfo(String itemInfo) {
		this.itemInfo = itemInfo;
	}
	public boolean isEquipeable() {
		return equipable;
}
	
	public void Pickup() {};
	public void Drop() {};
	public void Equipe() {};
	public void Unequiped() {};
	
	public void Utilize() {};
	public void Examine() {};
//	public void Solve() {};
//	public void Quit() {};
//	public void Hint() {}; not a puzzle
	
>>>>>>> a7579e09940c0c222381c21b33c55c42fca2a084


}
