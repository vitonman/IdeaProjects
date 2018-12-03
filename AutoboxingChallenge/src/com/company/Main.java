package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        // You job is to create a simple banking application.
        // There should be a Bank class  XXX
        // It should have an arraylist of Branches  XXX
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform

        Bank bank = new Bank("Estonia national bank");

        bank.addBranch("SEB");

        bank.addCustumer("SEB", "Vitali", 255.23);
        bank.addCustumer("SEB", "Viktor", 22.33);
        bank.addCustumer("SEB", "Stanislav", 5435.33);

        bank.addBranch("LHV");
        bank.addCustumer("LHV", "Stiven", 233.12);

        bank.addCustomerTransaction("SEB", "Vitali", 33);
        bank.addCustomerTransaction("SEB","Viktor", 323);

        bank.listCustomer("SEB", true);
        bank.listCustomer("LHV", true);
        
        if(!bank.addCustumer("Melbourne", "Oleg", 23.4)){
            System.out.println("Error Melbourne branch does not exist.");
        }


    }
}
