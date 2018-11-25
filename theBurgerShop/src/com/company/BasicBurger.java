package com.company;

import java.util.SortedMap;

public class BasicBurger {
    private String bread;
    private String name;
    private String meat;
    private int price;
    private boolean salat;
    private boolean tomato;
    private boolean piclles;
    private boolean sous;
    public int new_price;
    public int additions = 1;

    public BasicBurger(String name, String bread, String meat, int price) {
        this.name = name;
        this.bread = bread;
        this.meat = meat;
        this.price = price;
        this.new_price = this.price;
    }

    public void getBasicBurger() {
        System.out.println("Type of bread - " + this.bread);
        System.out.println("Type of meat - " + this.meat);
        System.out.println("Basic price - " + this.price);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSalat(boolean salat) {
        this.salat = salat;
        this.new_price += additions;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
        this.new_price += additions;
    }

    public void setPiclles(boolean piclles) {
        this.piclles = piclles;
        this.new_price += additions;
    }

    public void setSous(boolean sous) {
        this.sous = sous;
        this.new_price += additions;
    }

    public void getAdditions(){
        System.out.println("Total additions of " + this.name + " burger");
        if(this.sous){
            System.out.println("Your added sous = " + this.additions);
        }
        if(this.salat){
            System.out.println("Your added salat= " + this.additions);
        }
        if(this.piclles){
            System.out.println("Your added piclles = " + this.additions);
        }
        if(this.tomato){
            System.out.println("Your added tomato = " + this.additions );
        }
    }

    public void getAll(){
        System.out.println("*******************************");
        System.out.println("*******************************");
        this.getBasicBurger();
        System.out.println("*******************************");
        this.getAdditions();

        System.out.println("**************TOTAL************");
        System.out.println("The total for now is " + this.new_price + " for your " + this.name);
    }
}
