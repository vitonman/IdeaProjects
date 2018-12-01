package com.company;

import java.util.ArrayList;

public class Branch extends Costumer {
    ArrayList<Costumer> costumers = new ArrayList<Costumer>();

    //FILIAAL

    public Branch(ArrayList<Costumer> costumers) {
        this.costumers = costumers;
    }

    public ArrayList<Costumer> getCostumers() {
        return costumers;
    }

    @Override
    public void setName(String name, Double start_value) {
        super.setName(name, start_value);
    }

    @Override
    public void setTransactions(ArrayList<Double> transactions) {
        super.setTransactions(transactions);
    }
}
