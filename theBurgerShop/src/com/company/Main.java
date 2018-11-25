package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        HealthyBurger healthy = new HealthyBurger("standart", "standart", "standart", 20);
        healthy.setCarrot(true);
        healthy.setTomato(true);
        healthy.setSalat(true);
        healthy.getAll();

        DeluxeBurger deluxe = new DeluxeBurger("Royal", "white", "Pork", 30);
        deluxe.setSalat(true);
        deluxe.getAll();

    }
}
