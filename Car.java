//defining car class
public class Car {
    String brand;
    String model;
    int year;

    // Entry point for static class execution
    public static void main(String[] args) {
        System.out.println("Hello world from a Car class");

        // instantiate a Car object
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Corolla";
        car1.year = 2020;

        Car car2 = new Car();
        car2.brand = "Honda";
        car2.model = "Civic";
        car2.year = 2021;
        Car car3 = new Car();
        car3.brand = "Ford";
        car3.model = "Focus";
        car3.year = 2019;

        System.out.println("Car 1: " + car1.brand + " " + car1.model + " (" + car1.year + ")");
        System.out.println("Car 2: " + car2.brand + " " + car2.model + " (" + car2.year + ")");
        System.out.println("Car 3: " + car3.brand + " " + car3.model + " (" + car3.year + ")");
    }
}