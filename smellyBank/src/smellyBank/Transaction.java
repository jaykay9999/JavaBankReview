package smellyBank;

import java.util.Date;

public class Transaction {
    public enum TransactionType {
        DEPOSIT, WITHDRAW
    }

    public Date transactionDate; 
    public TransactionType type; 
    public double amount; 

    public Transaction(TransactionType type, double amount) {
        this.type = type;
        this.amount = amount;
        transactionDate = new Date();
    }
    
    public String getTransactionDetails() {
        return "Transaction: " + type + " Amount: " + amount + " on " + transactionDate; 
       
    }
}
