//Filename DemoSquare.java
//Written by krycess
//Written on Nov 7, 2012

public class DemoSquare{
public static void main(String args[])
{
    Square Square = new Square();
    Cube Cube = new Cube();

    Square.setLength(10);
    Square.setWidth(5);

    Cube.setLength(10);
    Cube.setWidth(5);
    Cube.setHeight(4);
    Cube.computeSurfaceArea();
}
}