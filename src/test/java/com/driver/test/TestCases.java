
package com.driver.test;

import com.driver.Boat;
import com.driver.Vehicle;
import org.junit.Assert;
import org.junit.Test;

public class TestCases {

    @Test
    public void testCar1() {
        Vehicle car = new Vehicle("TestCar");
        car.steer(45);
        Assert.assertEquals(45, car.getCurrentDirection());
    }

    @Test
    public void testCar2() {
        Vehicle car = new Vehicle("TestCar");
        car.move(10, 45);
        Assert.assertEquals(10, car.getCurrentSpeed());
        Assert.assertEquals(45, car.getCurrentDirection());
    }

    @Test
    public void testF12() {
        Vehicle car = new Vehicle("TestCar");
        car.steer(90);
        car.stop();
        Assert.assertEquals(0, car.getCurrentSpeed());
        Assert.assertEquals(90, car.getCurrentDirection());
    }

    @Test
    public void testBoatName() {
        Boat boat = new Boat("Speedboat", 12);
        Assert.assertEquals("Speedboat", boat.getVehicleName());
    }

    @Test
    public void testBoatCapacity() {
        Boat boat = new Boat("Speedboat", 12);
        Assert.assertEquals(12, boat.getVehicleCapacity());
    }

    @Test
    public void testBoatToString() {
        Boat boat = new Boat("Speedboat", 12);
        String expected = "Boat{name='Speedboat', capacity=12}";
        Assert.assertEquals(expected, boat.toString());
    }
}