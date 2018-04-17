package Controller;

public class WestController extends Controller  implements java.awt.event.ActionListener{
	 
	 public void actionPerformed(java.awt.event.ActionEvent e){
			
			System.out.println("Controller: acting on west Model");
			model.moveWest();
		} //actionPerformed()

}
