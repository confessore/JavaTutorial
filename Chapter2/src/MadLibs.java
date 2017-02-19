// Filename MadLibs.java
// Written by Steven Confessore
// Written on 8/27/2012

import java.util.Scanner;

public class MadLibs {
public static void main(String[] args)
{
    Scanner keyBoard = new Scanner(System.in);
    
    String noun;
    String noun2;
    String verb;
    String verb2;
    String adjective;
    
    System.out.print("Enter a noun");
            noun = keyBoard.nextLine();
    System.out.print("Enter another noun");
            noun2 = keyBoard.nextLine();
    System.out.print("Enter a verb");
            verb = keyBoard.nextLine();
    System.out.print("Enter another verb");
            verb2 = keyBoard.nextLine();
    System.out.print("Enter an adjective");
            adjective = keyBoard.nextLine();
            
            System.out.println("Peter Piper " + verb + " a " +
                    noun + " of " + adjective + " " + noun2 +
                    " and " + verb2 + " them all!");
            
}
}
