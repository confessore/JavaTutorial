//Filename TP.java
//Written by Steven Confessore
//Written on 10/1/12

import java.util.Scanner;
public class TP{
    public static void main(String[] args)
    {
        int size;
        int toppings;
        double price;
        
        Scanner input = new Scanner(System.in);
        
        P P = new P();
        
        System.out.print("What size would you like?\n" + "Small = 1 " + "Medium = 2 " + "Large = 3 >>");
        size = input.nextInt();
        
        System.out.print("How many toppings do you want?\n" + "1-10 >>");
        toppings = input.nextInt();
        
        price = findPrice(size, toppings);
        
        P.setSize(size);
        P.setToppings(toppings);
        P.setTotal(price);
        
        System.out.println("Size is " + P.getSize());
        System.out.println("Number of toppings is " + P.getToppings());
        System.out.println("Total price of pizza is " + P.getTotal());
    }
    public static double findPrice(int size, int toppings)
    {
        double total;
        total = size + (toppings * .25);
        return total;
    }
}
