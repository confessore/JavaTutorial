//Filename GoTooFar.java
//Written by krycess
//Written on Dec 4, 2012

public class GoTooFar extends Exception
{
    public static void main(String []args)
    {
        try
        {
            int []Array = {1,2,3,4,5};
            for (int i = 0; i < 6; ++i)
            System.out.println("Number in position " + i + " is: " + Array[i]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Now you've gone too far.");
        }
    }
}
