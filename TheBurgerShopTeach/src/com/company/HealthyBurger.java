package com.company;

public class HealthyBurger extends Hamburger {

    private String healthy1ExtraName;
    private double healthy1ExtraPrice;

    private String healthy2ExtraName;
    private double healthy2ExtraPrice;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthAddition1(String name, double price){
        this.healthy1ExtraName = name;
        this.healthy1ExtraPrice = price;
    }
    public void addHealthAddition2(String name, double price){
        this.healthy2ExtraName = name;
        this.healthy2ExtraPrice = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerprice = super.itemizeHamburger();
        if(this.healthy1ExtraName != null){
            hamburgerprice += this.healthy1ExtraPrice;
            System.out.println("Added " + this.healthy1ExtraName + " for an extra " + this.healthy1ExtraPrice);
        }

        if(this.healthy2ExtraName != null){
            hamburgerprice += this.healthy2ExtraPrice;
            System.out.println("Added " + this.healthy2ExtraName + " for an extra " + this.healthy2ExtraPrice);
        }
        return hamburgerprice;
    }
}
