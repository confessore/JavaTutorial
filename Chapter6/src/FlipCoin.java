//Filename FlipCoin.java
//Written by krycess
//Written on 10/11/12

public class FlipCoin {
public static void main(String[] args)
{
final int LIMIT = 10;
int loopCount = 1;
int flip;


while(loopCount < LIMIT)
{
    loopCount = loopCount + 1;
    flip = ((int)(Math.random() * 100) % 2 + 1);
    
    if(flip == 1)
        System.out.println("Heads");
    else
        if(flip == 2)
            System.out.println("Tails");
}
}
}
