package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
   
    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance(){ return this.balance; }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        if (amount > this.balance)
            return;

        this.balance -= amount;
    }
    private double balance;
}
