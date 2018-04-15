package View;



import java.awt.Button;
import java.awt.Panel;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Label;
import java.awt.event.WindowEvent;	//for CloseListener()
import java.awt.event.WindowAdapter;	//for CloseListener()
import java.lang.Integer;		//int from Model is passed as an Integer
import java.util.Observable;		//for update();
import java.awt.event.ActionListener;	//for addController()


@SuppressWarnings("deprecation")
public class View implements java.util.Observer {

	//attributes as must be visible within class
	private TextField myTextField;
	private Button button; 

	/*
	 * The trivial functionality of View is 
	 * 	a constructor which generates the GUI 
	 * 	a method to initialize the TextField
	 */
	public View() {
		System.out.println("View()");	
		
		Frame frame = new Frame("Medical Rapture");
		frame.add("North", new Label("options"));

		myTextField 		= new TextField();
		frame.add("Center", myTextField);

		Panel panel = new Panel();
		button = new Button("GoNorth");
		panel.add(button);
		frame.add("South", panel);		

		frame.addWindowListener(new CloseListener());	
		frame.setSize(400,400);
		frame.setLocation(100,100);
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

		myTextField.setText(" " + ((Integer)obj).intValue());	//obj is an Object, need to cast to an Integer

    	} //update()

	
    // a method addController(ActionListener controller), which attaches the controller as a listener to the button	
	public void addController(ActionListener controller){
		System.out.println("View : adding controller");
		button.addActionListener(controller);	//need instance of controller before can add it as a listener 
	} //addController()

		
	public static class CloseListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			e.getWindow().setVisible(false);
			System.exit(0);
		} //windowClosing()
	} //CloseListener

} //View
