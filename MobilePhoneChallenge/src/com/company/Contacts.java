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

    public void printCurrentContact(String name){
        System.out.println("Contact name: " + contactName.get(findContact(name))
                + " number of name: " + contactNumber.get(findContact(name)));
    }

    private int findContact(String searchData){
        int position = 0;
        if(contactName.indexOf(searchData)>=0){
            return contactName.indexOf(searchData);
        }else if(contactNumber.indexOf(searchData)>=0){
            return contactNumber.indexOf(searchData);
        }else{
            return 0;
        }

    }

    public void updateContact(String currentName, String newName, String number){
        int position = findContact(currentName);
        if(position >= 0){
            updateContact(position, newName, number);
        }
    }

    private void updateContact(int position, String newName, String number){
        contactName.set(position, newName);
        contactNumber.set(position, number);

    }


    public boolean onFile(String searchData){
        int position = findContact(searchData);
        if(position >= 0){
            return true;
        }else{
            return false;
        }
    }



    public void removeContact(String name){
        int position = findContact(name);
        if (position >= 0){
            removeContact(position);
        }
    }

    private void removeContact(int position){
        contactName.remove(position);
        contactNumber.remove(position);
        System.out.println("Contact has been deleted");
    }


}
