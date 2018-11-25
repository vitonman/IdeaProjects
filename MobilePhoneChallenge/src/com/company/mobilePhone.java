package com.company;

import java.util.Scanner;

public class mobilePhone {
    private static Scanner scanner = new Scanner(System.in);
    private static Contacts contactData = new Contacts();


    public static void mobileMenu() {
        // write your code here
        boolean quit = false;
        int choice = 0;
        printInstructions();

        while (!quit){
            System.out.println("Enter your choice ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    contactData.printContactData();
                    break;
                case 2:
                    addContact();
                    break;
//                case 3:
//                    updateContact();
//                    break;
//                case 4:
//                    removeContact();
//                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }


    }

    public static void printInstructions(){
        System.out.println("\nPress  ");
        System.out.println("\n 0 - To print choice options.");
        System.out.println("\n 1 - To print the list of phone book.");
        System.out.println("\n 2 - To add a new contact.");
        System.out.println("\n 3 - To modify an item in the list.");
        System.out.println("\n 4 - To remove an item from the list.");
        System.out.println("\n 5 - To search for an item in the list.");
        System.out.println("\n 6 - To search for an item in the list.");
        System.out.println("\n 7 - To quit the application.");
    }

    public static void addContact(){
        System.out.println("Please enter a contact name:");
        String name = scanner.nextLine();
        System.out.println("Please enter a phone number:");
        String number = scanner.nextLine();
        contactData.addContactData(name, number);

    }

   public static void searchContact(){
       System.out.println("Please enter a name to find:");
       String name = scanner.nextLine();
       if(contactData.onFile(name)){
           System.out.println("The " + name + " is in your book");
       }else{
           System.out.println("There no name: " + name);
       }
   }



}
