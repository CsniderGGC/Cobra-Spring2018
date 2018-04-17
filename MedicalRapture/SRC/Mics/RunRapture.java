package Mics;

import Controller.*;

import Model.GameManager;
import View.View;

public class RunRapture {
	//The order of instantiating the objects below will be important for some pairs of commands.
		//I haven't explored this in any detail, beyond that the order below works.

		private int start_value = 10;	//initialise model, which in turn initialises view

		public RunRapture() {

			//create Model and View
			GameManager myModel 	= new GameManager();
			View myView 	= new View();

			//tell Model about View.
			//Although there is no mention of view in the model code (thus making Model reusable), 
			//the model is being passed a reference to the view. This can be done 
			//because Model is an Observable and an Observable knows the declaration of an Observer (like view). 
			myModel.addObserver(myView);
			/*	
				init model after view is instantiated and can show the status of the model
				(I later decided that only the controller should talk to the model
				and moved initialization to the controller (see below).)
			*/
			

			//create Controller. tell it about Model and View, initialize model
			Controller myController = new Controller();
			myController.addModel(myModel);
			myController.addView(myView);
			myController.initModel(start_value);
			
			EastController eastController = new EastController();
			eastController.addModel(myModel);
			eastController.addView(myView);
			
			SouthController southController = new SouthController();
			southController.addModel(myModel);
			southController.addView(myView);
			
			WestController westController = new WestController();
			westController.addModel(myModel);
			westController.addView(myView);

			//tell View about Controller 
			// a method addController(ActionListener controller), which attaches the controller as a listener to the button (called by the glue class RunMVC). 
			myView.addMoveNorth(myController);
			myView.addMoveSouth(southController);
			myView.addMoveEast(eastController);
			myView.addMoveWest(westController);
		} //RunMVC()

}
