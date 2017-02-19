//Filename TestLoadedDie.java
//Written by krycess
//Written on Nov 7, 2012

public class TestLoadedDie {
static int loadWin;
static int dieWin;

public static void main(String[] args)
{
    Die Die = new Die();
    LoadedDie Load = new LoadedDie();
    
    //Die.Die();
    //System.out.println("Die: " + Die.getDie());
    
    //Load.Loaded();
    //System.out.println("Loaded: " + Load.getLoaded());
    
    for(int x = 0; x < 1000; x++)
    {
        Die.Die();
        Load.Loaded();
        if(Die.getDie() < Load.getLoaded())
            loadWin++;
        else
            dieWin++;
    }
    System.out.println("Loaded die won " + loadWin + " times.");
    System.out.println("Regular die won " + dieWin + " times.");
}
}
