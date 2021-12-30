package com.FOP.FOP_Demo.Lab_8;

public class Q2 {
    public static void main(String[] args) {
        BankAccount a = new BankAccount("Kevin", "123123", 100);
        a.displayBalance();
        a.withdraws(200);
        a.deposit(100);
        a.displayBalance();
        a.withdraws(150);
        a.displayBalance();
    }

}

class BankAccount {
    private String customer_name;
    private String IC;
    private double balance = 0;

    public BankAccount(String customer_name, String IC, double balance) {
        this.customer_name = customer_name;
        this.IC = IC;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.printf("Successfully deposit RM%.2f\n", amount);
    }

    public void withdraws(double amount) {
        if (amount < balance) {
            balance -= amount;
            System.out.printf("Successfully withdraw RM%.2f\n", amount);
        } else {
            System.out.println("Not enough money");
        }
    }

    public void displayBalance() {
        System.out.printf("Current balance: RM%.2f\n", balance);
    }
}