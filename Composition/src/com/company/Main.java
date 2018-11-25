package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch", "Acer", 27, new Resolution(2540,1440));
        Motherboard newmotherboard = new Motherboard("BJlala", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, newmotherboard);
//        thePC.getMonitor().DrawPixelAt(1500,1200,"red");
//        thePC.getMotherboard().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerButton();

        thePC.powerUp();
    }
}
