package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("mobile phona");

        int choice = 0;
        boolean off = false;
        while (!off){
            System.out.println("Menu:1<->2:OFF ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    mobilePhone.mobileMenu();
                    break;
                case 2:
                    off = true;
                    printOffmessage();
                    break;
            }
    }

    }
    public static void printOffmessage(){
        System.out.println("The mobile phone turned off, bye");
    }
}
