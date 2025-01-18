package com.driver;

public class Car extends Vehicle {
    private final int wheels;
    private  String type;
    private final int doors;
    private final int gears;
    private final boolean isManual;
    private  int currentGear;
    private final int seats;

    private int currentSpeed;
    private int currentDirection;

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super(name);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.type = type;
        this.seats = seats;

    }
    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getSeats() {
        return seats;
    }

    public int getCurrentGear() {
        return currentGear;
    }


    public void changeGear(int newGear){
        this.currentGear = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void move(int newSpeed, int newDirection) {
        this.currentSpeed = newSpeed;
        this.currentDirection = newDirection;
        System.out.println("move method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }

    public void changeSpeed(int newSpeed, int newDirection){
        // Calls the move method from the Vehicle class
        move(newSpeed, newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
