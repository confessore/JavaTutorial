// Filename Mortgage.java
// Written by Steven Confessore
// Written on 8/30/2012

import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args)
    {
        int P; //PRICE OF HOUSE
        int z; //INPUT VALUE FOR r
        double r; //DECIMAL PERCENTAGE
        int x; //INPUT VALUE FOR n
        double n; //MONTHLY INSTALLMENT
        double y; //r DIVIDED BY 12 MONTHS
        double M; //MORTGAGE PAYMENT
                
        Scanner keyBoard = new Scanner(System.in);
        
        /* Price of the house */
        System.out.print("Enter the price of the house excluding the down payment.     ");
            P = keyBoard.nextInt();
        
        /* Interest percentage number */
        System.out.print("Enter the interest rate quote that you were given.     ");
            z = keyBoard.nextInt();
            
        /* Generates a decimal value based on input percentage */
            r = (z * .01);
           
        /* Recurring Payments */
        System.out.print("Enter the number of years in which the mortgage will be paid.     ");
            x = keyBoard.nextInt();
           
        /* Generates number of monthly installments */
            n = (x * 12);
            
        /* Decimal Percentage / 12 months */
            y = (r / 12);
            
            
            M = P * ( ( Math.pow( y * ( 1 + y ), n ) ) / ( Math.pow( ( 1 + y ), n ) - 1 ) );
            
            System.out.println(M);
    }
}
