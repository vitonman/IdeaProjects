package com.company;

import java.util.ArrayList;

public class Branch{
    private String name;
    private ArrayList<Costumer> costumers;

    public Branch(String name) {
        this.name = name;
        this.costumers = new ArrayList<Costumer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Costumer> getCostumers() {
        return costumers;
    }

    public boolean newCustomer(String customerName, double initialAmount){
        if(findCostumer(customerName) == null){
            this.costumers.add(new Costumer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double ammount){
        Costumer existingCustumer = findCostumer(customerName);

        if(existingCustumer != null){
            existingCustumer.addTransaction(ammount);
            return true;
        }
        return false;
    }

    private Costumer findCostumer(String customerName){
        for (int i = 0; i < this.costumers.size(); i++) {
            Costumer checkedCustumer = this.costumers.get(i);
            if(checkedCustumer.getName().equals(customerName)){
                return checkedCustumer;
            }
        }
        return null;
    }
}
