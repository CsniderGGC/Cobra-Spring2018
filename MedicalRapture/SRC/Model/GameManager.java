package Model;

@SuppressWarnings("deprecation")
public class GameManager extends java.util.Observable{
public Room[] Map = MapBuilder.getMap();
public static int playerLocation;
Player player;



//Navigation 

//move north
public void moveNorth() {
	System.out.println("Model- Player Location: Room " + playerLocation);
	setChanged();
	notifyObservers(playerLocation);
	if (Map[playerLocation].getNorth() != 0) {
		playerLocation = Map[playerLocation].getNorth();
	}
}
//move south
public void moveSouth() {
	System.out.println("Model- Player Location: Room " + playerLocation);
	setChanged();
	notifyObservers(playerLocation);
	if (Map[playerLocation].getSouth() != 0) {
		playerLocation = Map[playerLocation].getSouth();
	}
}
//move east
public void moveEast() {
	
	if (Map[playerLocation].getEast() != 0) {
		playerLocation = Map[playerLocation].getEast();
	}
	setChanged();
	notifyObservers(playerLocation);
}

//move west 
public void moveWest() {
	if (Map[playerLocation].getWest() != 0) {
		playerLocation = Map[playerLocation].getWest();
	}
	setChanged();
	notifyObservers(playerLocation);
}

public static Room getRoom() {
	return Map[playerLocation];
}



//search room returns string
public String SearchRoom() {
	return Map[playerLocation].getDescription();
}

//battle monster
public String battleMonster(Player player, Monster monster) {
	//
	return "";
}

//examine room
public String ExamineRoom() {
	//call Room.examineRoom
	return "";
}
//drop item 
public void dropItem(int slot) {
	player.inventory[slot] = null;
}

//use item
public String useItem(int slot) {
	return player.inventory[slot].Use();
}
//Equip item
public void EquipItem(int slot) {
	player.equipItem(slot);
}
//un-equip item
public void UnequipItem(){
	player.unEquipItem();
}

//new game
//save game
//Quit game



}
