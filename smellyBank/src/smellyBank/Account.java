package smellyBank;

public class Account {
    public String AccountHolderName; 
    public double balance = 0; 

    public Account(String name, double initialBalance) {
        AccountHolderName = name; 
        balance = initialBalance;
    }


    public void withdraw(double amount) {
        balance -= amount;
    }


    public void setBalance(double balance) {
        this.balance = balance; 
    }
    
   
}
