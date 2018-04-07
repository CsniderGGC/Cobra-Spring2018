package medicalRaptureGameMap;

public class Room {
    
	private String id;
    public final String name;
    private String description;
    private String item;
    private String monster;
    private String exit;
    
    public Room north;
    public Room east;
    public Room south;
    public Room west;
    
    
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
