package com.polymorphism;

public class SavingsAccount extends BankAccount {
    int minimumBalance = 2000;

    String withdraw() {
//        int withdrawBal = 5000;
//        if(balance - withdrawBal < minimumBalance) {
//            balance = balance - withdrawBal;
//            return "balance :" + balance;
//        }
//        else {
            return "Withdrawal makes balance under minimum balance";
        //}
    }
}
