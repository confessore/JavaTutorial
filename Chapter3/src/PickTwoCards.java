//Filename PickTwoCards.java
//Written by krycess
//Written on Sep 29, 2012
public class PickTwoCards {
public static void main(String[] args)
{
    final int CARDS_IN_SUIT = 13;
    int x;
    int z;
    int y;
    int a;
    String s;
    String c;
    String h;
    String d;
    
    Card card = new Card();
    
    s = "Spades";
    c = "Clubs";
    h = "Hearts";
    d = "Diamonds";
    
    card.setSpades(s);
    card.setClubs(c);
    card.setHearts(h);
    card.setDiamonds(d);
   
x = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
z = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
y = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
a = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);

//System.out.print("Choose a suit:" + "\n" + "Spades\nClubs\nHearts\nDiamonds");

System.out.println(card.getSpades() + " " +  x + "\n" + card.getClubs() + " " + z + "\n" + card.getHearts() + " " + y + "\n" + card.getDiamonds() + " " + a);
}
}
