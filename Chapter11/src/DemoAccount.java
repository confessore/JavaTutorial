//Filename DemoAccount.java
//Written by krycess
//Written on Dec 4, 2012

public class DemoAccount {
    public static void main(String args[]) 
    {
        Savings savings = new Savings(728172, 8.4);
        savings.setAccountBalance(700);
        savings.displayAccountNumber();
        savings.displayAccountBalance();
        savings.displayInterestRate();
        Checking checking = new Checking(288271);
        checking.setAccountBalance(200);
        checking.displayAccountNumber();
        checking.displayAccountBalance();
    }
}
