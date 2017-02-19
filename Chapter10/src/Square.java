//Filename Square.java
//Written by krycess
//Written on Nov 7, 2012

public class Square{
public int L;
public int W;
private int sA;

public void computeSurfaceArea()
{
    sA = L * W;
    System.out.println("Square Area: " + sA);
}
public int getSurfaceArea()
{
    return sA;
}
public void setLength(int l)
{
    L = l;
}
public void setWidth(int w)
{
    W = w;
}
}

