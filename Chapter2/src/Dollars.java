// Filename Dollars.java
// Written by Steven Confessore
// Written on 8/27/2012


import java.util.Scanner;

public class Dollars {
public static void main(String[] args)
{
    /* Import Scanner class to accept keyboard input. */
    Scanner input = new Scanner(System.in);
    
    /* Chronological variable equation that gives a value to all unknown variables based off of the initial input value. */
    System.out.print("Enter a whole number     ");
    
    int D = input.nextInt();
    
                      
            int Tw = (D / 20);
        

        int Tp = (D - (Tw * 20));
        
            int T = (Tp / 10);
        

        int Fp = (Tp - (T * 10));

            int F = (Fp / 5);
        

        int Xp = (Fp - (F * 5));

            int X = (Xp / 1);


    /* Prints currency denominations. */
    System.out.println(Tw + " Jacksons");
    System.out.println(T + " Hamiltons");
    System.out.println(F + " Lincolns");
    System.out.println(X + " Washingtons");
}
}
