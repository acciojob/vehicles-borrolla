package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);

        // Creating a new Boat object
        Boat myBoat = new Boat("Yacht", 10);
        // Using the setName and setCapacity methods
        myBoat.setName("Speedboat");
        myBoat.setCapacity(12);
        // Displaying the boat details without explicitly calling toString()
       myBoat.displayBoatDetails();

    }
}
