package com.company;

public class HealthyBurger extends BasicBurger {

    private boolean carrot;
    private boolean bulgarian_pepper;

    public HealthyBurger(String name, String bread, String meat, int price) {
        super("GreenPiece", "Brown rye bread", "Chicken", price);
    }

    public void setCarrot(boolean carrot) {
        this.carrot = carrot;
        this.new_price += 1;
    }

    public void setBulgarian_pepper(boolean bulgarian_pepper) {
        this.bulgarian_pepper = bulgarian_pepper;
        this.new_price += 1;
    }

    @Override
    public void getAdditions() {
        super.getAdditions();
        if(this.carrot){
            System.out.println("You adedded carrot = " + this.additions);
        }
        if(this.bulgarian_pepper){
            System.out.println("You added bulgarian pepper = "  + this.additions);
        }


    }
}
