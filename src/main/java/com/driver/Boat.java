package com.driver;
public class Boat implements WaterVehicle {
    public String name;
    public int capacity;
    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
    public String getVehicleName()
    {

        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public int getVehicleCapacity() {

        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    @Override
    public String toString()
    {
        return "Boat{" + "name='" + name + '\'' + ", capacity=" + capacity + '}';
    }
 public void displayBoatDetails() {
     System.out.println(this.toString());

 }
}
//add one more line