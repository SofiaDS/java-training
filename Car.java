//defining car class
public class Car {
    String brand;
    String model;
    int year;
    double fuelLevel = 0.0; // default fuel level
    double maxFuelLevel; // maximum fuel level
    // double minFuelLevel = 0.0; // minimum fuel level

    // default constructor
    public Car(String brand, String model, int year, double maxFuelLevel) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.maxFuelLevel = maxFuelLevel;
    }

    // constructor with two parameters - polymorphism constructor overloading
    // this constructor allows to create a Car object without specifying the year
    public Car(String brand, String model, double maxFuelLevel) {
        this.brand = brand;
        this.model = model;
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

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    boolean hasFuel() {
        return this.getFuelLevel() > 0;
    }

    void refuel(double amount) {
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

    String displayInfo() {
        return "Car:" + this.getBrand() + " " + this.getModel() + " (" + this.getYear() + ")";
    }

    void consumeFuel(double amount) {

        if (this.fuelLevel - amount < 0) {
            System.err.println("Not enough fuel to continue!");
            return;
        }
        this.fuelLevel -= amount;
    }

    void startEnghine() {
        if (!this.hasFuel()) {
            System.err.println("You cannot start the engine, because there is no fuel in the tank!");
            return;
        } else {
            this.consumeFuel(0.1);
            System.out.println(this.displayInfo() + " is starting the engine!");

        }
    }

    // Entry point for static class execution
    public static void main(String[] args) {
        System.out.println("Hello world from a Car class");

        // instantiate a Car object
        Car car1 = new Car("Toyota", "Corolla", 2020, 50.0); // setting max fuel level
        car1.setFuelLevel(100.0); // setting fuel level

        Car car2 = new Car("Honda", "Civic", 80.0);

        Car car3 = new Car("Ford", "Focus", 2019, 60.0);

        System.out.println(car1.displayInfo());
        System.out.println(car2.displayInfo());
        System.out.println(car3.displayInfo());

        car1.startEnghine();
        car2.startEnghine();
    }
}