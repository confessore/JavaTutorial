//Filename PlanMenu.java
//Written by krycess
//Written on Dec 3, 2012

import javax.swing.*;

public class PlanVegetarianMenu {
public static void main(String[] args)
{
    VegetarianMenu briefMenu = new VegetarianMenu();
    PickMenu2 entree = null;
    String guestChoice = new String();
    try
    {
        PickMenu2 selection = new PickMenu2(briefMenu);
        entree = selection;
        guestChoice = entree.getGuestChoice();
    }
    catch(Exception error)
    {
        guestChoice = "an invalid vegetarian selection";
    }
    JOptionPane.showMessageDialog(null,
            "You chose " + guestChoice);
}
}
