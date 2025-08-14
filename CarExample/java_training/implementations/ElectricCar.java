package CarExample.java_training.implementations;

import CarExample.java_training.generics.Car;

// encapsulation
public class ElectricCar extends Car {

    private double batteryLevel;
    private final double maxBatteryLevel; // Assuming a maximum battery level of 100%

    public ElectricCar(String brand, String model, int year, double maxBatteryLevel) {
        // it only matters the type of the data taken as input, not the name
        // maxBatteryLevel is the same typ as maxFuelLevel in Car
        // so we can use the same constructor
        super(brand, model, year, maxBatteryLevel);
        this.batteryLevel = 0.0;
        this.maxBatteryLevel = maxBatteryLevel;
    }

    public double getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(double batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public void recharge(double amount) {

        if (amount <= 0) {
            System.err.println("You cannot remove charge from the battery!");
            return;
        } else if (amount + this.batteryLevel > this.maxBatteryLevel) {
            System.err
                    .println("You are goint to overfill the battery!!");
            return;
        } else {

            this.batteryLevel += amount;
            System.out.println(
                    "Recharge completed " + amount + " liters. Current fuel level:" + this.getBatteryLevel()
                            + " liters.");
        }
    }

    @Override
    public void startEnghine() {
        if (this.batteryLevel > 0) {
            // this.consumeFuel(0.1);
            System.out.println(this.displayInfo() + " is starting the engine!");

        } else {
            System.err.println("Car does not have enough charge, you cannot start the engine!");
            return;
        }
    }
}