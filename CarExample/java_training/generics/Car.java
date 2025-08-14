package CarExample.java_training.generics;

//defining car class
public class Car {
    private String brand;
    private String model;
    private int year;
    private double fuelLevel = 0.0; // default fuel level
    private final double maxFuelLevel; // final keyord means that this variable cannot be changed after initialization

    // default constructor
    public Car(String brand, String model, int year, double maxFuelLevel) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.maxFuelLevel = maxFuelLevel;
    }

    // getter for the attribute brand
    public String getBrand() {
        return this.brand;
    }

    // setter for the attribute brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public boolean hasFuel() {
        return this.getFuelLevel() > 0;
    }

    public void refuel(double amount) {

        if (amount <= 0) {
            System.err.println("You cannot remove fuel from the tank!");
            return;
        } else if (amount + this.fuelLevel > this.maxFuelLevel) {
            System.err
                    .println("You cannot refuel more than the maximum fuel level of " + this.maxFuelLevel + " liters!");
            return;
        } else {

            this.fuelLevel += amount;
            System.out.println(
                    "Refueled completed " + amount + " liters. Current fuel level:" + this.getFuelLevel() + " liters.");
        }
    }

    public String displayInfo() {
        return "Car:" + this.getBrand() + " " + this.getModel() + " (" + this.getYear() + ")";
    }

    private void consumeFuel(double amount) {

        if (this.fuelLevel - amount < 0) {
            System.err.println("Not enough fuel to continue!");
            return;
        }
        this.fuelLevel -= amount;
    }

    public void startEnghine() {
        if (!this.hasFuel()) {
            System.err.println("You cannot start the engine, because there is no fuel in the tank!");
            return;
        } else {
            this.consumeFuel(0.1);
            System.out.println(this.displayInfo() + " is starting the engine!");

        }
    }

}