package org.xpdojo.bank;

public class Account {
    public int balance;

    public void deposit(int i){
        balance += i;
    }

    public boolean withdraw(int i){
        if (balance >= i){
            balance -= i;
            return true;
        } else {
            return false;
        }

    }

}
