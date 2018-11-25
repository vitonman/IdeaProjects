package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here



        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.00, "White");

        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition3("Sosiska", 0.20);
        System.out.println(hamburger.itemizeHamburger());


        HealthyBurger healthy = new HealthyBurger("Bacon", 4.55);
        healthy.addHealthAddition1("Egg", 5.42);
        healthy.addHealthAddition1("Lentis", 3.41);
        System.out.println("Total Healthy Burger price is " +healthy.itemizeHamburger() );

        Deluxe deluxe = new Deluxe();









    }
}
