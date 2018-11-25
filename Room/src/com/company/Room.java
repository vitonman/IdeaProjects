package com.company;

public class Room{
    private String name;
    private int window;
    private int doors;
    private int lamp;
    private int socket;

    public Room(String name, int window, int doors, int lamp, int socket) {
        this.name = name;
        this.window = window;
        this.doors = doors;
        this.lamp = lamp;
        this.socket = socket;
    }

    public void turnLamp(int lampe){
        System.out.println("At " + this.name + " turned on " + lampe + " lamps");
    }

    public void openDoor(){
        System.out.println("you have opened door at " + this.name);
    }
}
