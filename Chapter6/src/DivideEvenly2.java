//Filename DivideEvenly2.java
//Written by krycess
//Written on Oct 10, 2012

public class DivideEvenly2 {
public static void main(String[] args)
{
    final int LIMIT = 100;
    int var;
    
    System.out.print(LIMIT + " is evenly divisible by ");
    
    for (var = 1; var <= LIMIT; ++var)
        if(LIMIT % var == 0)
            System.out.print(var + " ");
    //Display the number and two spaces
    
    System.out.println();
    
    
    int number;
    
    for (number = 1; number <= LIMIT; ++number)
    {
        System.out.print(number + " is evenly divisible by ");
        for (var = 1; var <= number; ++var)
            if(number % var == 0)
                System.out.print(var + " ");
        //Display the number and two spaces\
        
        System.out.println();
    }
}
}
