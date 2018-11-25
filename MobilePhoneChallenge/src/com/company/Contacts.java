package com.company;

import java.util.ArrayList;

public class Contacts{

    private ArrayList<String> contactName = new ArrayList<String>();
    private ArrayList<String> contactNumber = new ArrayList<String>();


    public void addContactData(String name, String number){
        contactName.add(name);
        contactNumber.add(number);
    }

    public void printContactData(){
        System.out.println("You have " + contactName.size()+ " persons in your phonebook");

        for (int i = 0; i < contactName.size(); i++) {
            System.out.println((i+1) + ". " + contactName.get(i) + " and number is: " + contactNumber.get(i));
        }

    }

    private int findContact(String searchName){
        return contactName.indexOf(searchName);
    }

    public boolean onFile(String searchName){
        int position = findContact(searchName);
        if(position >= 0){
            return true;
        }else{
            return false;
        }
    }

    private void updateContact(int position, String name, String number){
        contactName.set(position,name);
        contactNumber.set(position,number);
        System.out.println("YOUR CHANGED BLAH BLAH");
    }




}
