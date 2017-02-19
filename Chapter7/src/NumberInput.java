//Filename NumberInput.java
//Written by krycess
//Written on 10/17/12

import javax.swing.*;

public class NumberInput {
    public static void main (String[] args)
    {
        String inputString;
        int inputNumber;
        int result;
        final int FACTOR = 15;
        
        
        /* Opens JOptionPane InputDialog and stores input String */
        inputString = JOptionPane.showInputDialog(null, "Enter a number");
        /* stores integer from method Integer.parseInt using inputString */
        inputNumber = Integer.parseInt(inputString);
        /* final variable */
        result = inputNumber * FACTOR;
        /* display result */
        JOptionPane.showMessageDialog(null, inputNumber + " * " + FACTOR + " = " + result);
    }
}
