// Filename RandomGuess.java
// Written by Steven Confessore
// Written on 10/11/2012

import java.util.Scanner;

public class RandomGuess2
{
    public static void main(String[] args)
    {
        int playerGuess;
        int random;
        random = (1 + (int)(Math.random() * 10));
        
        Scanner input = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 10. \nWhat do you think it is?>>");
        playerGuess = input.nextInt();
        
        System.out.println("The number is " + random + "\nYou chose " + playerGuess);
        
        if(playerGuess > 10 || playerGuess < 1)
                System.out.println("Invalid input.");
        else
            if(playerGuess == random)
                System.out.println("Correct!");
        else
                if(playerGuess > random)
                    System.out.println("Too High!");
                else 
                    if(playerGuess < random)
                        System.out.println("Too Low!");
        
    }
}
