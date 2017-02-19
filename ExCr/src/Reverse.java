//Filename Reverse.java
//Written by Steven Confessore
//Written on 11/5/12

import javax.swing.*;

public class Reverse {
   public static void main(String[] args)
   {       
       String[] W = new String[5];
       for(int x = 0; x < W.length; x++)
       {           
           W[x] =  new String();
           W[x] = JOptionPane.showInputDialog(null, "Enter a word" );
       }
       for(int x = 4; x > -1; x--)
           System.out.println(W[x]);
   }
}
