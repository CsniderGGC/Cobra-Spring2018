package Controller;

import Model.GameManager;
import View.View;


public class Controller implements java.awt.event.ActionListener {
	GameManager model;
	View view;

	public Controller() {	
		System.out.println ("Controller()");
		
	} //Controller()

	
	public void actionPerformed(java.awt.event.ActionEvent e){
		
		System.out.println("Controller: acting on Model");
		model.moveNorth();
	} //actionPerformed()

	
	public void addModel(GameManager m){
		System.out.println("Controller: adding model");
		this.model = m;
	} //addModel()

	public void addView(View v){
		System.out.println("Controller: adding view");
		this.view = v;
	} //addView()

	public void initModel(int x){
		model.playerLocation = 1;
	} //initModel()

} //Controller





 

 