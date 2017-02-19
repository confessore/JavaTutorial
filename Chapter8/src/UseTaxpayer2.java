//Filename UseTaxpayer.java
//Written by krycess
//Written on Nov 3, 2012

public class UseTaxpayer2 {
public static void main(String[] args)
{
    Taxpayer[] tp = new Taxpayer[10];
    int x;
    for(x = 0; x < 10; x++)
    {
        tp[x] = new Taxpayer((x + 1) * 10000, x + 1) ;
        System.out.println("Taxpayer " + x + " has YGI " + tp[x].getYGI() 
                + " and SSN " + tp[x].getSSN());
    }
}
}
