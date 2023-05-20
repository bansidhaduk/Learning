package com.inheritance;

public class SavingsAccount extends BankAccount {
    int minimumBalance = 2000;

    String withdraw() {

        int withdrawBal = 5000;

        if(balance - withdrawBal < minimumBalance) {
            return "Withdrawal makes balance under minimum balance";
        }
        else {
            balance = balance - withdrawBal;
            return "balance :" + balance;
        }
    }
}
