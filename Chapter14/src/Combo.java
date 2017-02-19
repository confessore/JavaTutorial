import javax.swing.*;
import java.awt.*;

public class Combo extends JFrame{
    JComboBox animals = new JComboBox();
    public Combo()
    {
        super("Animal List");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        animals.addItem("Dog)");
        animals.addItem("Cat)");
        animals.addItem("Pig)");
        add(animals);
    }
    
    public static void main(String[] args)
    {
        Combo mine = new Combo();
        mine.setSize(200,250);
        mine.setVisible(true);
    }
}
