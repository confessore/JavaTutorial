import javax.swing.*;
import java.awt.*;

public class JFrameA {
    public static void main(String[] args)
    {
        Font headlineFont = new Font("Arial", Font.BOLD, 36);
        JFrame aFrame = new JFrame("Sixth frame");
        aFrame.setSize(250, 100);
        aFrame.setVisible(true);
        JLabel greeting = new JLabel("Hello");
        JLabel greeting2 = new JLabel("Who are you?");
        aFrame.setLayout(new FlowLayout());
        greeting.setFont(headlineFont);
        aFrame.add(greeting);
        aFrame.add(greeting2);
    }
}
