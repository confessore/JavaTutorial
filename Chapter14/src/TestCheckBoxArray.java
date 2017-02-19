import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TestCheckBoxArray extends JFrame implements ItemListener{
    final int num = 10;
    FlowLayout flow = new FlowLayout();
    JCheckBox[] boxes = new JCheckBox[num];
    JLabel[] labels = new JLabel[num];
    JLabel message = new JLabel("     ");
    int x;
    public TestCheckBoxArray()
    {
        super("checkbox array");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        for (x = 0; x < num; ++x)
        {
            labels[x] = new JLabel();
            add(labels[x]);
            labels[x].setText(" " +x);
            boxes[x] = new JCheckBox();
            add(boxes[x]);
            boxes[x].addItemListener(this);
            add(message);
        }
        }
    public static void main(String[] args)
    {
        TestCheckBoxArray myframe = new TestCheckBoxArray();
        myframe.setSize(200, 200);
        myframe.setVisible(true);
    }
    public void itemStateChanged(ItemEvent check)
    {
        Object source = check.getItem();
        for (x = 0; x < num; ++x)
        {
            if (source == boxes[x])
                message.setText("you choose " + x);
        }
    }
}
