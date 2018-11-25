package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Player player = new Player();
//        player.name = "Vitali";
//        player.health = 20;
//        player.weapon = "Knife";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " +  player.healRemaining());

        EnhancedPlayer player = new EnhancedPlayer("vitali", 50, "sword");
        System.out.println("Initial health is " + player.getHealth()) ;
    }
}
