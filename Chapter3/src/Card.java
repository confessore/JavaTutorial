//Filename Card.java
//Written by Steven Confessore
//Written on 10/1/12
public class Card {
    String spades;
    String clubs;
    String hearts;
    String diamonds;
    int suits;
    
    String getSpades()
    {
        return spades;
    }
    String getClubs()
    {
        return clubs;
    }
    String getHearts()
    {
        return hearts;
    }
    String getDiamonds()
    {
        return diamonds;
    }
    
    public void setSpades(String s)
    {
        spades = s;
    }
    public void setClubs(String c)
    {
        clubs = c;
    }
    public void setHearts(String h)
    {
        hearts = h;
    }
    public void setDiamonds(String d)
    {
        diamonds = d;
    }
    public void Suits()
    {
            suits = 4;
    }
}
