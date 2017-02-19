//Filename CountVowels2.java
//Written by krycess
//Written on Nov 3, 2012

import javax.swing.*;

public class CountVowels2{
    
    public static void main(String[] args)
    {
        String s = (JOptionPane.showInputDialog(null, 
                "What is your favorite color?"));
        int Count = 0;
        /*Loop starts at 0 and adds +1 every loop until 'i' is equal
        to the amount of characters in 's'*/
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            /*Every loop pass checks for a vowel
            Aa or Ee or Ii or Oo or Uu and adds +1*/
            if (   (c == 'A' || c == 'a')
                    || (c == 'E' || c == 'e')
                    || (c == 'I' || c == 'i')
                    || (c == 'O' || c == 'o')
                    || (c == 'U' || c == 'u'))         
                Count++;
	}
        JOptionPane.showMessageDialog(null, Count + " vowels." );
    }
}



