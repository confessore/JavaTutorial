//Filename SqrtException.java
//Written by krycess
//Written on Dec 4, 2012

import java.lang.*;
import java.util.Scanner;
 
public class SqrtException {
public static void main(String[] args)
{
    double s,c;
    try 
    {
        System.out.print("Enter a number to be rooted: ");
	Scanner myScanner = new Scanner(System.in);
	s = myScanner.nextDouble();
	System.out.println("Number to be rooted: " + s);
        if(s < 0) 
        {
            throw new ArithmeticException();
        }
        else 
        {
            c = Math.sqrt(s);
        }
            System.out.println("Root: " + c);        
    }
    catch(ArithmeticException mistake) {
        System.out.println("Less than 0");
    }
}
}
