package Model;

public class Room {
    	private static String id;
	public static String name;
    private static String description;
    Item item;
    Monster[] monsters = new Monster[5];
    
   


// reply after searching the room
	public String roomItems;
    
    
    
    public static int north;
    public static int east;
    public static int south;
    public static int west;
	
    
    public Room(String id, String name, String description, Item item, Monster[] monsters, String roomItems,  int north,
			int east, int south, int west) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.item = item;
		this.monsters = monsters;
		this.roomItems = roomItems;
		this.north = north;
		this.east = east;
		this.south = south;
		this.west = west;
		
	}
    
    public String getRoomItems() {
		return roomItems;
	}

	public void setRoomItems(String roomItems) {
		this.roomItems = roomItems;
	}
    public String searchRoom() {
    	return roomItems;
    }

    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Monster[] getMonsters() {
		return monsters;
	}

	public void setMonsters(Monster[] monsters) {
		this.monsters = monsters;
	}

	public int getNorth() {
		return north;
	}


	public int getEast() {
		return east;
	}


	public int getSouth() {
		return south;
	}

	

	public int getWest() {
		return west;
	}

	

	
    
   

    
    
}
