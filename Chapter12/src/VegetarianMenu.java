//Filename VegetarianMenu.java
//Written by krycess
//Written on Dec 5, 2012

public class VegetarianMenu extends Menu2{
String[] vegEntreeChoice = {"Spinach Lasagna",
    "Cheese Enchiladas", "Fruit Plate"};
public VegetarianMenu()
{
    super();
    for(int x = 0; x < vegEntreeChoice.length; ++x)
        entreeChoice[x] = vegEntreeChoice[x];
}
}

