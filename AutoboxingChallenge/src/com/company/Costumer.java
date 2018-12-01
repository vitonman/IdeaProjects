package com.company;

import java.util.ArrayList;

//KLIENT
public class Costumer {
    private String name;
    ArrayList<Double> transactions = new ArrayList<Double>();

    public void setName(String name, Double start_value) {
        this.name = name;
        transactions.add(start_value);
    }

    public void setTransactions(ArrayList<Double> transactions) {
        this.transactions = transactions;
    }
}
