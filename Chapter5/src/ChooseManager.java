//Filename ChooseManager.java
//Written by krycess
//Writte on 10/8/12

import java.util.Scanner;

public class ChooseManager {
    public static void main(String[] args)
    {
        int eventType;
        String chosenManager;
        final int PRIVATE_CODE = 1;
        final int CORPORATE_CODE = 2;
        final String PRIV_MANAGER = "Dustin Britt";
        final String CORP_MANAGER = "Carmen Lindsey";
        
        Scanner input = new Scanner(System.in);
        System.out.println("What type of event are you scheduling?");
        System.out.print("Enter " + PRIVATE_CODE + " for private, " +
                CORPORATE_CODE + " for corporate... >>");
        eventType = input.nextInt();
        
        if(eventType == PRIVATE_CODE && eventType <= 2)
            chosenManager = PRIV_MANAGER;
        if(eventType == CORPORATE_CODE && eventType <= 2)
            chosenManager = CORP_MANAGER;
        else
            chosenManager = null;
            System.out.println("Error Finding Manager.");
        
        System.out.println("You entered " + eventType);
        System.out.println("Manager for this event will be " + chosenManager);
    }
}
