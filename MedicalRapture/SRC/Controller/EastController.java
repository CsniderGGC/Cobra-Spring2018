package Controller;

public class EastController extends Controller implements java.awt.event.ActionListener{
	
	 public void actionPerformed(java.awt.event.ActionEvent e){
			System.out.println("Controller: acting on east Model");
			model.moveEast();
		} //actionPerformed()

}
