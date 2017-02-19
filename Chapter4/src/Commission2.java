//Filename Commission2.java
//Written by krycess
//Written on 10/8/12

public class Commission2 {
    double sales;
    double rate;
    
    public static void main(String[] args)
    {
        System.out.println("If Geoff sold a $29,000 vehicle for Marty at .10 commission rate, he would earn ");
        computeCommission(29000, .10);
        
        System.out.println("Miranda is not the sharpest tool in the shed and does not know how to obtain a percentage from an integer.");
        System.out.println("She uses this tool to see how much her paycheck will be at the end of the week.");
        System.out.println("This week she sold $50,000 in alcoholic beverages at work. At 5% commission for her total gross sales, she will earn ");
        computeCommission(50000, 5);
        
        System.out.println("Marty got hit hard by politicians and the inflation of the dollar caused him to make a choice\n between paying off his yacht and paying his employee.\n Marty ain't really a nice guy.");
        System.out.println("Geoff sold the vehicle for $29,000 but he only recieved ");
        computeCommission(29000);
    }
    public static void computeCommission(double sales, double rate)
    {
       double commission =  sales * rate;
       System.out.println("$" + commission);
    }
    public static void computeCommission(double sales, int rate)
    {
       double newRate = rate / 100.0;
       double commission = sales * newRate;
       System.out.println("$" + commission);
    }
    public static void computeCommission(double sales)
    {
        double commission = sales * .075;
        System.out.println("$" + commission);
    }
}
