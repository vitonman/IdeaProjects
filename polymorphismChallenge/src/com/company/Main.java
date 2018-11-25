package com.company;


//BASE CLASS
class Car{
    private String name;
    private boolean engine;
    private int cylindres;
    private int wheels;


//----------------------------------------------------
    //KONSTRUKTOR NADO VIBIRAT SHTO TEBE NUZNo
    public Car(String name, int cylindres) {
        this.name = name;
        this.cylindres = cylindres;
        //SJUDA DOBOVLJAJEM STANDART PARAMETRES
        this.wheels = 4;
        this.engine = true;

    }

//--------------------------------------------------

        //GETTERS VIBIRAJEM TOLKO NE ZADANIJ PARAMETER
    public String getName() {
        return name;
    }
    public int getCylindres() {
        return cylindres;
    }

//-----------------------------------------

    //OTHER METHODS::::::
    public String startEngine(){
        return "Start Engine -> Car";
    }

    public String accelerate(){
        return "Accelerate -> Car";
    }

    public String brake(){
        return "Brake -> Car";
    }
//--------------------------------------------------
}

// NEW 3 SUB CLASSES
class Subaru extends Car{
    public Subaru(String name, int cylindres) {
        super(name, cylindres);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() +  " Start Engine";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() +   " Accelerate";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " Brake";
    }
}



// NEW 3 SUB CLASSES
class Ford extends Car{
    public Ford(String name, int cylindres) {
        super(name, cylindres);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() +  " Start Engine";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() +   " Accelerate";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " Brake";
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here

        Car car = new Car("Base", 4);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Subaru subaru = new Subaru("Kakoj", 4);
        System.out.println(subaru.startEngine());
        System.out.println(subaru.accelerate());
        System.out.println(subaru.brake());


        Ford ford = new Ford("Faclon", 4);
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
    }

}
