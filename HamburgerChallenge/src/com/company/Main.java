package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean decision;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, its Bills Burger, what type of burger you want?");
        System.out.println("Hamburger, Healthburger or Deluxe hamburger?");
        String answer = scanner.nextLine();
        System.out.println(answer);
        if(answer == "Hamburger"){
            Hamburger standart = new Hamburger("Hamburger", "White", "beef", 3);
            System.out.println("your " + standart.getName() + " was ordered");
            System.out.println("your " + standart.getName() + " was ordered");
        }
        scanner.close();

    }
}

