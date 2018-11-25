package com.company;

public class Hamburger {
    private String name;
    private String breadRoll;
    private String meat;
    int price;
    private boolean cheese;
    private boolean carrot;
    private boolean piccles;
    private boolean tomato;
    private int additionals = 1;
    public int count;

    public Hamburger(String name, String breadRoll, String meat, int price) {
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    //SETTERS ------------------------------------------------------

    public void setCheese(boolean cheese) {
        if(cheese){
            this.cheese = cheese;
            this.price += additionals;
            this.count += 1;
            System.out.println("Your just added a cheese to your " + this.name);
        }
            this.price += 0;
    }

    public void setCarrot(boolean carrot) {
        if(carrot){
            this.carrot = carrot;
            this.price += additionals;
            this.count += 1;
            System.out.println("Your just added a carrot to your " + this.name);
        }
        this.price += 0;

    }

    public void setPiccles(boolean piccles) {
        if(piccles){
            this.piccles = piccles;
            this.price += additionals;
            this.count += 1;
            System.out.println("Your just added a carrot to your " + this.name);
        }
        this.price += 0;
    }

    public void setTomato(boolean tomato) {
        if(tomato){
            this.tomato = tomato;
            this.price += additionals;
            this.count += 1;
            System.out.println("Your just added a carrot to your " + this.name);
        }
        this.price += 0;
    }

    public boolean isTomato() {
        return tomato;
    }

    //SETTERS ------------------------------------------------------
}















class HealthBurger extends Hamburger{
    public HealthBurger(String name,String breadRoll, String meat, int price) {
        super(name="Healthburger",breadRoll="Brown rye bread", meat="Chicken", price=3);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setCheese(boolean cheese) {
        super.setCheese(cheese);
    }

    @Override
    public void setCarrot(boolean carrot) {
        super.setCarrot(carrot);
    }

    @Override
    public void setPiccles(boolean piccles) {
        super.setPiccles(piccles);
    }

    @Override
    public void setTomato(boolean tomato) {
        super.setTomato(tomato);
    }

}




