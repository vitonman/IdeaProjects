package com.company;

public class House {
    private Room room;

    public House(Room room) {
        this.room = room;
    }

    public void openDoors(){
        room.openDoor();
    }
}
