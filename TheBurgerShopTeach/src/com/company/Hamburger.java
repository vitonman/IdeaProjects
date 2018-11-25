package com.company;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRoll;

    private String addtition1Name;
    private double addition1Price;

    private String addtition2Name;
    private double addition2Price;

    private String addtition3Name;
    private double addition3Price;

    private String addtition4Name;
    private double addition4Price;


    public Hamburger(String name, String meat, double price, String breadRoll) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRoll = breadRoll;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addtition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price){
        this.addtition2Name = name;
        this.addition2Price = price;
    }
    public void addHamburgerAddition3(String name, double price){
        this.addtition3Name = name;
        this.addition3Price = price;
    }
    public void addHamburgerAddition4(String name, double price){
        this.addtition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.price;

        System.out.println(this.name + " hamburger " + " on a " + this.breadRoll + " roll "
                + "price is " + this.price);

        if(this.addtition1Name != null){
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addtition1Name + " for an extra " + this.addition1Price);
        }
        if(this.addtition2Name != null){
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addtition2Name + " for an extra " + this.addition2Price);
        }
        if(this.addtition3Name != null){
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addtition3Name + " for an extra " + this.addition3Price);
        }
        if(this.addtition4Name != null){
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + this.addtition4Name + " for an extra " + this.addition4Price);
        }
        return hamburgerPrice;
    }










}
