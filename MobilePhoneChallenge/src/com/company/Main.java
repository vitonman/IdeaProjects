package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
	// write your code here
        boolean quit = false;
        int choice = 0;
        printInstructions();


    }

    public static void printInstructions(){
        System.out.println("\nPress  ");
        System.out.println("\n 0 - To print choice options.");
        System.out.println("\n 1 - To print the list of grocery items.");
        System.out.println("\n 2 - To add an item to the list.");
        System.out.println("\n 3 - To modify an item in the list.");
        System.out.println("\n 4 - To remove an item from the list.");
        System.out.println("\n 5 - To search for an item in the list.");
        System.out.println("\n 6 - To search for an item in the list.");
        System.out.println("\n 7 - To quit the application.");
    }
}
