package View;



import java.awt.Button;
import java.awt.Panel;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.Label;
import java.awt.event.WindowEvent;	//for CloseListener()
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.awt.event.WindowAdapter;	//for CloseListener()
import java.lang.Integer;		//int from Model is passed as an Integer
import java.util.Observable;		//for update();

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Model.Room;

import java.awt.event.ActionListener;	//for addController()


@SuppressWarnings("deprecation")
public class View implements java.util.Observer {

	//attributes as must be visible within class
	private TextField myTextField, areaDiscription;
	private Button northButton, southButton, eastButton, westButton; 
	
	Room room;
	
	Button newGameButton = new Button("New Game");
	Button saveGameButton = new Button("Save Game");
	Button loadGameButton = new Button("Load Game");
	Button quitGameButton = new Button("Quit Game");
	
	//Buttons for room info
	Button searchRoom = new Button("Search Room");
	Button examineRoom = new Button("ExamineRoom");
	
	//
	Button attackMonsterButton = new Button("Attack Monster");
	Button pickupItemsButton = new Button("Pick up Items");
	


	public View() {
		System.out.println("View()");	
		
		JFrame frame = new JFrame("Medical Rapture");
		
		Panel menuPanel = new Panel();
		
		
		menuPanel.add(newGameButton);
		menuPanel.add(saveGameButton);
		menuPanel.add(loadGameButton);
		menuPanel.add(quitGameButton);
		
		frame.add("North", menuPanel);
		
		//Map panel top left
		JPanel mapPanel = new JPanel();
		
		frame.setResizable(true);
		frame.pack();
		frame.setVisible(true);
		backgroundImage backing = new backgroundImage();
		frame.add(backing);
//		myTextField 		= new TextField();
//		frame.add("Center", myTextField);

		Panel  navPanel= new Panel();
		//north
		northButton = new Button("Go North");
		navPanel.add(northButton);
		
		//south
		southButton = new Button("Go South");
		navPanel.add(southButton);
		
		//east
		eastButton = new Button("Go East");
		navPanel.add(eastButton);
		
		//west
		westButton = new Button("Go West");
		navPanel.add(westButton);
		
		//add nav panel to window
		frame.add("East", navPanel);
		
//RoomInfo
		Panel areaInfo = new Panel();
		
		areaDiscription.setText(
				"Room Name:"+ room.getName() + "\n"
				+ "Monster: " + room.getMonsterCount() + "\n"
				+ "Items: "+ room.getItemCount() + "\n"
				+ "Description: " + room.getDescription());
		
		areaInfo.add("West",areaDiscription);
		areaInfo.add("North", searchRoom);
		areaInfo.add("North", examineRoom);
		areaInfo.add("South", attackMonsterButton);
		areaInfo.add("South", pickupItemsButton);
		frame.add("East",areaInfo);
		
		
		
		
		
		frame.addWindowListener(new CloseListener());	
		frame.setSize(1080,720);
		frame.setLocation(0,0);
		frame.setVisible(true);

	} //View()
	
	
	//to initialize TextField
		public void setValue(int v){
	    		myTextField.setText("" + v);
		} //setValue()
		
		

	/*
	 * The interesting functionality of View communicates with the controller and the model. 
	 * 		1- a method addController(ActionListener controller), which attaches the controller as a listener to the button
	 * 		2- the magic part, update(), which receives the status message from model 
	 * 
	 * How does myView.update() get updated? 
	 * 	 (It all happens inside the instance Observable:myModel.) 
     *    model changes state when the method Model:incrementValue() is executed (by the controller). 
     *    After first changing the model's state, Observable:setChanged() changes the flag Observable:changed to true. 
     *    next Model:notifyObservers(counter) is run. 
     *    notifyObservers(counter) is a method of Observable. 
     *    notifyObservers() checks that changed is true, sets it to false, 
     *    looks up the vector of observers, in our case finding myView, 
     *    and then runs myView.update(Observable myModel, Object (Integer)counter). 
     *    myView now has the reference to the observable myModel and a reference to its (new) status. 
     *    Subsequent commands in update() present the model's (new) status to the user.
	 */     
	// Called from the Model
    	public void update(Observable obs, Object obj) {
    	    room = Model.GameManager.getRoom();
		myTextField.setText(" " + ((Integer)obj).intValue());	//obj is an Object, need to cast to an Integer
        
    	} //update()

	
    // links north to controller
	public void addMoveNorth(ActionListener controller){
		System.out.println("View : adding move north controller");
		northButton.addActionListener(controller);
	} //addController()
	
	//links south to the controller
	public void addMoveSouth(ActionListener southController){
		System.out.println("View : adding move South controller");
		southButton.addActionListener(southController);	 
	} 
	
	//links east to the controller
		public void addMoveEast(ActionListener eastController){
			System.out.println("View : adding move East controller");
			eastButton.addActionListener(eastController);	 
		} 
	
	//links south to the controller
		public void addMoveWest(ActionListener westController){
			System.out.println("View : adding move West controller");
			southButton.addActionListener(westController);	 
		} 
	
		
	public static class CloseListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			e.getWindow().setVisible(false);
			System.exit(0);
		} //windowClosing()
	} //CloseListener
 
} //View
