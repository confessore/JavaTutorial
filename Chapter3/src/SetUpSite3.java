//Filename SetUpSite3.java
//Written by Steven Confessore
//Written on 9/21/12

import java.util.Scanner;

public class SetUpSite3
{
    public static void main(String[] args)
    {
        final int FOUNDED_YEAR = 1977;
        int currentYear;
        int age;
        
        Scanner input = new Scanner(System.in);
        
        CompleteEventSite oneSite = new CompleteEventSite();
        int siteNum;
        String SiteName;
        double hourlyFee;
        
        statementOfPhilosophy();
        
        System.out.print("Enter the current year as a four-digit number ");
        currentYear = input.nextInt();
        
        System.out.print("Enter the event site number ");
        siteNum = input.nextInt();
        
        System.out.print("Enter the name of the event site ");
        SiteName = input.nextLine();
        
        System.out.print("Enter the hourly fee for the event site ");
        hourlyFee = input.nextDouble();
        
        oneSite.setSiteNumber(siteNum);
        oneSite.setSiteName(SiteName);
        oneSite.setHourlyFee(hourlyFee);
        
        age = calculateAge(FOUNDED_YEAR, currentYear);
        
        System.out.println("Founded in " + FOUNDED_YEAR);
        System.out.println("Serving you for " + age + " years ");
        System.out.println("The site number is " + oneSite.getSiteNumber());
        System.out.println("The event site is " + oneSite.getSiteName());
        System.out.println("The price is " + oneSite.getHourlyFee());
    }
    public static void statementOfPhilosophy()
    {
        System.out.println("Event Handlers Incorporated is");
        System.out.println("dedicated to making your event");
        System.out.println("a most memorable one.");
    }
    public static int calculateAge(int originYear, int currDate)
    {
        int years;
        years = currDate - originYear;
        return years;
    }
}
