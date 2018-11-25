package com.company;

import java.util.ArrayList;

public class Contacts {

    private ArrayList<String> contactList = new ArrayList<String>();

    public void addContactList(String item) {
        contactList.add(item);
    }

    public ArrayList<String> getContactList() {
        return contactList;
    }

    public void printContactList(){
        System.out.println("You have " + contactList.size() + " items in your grocery list");
        for (int i = 0; i < contactList.size() ; i++) {
            System.out.println((i+1) + ". " + contactList.get(i));
        }
    }
    
    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >= 0){
            modifyGroceryItem(position, newItem);
        }
    }

    private  void modifyGroceryItem(int position, String newItem) {
        contactList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }


    public void removeGroceryItem(String item){
        int position = findItem(item);
        if(position >= 0){
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position){
        contactList.remove(position);
        //milk
        //cheese
        //bread
    }

    private int findItem(String searchItem){
        //boolean exist = groceryList.contains(searchItem);
//        int position = groceryList.indexOf(searchItem);
//        if(position >= 0){
//            return groceryList.get(position);
//        }
//        return null;

        return contactList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position >= 0){
            return true;
        }else{
            return false;
        }
    }


}
