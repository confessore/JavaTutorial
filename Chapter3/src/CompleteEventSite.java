//Filename CompleteEventSite.java
//Written by Steven Confessore
//Written on 9/22/12

public class CompleteEventSite 
{
    private int siteNumber;
    private double hourlyFee;
     String SiteName;
    
    public int getSiteNumber()
    {
        return siteNumber;
    }  
    public double getHourlyFee()
    {
        return hourlyFee;
    }
    public String getSiteName()
    {
        return SiteName;
    }
    public CompleteEventSite()
    {
        siteNumber = 999;
    }
    public void setSiteNumber(int n)
    {
        siteNumber = n;
    }
    public void setHourlyFee(double m)
    {
        hourlyFee = m;
    }
    public void setSiteName(String l)
    {
        SiteName = l;
    }
}
