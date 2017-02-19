//Filename JLottery2.java
//Written by krycess
//Written on Dec 2, 2012

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JLottery2 extends JFrame implements ItemListener
{
   final int MAX = 31;
   final int LIMIT = 6;
   FlowLayout flow = new FlowLayout();
   JLabel header = new JLabel
           ("Win a million $$!! - Select " + LIMIT + " numbers");
   JCheckBox[] pick = new JCheckBox[MAX];
   JLabel[] label = new JLabel[MAX]; 
   String numbers = "The winning numbers are   ";
   String picked = "You picked   ";
   JTextArea bottom = new JTextArea("");
   int x, y;
   int[] rgn = new int[LIMIT];
   int[] chosen = new int[LIMIT];
   int count = 0;
   int matches = 0;
   int[] winnings = {0, 0, 0, 100, 10000, 50000, 1000000};
public JLottery2()
{
    super("Lottery");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(flow);
    add(header);
    //checkbox gen, label gen
    for(x = 0; x < MAX; ++x)
    {
        pick[x] = new JCheckBox();
        label[x] = new JLabel("   " + x);
        add(label[x]);
        add(pick[x]);
        pick[x].addItemListener(this);
    }
    add(bottom);
    //RNG
    for(x = 0; x < LIMIT; ++x)
    {
        rgn[x] = (int)Math.floor(Math.random() * MAX);
        for(y = 0; y < x; ++y)
            if(rgn[x] == rgn[y])
                --x;
    }
    //RNG for LIMIT 
    for(x = 0; x < LIMIT; ++x)
    {
        numbers += rgn[x] + "   ";
    } 
   }
//LIMIT boxes checked check(detect change)
public void itemStateChanged(ItemEvent check)
{
    Object source = check.getItem();
    if(count == LIMIT)
    {
        for(x= 0; x < MAX; ++x)
        {
            if(source == pick[x])
                pick[x].setSelected(false);
        }
    }
    else
    {
        //checks for correct pick to MAX pick
        for(x= 0; x < MAX; ++x)
        {
            if(source == pick[x])
            {
                int select = check.getStateChange();
                if(select == ItemEvent.SELECTED)
                {
                    chosen[count] = x;
                    picked += x + "   ";
                    ++count;
                }    
            }
        }
        //displays correct output to outArea part of frame for every match found
        if(count == LIMIT)
        {
            for(x = 0; x < LIMIT; ++x)
                for(y = 0; y < LIMIT; ++y)
                    if(chosen[x] == rgn[y])
                        ++matches; 
            bottom.append(numbers + "\n" + picked + 
                    "\nYou got " + matches + " match(es)!" + "\n" +
                    "YOU WIN $" + winnings[matches]);
        }
    }
}
public static void main(String[] arguments)
{
    JLottery2 frame = new JLottery2();
    frame.setSize(300, 300);
    frame.setVisible(true);
}
}
