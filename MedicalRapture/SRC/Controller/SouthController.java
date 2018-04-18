package Controller;

public class SouthController extends Controller implements java.awt.event.ActionListener{
	
	 public void actionPerformed(java.awt.event.ActionEvent e){
			
			System.out.println("Controller: acting on south Model");
			model.moveSouth();
		} //actionPerformed()

}
