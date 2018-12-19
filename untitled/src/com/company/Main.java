package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        boolean s1 = false;
        boolean s2 = false;

        boolean quit = false;


        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Holiday Vacation over");
                    quit = true;
                    break;
                case 1:
                    s1 = true;
                    System.out.println(" KNOPKA 1  =  " + s1);
                    break;
                case 2:
                    s2 = true;
                    System.out.println(" KNOPKA 2 =  " + s2);
                    break;
                case 3:
                    break;
            }

        }

    }


}
