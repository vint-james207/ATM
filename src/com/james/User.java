package com.james;


/**
 * Created by jamesyburr on 5/18/16.
 */
public class User {
    String name;
    Double balance;


    public User(String name, Double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double changeBalance(double amnt) {
        balance -= amnt;
        return balance;
    }
}

