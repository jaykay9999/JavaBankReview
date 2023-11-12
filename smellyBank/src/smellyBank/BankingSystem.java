package smellyBank;

import java.util.Scanner;

public class BankingSystem {

	//main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account holder's name: ");
        String name = sc.next();
        System.out.println("Enter initial balance: ");
        double initBalance = sc.nextDouble();
        
        Account account = new Account(name, initBalance);
        
        while (true) {
            System.out.println("Choose action: 1. Withdraw");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter amount: ");
                double amount = sc.nextDouble();
                account.withdraw(amount);
                System.out.println("New balance: " + account.balance);
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}
