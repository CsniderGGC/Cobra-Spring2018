
package medicalRaptureMain;

import medicalRaptureGameMap.Map;
import medicalRaptureGameMap.Room;
import medicalRaptureUserInterface.UserInterface;

public class PlayerGamePlay {
    
    private final UserInterface userinteface;
    private final Player player;
    private final Map map;
    private Room currentLocation;
    
    public PlayerGamePlay(UserInterface userinteface, Player player) {
        this.userinteface = userinteface;
        this.player = player;
        map = new Map();
        currentLocation = map.getStartLocation();
    }
    
    public void performRunThrough() {
 //       iface.sendTextToUser("Starting Game...");
    	userinteface.sendTextToConsole("Welcome " + player.getName());
        
    	userinteface.sendTextToConsole("Type help for instructions");
        
        while (true) {
            String line = userinteface.getTextFromPlayer("> ");
            
            if (line.equals("exit")) {
                return;
            }
            
            if (line.equals("help")) {
                userinteface.sendTextToConsole("  Commands:");
                userinteface.sendTextToConsole("   - help: show this message");
                userinteface.sendTextToConsole("   - exit: end the game");
                userinteface.sendTextToConsole("   - look around: inspect the area around you");
                userinteface.sendTextToConsole("   - move: move your player");
                continue;
            }
            
            if (line.equals("look around")) {
                lookAround();
                continue;
            }
            
            if (line.equals("move")) {
                move();
                continue;
            }
            
            userinteface.sendTextToConsole("Unrecognized Command! type: help");
            
        }
    }
    
    private void lookAround() {
        // Talk about current location
//        userinteface.sendTextToConsole("  You are in " + currentLocation.name);
        String description = currentLocation.getDescription();
        if (description != null)
            userinteface.sendTextToConsole("    '" + description + "'");
        
        // Describe the locations around you.
        if (currentLocation.north != null)
            userinteface.sendTextToConsole("  North of you is: " + currentLocation.north.name);
        if (currentLocation.east != null)
            userinteface.sendTextToConsole("  East of you is: " + currentLocation.east.name);
        if (currentLocation.south != null)
            userinteface.sendTextToConsole("  South of you is: " + currentLocation.south.name);
        if (currentLocation.west != null)
            userinteface.sendTextToConsole("  West of you is: " + currentLocation.west.name);
    }
    
    private void move() {
        String direction = userinteface.getTextFromPlayer("  Enter a direction (n,e,s,w) > ");
        
        if (direction.equals("n")) {
            if (currentLocation.north != null)
                currentLocation = currentLocation.north;
            else
                userinteface.sendTextToConsole("You can't move north");
            return;
        }
        
        if (direction.equals("e")) {
            if (currentLocation.east != null)
                currentLocation = currentLocation.east;
            else
                userinteface.sendTextToConsole("You can't move east");
            return;
        }
        
        if (direction.equals("s")) {
            if (currentLocation.south != null)
                currentLocation = currentLocation.south;
            else
                userinteface.sendTextToConsole("You can't move south");
            return;
        }
        
        if (direction.equals("w")) {
            if (currentLocation.west != null)
                currentLocation = currentLocation.west;
            else
                userinteface.sendTextToConsole("You can't move west");
            return;
        }
        
        userinteface.sendTextToConsole("Wrong Direction! You can only move n,e,s,w!");
    }
    
}
