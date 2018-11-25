package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Room bethroom = new Room("bethroom",2,2,4,6);
        Room bathroom = new Room("bethroom",2,2,4,6);
        House myhouse = new House(bethroom);

        myhouse.openDoors();




    }
}
