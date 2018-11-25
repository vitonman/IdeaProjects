package com.company;

public class DeluxeBurger extends BasicBurger {
    private boolean chips;
    private boolean drinks;


    public DeluxeBurger(String name, String bread, String meat, int price) {
        super(name, bread, meat, price);
        this.setAuto();
    }

    public void setAuto(){
       this.setChips(true);
       this.setDrinks(true);
    }

    private void setChips(boolean chips) {
        this.chips = chips;
    }

    private void setDrinks(boolean drinks) {
        this.drinks = drinks;
    }

    @Override
    public void getAdditions() {
        super.getAdditions();
        if(this.chips){
            System.out.println("Added chips");
        }
        if(this.drinks){
            System.out.println("Added drinks");
        }
    }
}
