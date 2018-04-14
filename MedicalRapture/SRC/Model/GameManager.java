package Model;

public class GameManager {
public Room[] Map = new Room [32];
public int playerLocation;
Player player;



//Navigation

//move north
public void moveNorth() {
	if (Map[playerLocation].getNorth() != 0) {
		playerLocation = Map[playerLocation].getNorth();
	}
}
//move south
public void moveSouth() {
	if (Map[playerLocation].getSouth() != 0) {
		playerLocation = Map[playerLocation].getSouth();
	}
}
//move east
public void moveEast() {
	if (Map[playerLocation].getEast() != 0) {
		playerLocation = Map[playerLocation].getEast();
	}
}

//move west 
public void moveWest() {
	if (Map[playerLocation].getWest() != 0) {
		playerLocation = Map[playerLocation].getWest();
	}
}




//search room returns string
public String SearchRoom() {
	return Map[playerLocation].getDescription();
}
//battle monster

//examine room

//drop item 
//use item
//Equip item
//un-equip item





}
