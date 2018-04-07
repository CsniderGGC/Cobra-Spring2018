package medicalRaptureUserInterface;

import java.util.Scanner;

public class CommandLineUserInterface implements UserInterface {
    
    private final Scanner scanner = new Scanner(System.in);
    
    @Override
    public String getTextFromPlayer(String prompt) {
        if (prompt != null)
            System.out.print(prompt + " ");
        return scanner.nextLine();
    }
    
    @Override
    public void sendTextToConsole(String message) {
        System.out.println(message);
    }
    
}
