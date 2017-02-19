//Filename Cube.java
//Written by krycess
//Written on Nov 7, 2012

public class Cube extends Square{
private int H;

public void computeSurfaceArea()
{
    super.computeSurfaceArea();
    System.out.println("Cube area is " 
            + ((2 * L * W) + (2 * W * H) + (2 * L * H)));
}
public void setHeight(int h)
{
      H = h;
}
}