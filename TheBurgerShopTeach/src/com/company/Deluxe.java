package com.company;

public class Deluxe extends Hamburger {
    public Deluxe() {
        super("Delux", "Sausage & Bacon", 14.56, "White");
        super.addHamburgerAddition1("Chips", 2.55);
        super.addHamburgerAddition2("Drink", 2.00);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
