package medicalRaptureGameMap;

public class Map {

	private final Room startLocation;

	public Map () {

		// Create Locations

		Room hallway = new Room("Hallway");
		hallway.setDescription("The game begins with the player standing in the hallway of the hospital");
		this.startLocation = hallway;

		Room R00= new Room("Player Room 1");
		R00.setDescription("This room contains a bed, tv and night stand next to the window.\n"
				+ "This is where the player wakes up after surgery and finds out that the hospital has been attacked by zombies while they have been asleep");


		Room R01 = new Room("Patieent Room 2");
		R01.setDescription("This room contains twin beds and a tv. One land-line rests in between the two beds. The first bed is empty.The second bed contains an infected patient. Risk trying to call for help or proceed to the next room. ");
		

		Room R02 = new Room("Patient Room 3");
		R02.setDescription("You have entered of a pregnant woman sleeping but all the while her zombie baby is awake. You can either wake the mom so she can breast-feed her child to sleep while you try to escape or you can attack both the mom and baby.");

		Room R03 = new Room("Patient Room 4");
		R03.setDescription("The shades of the window have been lowered and a dead patient lies in their bed as well as a dead security guard lay-ing on the floor.\n"
				+ "A bag rests on the table contain-ing numerous items. Player can proceed freely with the option to turn down item or add to their array of items.");
	
		Room R04 = new Room("Patient Room 5");
		R04.setDescription("This room is clean and vacant. Containing one bed, two dressers. No windows and is very dark. Only light coming into the room is from under the door leading to the hallway.\n"
				+ "However, there are noises coming from the corner. There is a technician in the corner breathing heavily. Must attack technician to pro-ceed.");

		Room R05 = new Room("Patient Room 6");
		R05.setDescription("No furniture in the room. One window letting in the sunset. However, D10 & D11 are locked. A riddle must be completed to proceed.");


		Room R06 = new Room("Patient Room 7");
		R06.setDescription("No furniture in the room. One window letting in the sunset. However, D10 & D11 are locked. A riddle must be completed to proceed.");



		// Join Rooms Together
		joinRoomsVertically(hallway, R00);
		joinRoomsHorizontally(hallway,R00);
	}

	private void joinRoomsHorizontally(Room hallway, Room R00){
		R00.west = R00;
		R00.east = R00;
	}

	private void joinRoomsVertically(Room hallway, Room r00){
		hallway.south = r00;
		r00.north = hallway;
	}

	public Room getStartLocation() {
		return startLocation;
	}

}
