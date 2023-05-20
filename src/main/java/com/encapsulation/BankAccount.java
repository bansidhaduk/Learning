package com.encapsulation;

public class BankAccount {

    private double accountNumber;
    private  double balance;
    private String customerName;

    public BankAccount(double  accountNumber, double balance, String customerName){
        this.accountNumber = accountNumber;
        if (balance > 0.0)
            this.balance = balance;
        this.customerName = customerName;
    }
    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
