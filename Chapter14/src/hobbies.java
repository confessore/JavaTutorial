import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class hobbies extends JFrame{
    JCheckBox ski = new JCheckBox("Skiing", false);
    JCheckBox hike = new JCheckBox("Hiking", false);
    JCheckBox knit = new JCheckBox("Knitting", false);
    
    public hobbies()
    {
        super("Hobbies");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(ski);
        add(hike);
        add(knit);;
    }
    public static void main(String[] args)
    {
        hobbies myhobby = new hobbies();
        myhobby.setSize(200,250);
        myhobby.setVisible(true);
    }
    public void itemStateChanged(ItemEvent e)
    {
        String yourmessage = "";
        Object source = e.getSource();
        int select = e.getStateChange();
        if (source == ski)
            if (select == ItemEvent.SELECTED)
                yourmessage += "you like skiing";
    }
}
