package MVC;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Observable;
//import java.util.Observer;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class View extends Application implements EventHandler<ActionEvent>{

	Button button;

	// Called from the Model

	public void update(Observable arg0, Object arg1) {

	}


	@Override
	public void start(Stage primaryStage) throws IOException {
		primaryStage.setTitle("Player Room");

		Text text = new Text();
		
		
		button = new Button();
		button.setText("Room 1 Description");
		button.setOnAction(this);
		button.setOnAction(new EventHandler<ActionEvent>() {


			@Override
			public void handle(ActionEvent event) {
				if(event.getSource()== button)

				{
					try {

						Scanner file = new Scanner(new File ("RoomDescriptions.txt"));

						while (file.hasNextLine()) {
							System.out.println(file.nextLine());

						}
					} catch (FileNotFoundException e) {

						e.printStackTrace();



					}


				}

			}


		});


		GridPane gridpane = new GridPane();
		gridpane.getChildren().add(button);
		Scene scene = new Scene(gridpane, 900, 450);
		primaryStage.setScene(scene);
		primaryStage.show();

	}




	public static void main(String []args) throws IOException {
		launch(args);
	}


	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub

	}








}

