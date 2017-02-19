//Filename TwoDice.java
//Written by krycess
//Written on 10/8/12

public class TwoDice {
        public static void main(String[] args)
        {
            int roll = ((int)(Math.random() * 100 ) % 6 + 1);
            int roll2 = ((int)(Math.random() * 100 ) % 6 + 1);
            System.out.println("You rolled " + roll);
            System.out.println("They rolled " + roll2);
        }
}
