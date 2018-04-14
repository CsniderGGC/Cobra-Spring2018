package Model;

public class Room {
    
	private  String id;
    public  String name;
    private String description;
    Item item;
    Monster monster;
    private String exit;
    
    public int north;
    public int east;
    public int south;
    public int west;
    
    Room(String id, String name, String discription, Item item, Monster monster,int north, int south, int east, int west){
    	
    }
    public Room(String name){
        this.name = name;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public String getDescription(){
        return this.description;
    }

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getItem() {
		return this.item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getMonster() {
		return this.monster;
	}

	public void setMonster(String monster) {
		this.monster = monster;
	}

	public String getExit() {
		return this.exit;
	}

	public void setExit(String exit) {
		this.exit = exit;
	}
    
    
}
