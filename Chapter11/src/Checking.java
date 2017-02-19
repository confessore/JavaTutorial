//Filename Checking.java
//Written by krycess
//Written on Dec 4, 2012

public class Checking extends Account {
    public Checking(int accountNumber) 
    {
        super(accountNumber);
    }
    @Override
    public void displayAccountBalance() 
    {
        System.out.println("Checking Account Information. Account balance: " + accountBalance);
    }
    @Override
    public void displayAccountNumber() 
    {
        System.out.println("Checking Account Information. Account number: " + accountNumber);
    }
}

