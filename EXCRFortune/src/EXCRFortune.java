import javax.swing.*;

public class EXCRFortune {
    public static void main(String[] args)
    {
        String[] fortune = {"The god's smile upon you. Every penny saved today is a penny earned","Watch the road, there could be cars","Don't forget to put your garbage out for collection","Have a good day"};
        int MAX = 4;
        int MIN = 0;
        int x = ((int)(Math.random() * 100) % MAX + MIN);
        JOptionPane.showMessageDialog(null, fortune[x]);
    }
}
