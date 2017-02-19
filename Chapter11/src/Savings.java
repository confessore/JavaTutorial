//Filename Savings.java
//Written by krycess
//Written on Dec 4, 2012

public class Savings extends Account {
    double interestRate;
    public Savings(int accountNumber, double interestRate) 
    {
        super(accountNumber);
        this.interestRate = interestRate;
    }
    @Override
    public void displayAccountBalance() 
    {
        System.out.println("Saving Account Information. Account balance: " + accountBalance);
    }
    @Override
    public void displayAccountNumber() 
    {
        System.out.println("Saving Account Information. Account number: " + accountNumber);
    }
    public void displayInterestRate() 
    {
        System.out.println("Saving Account Information. Interest rate: " + interestRate);
    }
}

