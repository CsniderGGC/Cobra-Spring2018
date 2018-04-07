package medicalRaptureMain;

import medicalRaptureUserInterface.CommandLineUserInterface;
import medicalRaptureUserInterface.UserInterface;

public class Game {
    
    public static void main(String[] args) {
        UserInterface userinterface = new CommandLineUserInterface();
        
        System.out.println("Welcome to the Medical Rapture Game");
        String name = userinterface.getTextFromPlayer("Enter your name?");
        
        Player player = new Player(name);
        new PlayerGamePlay(userinterface, player).performRunThrough();
            
        userinterface.sendTextToConsole("Game finished");
        
    }
    
}
