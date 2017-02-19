// Filename RandomGuess.java
// Written by Steven Confessore
// Written on 8/22/2012

import javax.swing.JOptionPane;

public class RandomGuess
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, "I'm thinking of a number between 1 and 10. What do you think it is?");
        JOptionPane.showMessageDialog(null, "The number is " + (1 + (int)(Math.random() * 10)));
    }
}
