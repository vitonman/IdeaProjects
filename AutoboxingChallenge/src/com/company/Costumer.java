package com.company;

import java.util.ArrayList;

//KLIENT
public class Costumer {
    private String name;
    private ArrayList<Double> transactions;

    public Costumer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

   public void addTransaction(double amount){
        this.transactions.add(amount);
   }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
