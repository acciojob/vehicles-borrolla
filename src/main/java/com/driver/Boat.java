package com.driver;

public class Boat implements WaterVehicle {

    public String name;
    public int capacity;

    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVehicleName() {

        return name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getVehicleCapacity() {

        return capacity;
    }

    @Override
    public String toString() {
        return "Boat{" + "name='" + name + '\'' + ", capacity=" + capacity + '}';

    }

    public void displayBoatDetails() {
        System.out.println(this.toString());
    }
}
//add one more line