package src;


@SuppressWarnings("deprecation")
public class Room extends java.util.Observable{


	private String roomID;
	private String roomName;
	private String roomDescription;
	private String roomItem;
	private String roomPuzzle;
	private String roomMonster;
	private String roomNavigate;

	public Room(){
		roomID = null;
		roomName = null;
		roomDescription = null;
		roomItem = null;
		roomPuzzle = null;
		roomMonster = null;
		roomNavigate = null;
		
		
	}

	
	public Room(String roomID, String roomName, String roomDescription, String roomItem, String roomPuzzle, String roomMonster, String roomNavigate){
		this.roomID = roomID;
		this.roomName = roomName;
		this.roomDescription = roomDescription;
		this.roomItem = roomItem;
		this.roomPuzzle = roomPuzzle;
		this.roomMonster = roomMonster;
		this.roomNavigate = roomNavigate;
	}

	/**
	 * @return the roomID
	 */
	public String getRoomID() {
		return roomID;
	}

	/**
	 * @param roomID the roomID to set
	 */
	public void setRoomID(String roomID) {
		this.roomID = roomID;
	}

	
	
	/**
	 * @return the roomName
	 */
	public String getRoomName() {
		return roomName;
	}

	/**
	 * @param roomName the roomName to set
	 */
	public void setRoomName(String roomName) {
		this.roomName = roomName;
		setChanged();
		notifyObservers(roomName);
	}

	/**
	 * @return the roomDescription
	 */
	public String getRoomDescription() {
		return roomDescription;
	}

	/**
	 * @param roomDescription the roomDescription to set
	 */
	public void setRoomDescription(String roomDescription) {
		this.roomDescription = roomDescription;
		setChanged();
		notifyObservers(roomDescription);
	}

	/**
	 * @return the roomItem
	 */
	public String getRoomItem() {
		return roomItem;
	}

	/**
	 * @param roomItem the roomItem to set
	 */
	public void setRoomItem(String roomItem) {
		this.roomItem = roomItem;
		setChanged();
		notifyObservers(roomItem);
	}

	/**
	 * @return the roomPuzzle
	 */
	public String getRoomPuzzle() {
		return roomPuzzle;
	}

	/**
	 * @param roomPuzzle the roomPuzzle to set
	 */
	public void setRoomPuzzle(String roomPuzzle) {
		this.roomPuzzle = roomPuzzle;
		setChanged();
		notifyObservers(roomPuzzle);
	}

	/**
	 * @return the roomMonster
	 */
	public String getRoomMonster() {
		return roomMonster;
	}

	/**
	 * @param roomMonster the roomMonster to set
	 */
	public void setRoomMonster(String roomMonster) {
		this.roomMonster = roomMonster;
		setChanged();
		notifyObservers(roomMonster);
	}

	/**
	 * @return the roomNavigate
	 */
	public String getRoomNavigate() {
		return roomNavigate;
	}

	/**
	 * @param roomNavigate the roomNavigate to set
	 */
	public void setRoomNavigate(String roomNavigate) {
		this.roomNavigate = roomNavigate;
		setChanged();
		notifyObservers(roomNavigate);
	
	}
	
	
	
	
	

	
	
	

	
}  
