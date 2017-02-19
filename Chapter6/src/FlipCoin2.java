//Filename FlipCoin2.java
//Written by krycess
//Written on 10/11/12

public class FlipCoin2 {
public static void main(String[] args)
{
final int LIMIT = 1000;
int loopCount = 1;
int flip;
int Heads;
Heads = 0;
int Tails;
Tails = 0;

while(loopCount < LIMIT)
{
    loopCount = loopCount + 1;
    flip = ((int)(Math.random() * 100) % 2 + 1);
    
    if(flip == 1)
        Heads = Heads + 1;
    else
        if(flip == 2)
            Tails = Tails + 1;
}

System.out.println(calcPer(Heads));
System.out.println(calcPer(Tails));
}
public static double calcPer(int toss)
{
    double per = toss / 1000;
    return per;
}
}
