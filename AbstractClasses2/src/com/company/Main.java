package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dog = new Dog("Boldogg");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.breathe();
        penguin.eat();
        penguin.fly();
    }
}
