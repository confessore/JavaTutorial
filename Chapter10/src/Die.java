//Filename Die.java
//Written by krycess
//Written on Nov 7, 2012

public class Die{
final private int numFaces = 6;
protected int minNum = 1;
protected int die;

public int Die()
{
    die = ((int)(Math.random() * 100 ) % numFaces + minNum);
    return die;
}
public int getDie()
{
    return die;
}
}
