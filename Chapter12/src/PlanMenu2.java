//Filename PlanMenu2.java
//Written by krycess
//Written on Dec 3, 2012

import javax.swing.*;

public class PlanMenu2 {
public static void main(String[] args)
{
    Menu2 briefMenu = new Menu2();
    PickMenu2 entree = null;
    String guestChoice = new String();
    try
    {
        PickMenu2 selection = new PickMenu2(briefMenu);
        entree = selection;
        guestChoice = entree.getGuestChoice();
    }
    catch(MenuException error)
    {
        guestChoice = error.getMessage();;
    }
    JOptionPane.showMessageDialog(null,
            "You chose " + guestChoice);
}
}
