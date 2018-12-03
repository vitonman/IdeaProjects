package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }
    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustumer(String branchName, String customerName, double initialAmont){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.newCustomer(customerName,initialAmont);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch (String branchName){
        for (int i = 0; i < this.branches.size(); i++) {
            Branch checkedBranches = this.branches.get(i);
            if(checkedBranches.getName().equals(branchName)){
                return checkedBranches;
            }
        }
        return null;
    }


    public boolean listCustomer(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if(branch!=null){
            System.out.println("Customers details for branch " + branch.getName());

            ArrayList<Costumer> branchCustomer = branch.getCostumers();
            for (int i = 0; i < branchCustomer.size(); i++) {
                Costumer branchCostomer = branchCustomer.get(i);
                System.out.println("Customer: " + branchCostomer.getName() + "[" + (i+1) + "]");
                if(showTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCostomer.getTransactions();
                    for (int j = 0; j < transactions.size() ; j++) {
                        System.out.println("[" + (j+1) + "] Amount" + transactions.get(i));
                    }
                }
            }
        }
        return false;
    }














}
