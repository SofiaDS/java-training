/**
 * Class representing a car with a brand, model, year and fuel level.
 * 
 * @author Sofia Della Spora
 * @version 1.0
 *
 */
package CarExample.java_training.generics;

// defining car class
public class Car {
    /**
     * The brand of the car
     */
    private String brand;
    /**
     * The model of the car
     */
    private String model;
    /**
     * The year of the car
     */
    private int year;
    /**
     * The current fuel level of the car
     */
    private double fuelLevel = 0.0; // default fuel level
    /**
     * The maximum fuel level of the car
     */
    private final double maxFuelLevel; // final keyord means that this variable cannot be changed after initialization

    /**
     * Default constructor
     * 
     * @param brand   The brand of the car
     * @param model   The model of the car
     * @param year    The year of the car
     * @param maxFuel The maximum fuel level of the car
     */
    public Car(String brand, String model, int year, double maxFuelLevel) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.maxFuelLevel = maxFuelLevel;
    }

    /**
     * Getter for the attribute brand
     * 
     * @return The brand of the car
     */
    public String getBrand() {
        return this.brand;
    }

    /**
     * Setter for the attribute brand
     * 
     * @param brand The brand of the car
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Getter for the attribute model
     * 
     * @return The model of the car
     */
    public String getModel() {
        return model;
    }

    /**
     * Setter for the attribute model
     * 
     * @param model The model of the car
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Getter for the attribute year
     * 
     * @return The year of the car
     */
    public int getYear() {
        return year;
    }

    /**
     * Setter for the attribute year
     * 
     * @param year The year of the car
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Getter for the attribute fuelLevel
     * 
     * @return The current fuel level of the car
     */
    public double getFuelLevel() {
        return fuelLevel;
    }

    /**
     * Checks if the car has fuel
     * 
     * @return True if the car has fuel, false otherwise
     */
    public boolean hasFuel() {
        return this.getFuelLevel() > 0;
    }

    /**
     * Refuel the car
     * 
     * @param amount The amount of fuel to add
     */
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

    /**
     * Generates a string with the car's information
     * 
     * @return A string with the car's information
     */
    public String displayInfo() {
        return "Car:" + this.getBrand() + " " + this.getModel() + " (" + this.getYear() + ")";
    }

    /**
     * Private method to consume fuel
     * 
     * @param amount The amount of fuel to consume
     */
    private void consumeFuel(double amount) {

        if (this.fuelLevel - amount < 0) {
            System.err.println("Not enough fuel to continue!");
            return;
        }
        this.fuelLevel -= amount;
    }

    /**
     * Starts the car's engine
     * 
     * @throws Exception If the car has no fuel
     */
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
