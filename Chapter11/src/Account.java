//Filename Account.java
//Written by krycess
//Written on Dec 4, 2012

public abstract class Account {
    int accountNumber;
    double accountBalance;
    public Account(int accountNumber) 
    {
        this.accountNumber = accountNumber;
        this.accountBalance = 0.0;
    }
    public void setAccountBalance(double accountBalance) 
    {
        this.accountBalance = accountBalance;
    }
    public abstract void displayAccountNumber();
    public abstract void displayAccountBalance();
}

