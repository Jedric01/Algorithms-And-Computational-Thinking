package oop;

public class Tesla extends Car {

    public double batteryCapacity;

    public Tesla(){
        super();
        System.out.println("Hello");
    }

    public void charge(){
        System.out.println("Charging...");
    }
}
