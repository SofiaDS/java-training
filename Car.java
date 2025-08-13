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
        Car car2 = new Car();
        Car car3 = new Car();

        System.out.println("Car 1: " + car1.brand + " " + car1.model + " (" + car1.year + ")");
        System.out.println("Car 2: " + car2.brand + " " + car2.model + " (" + car2.year + ")");
        System.out.println("Car 3: " + car3.brand + " " + car3.model + " (" + car3.year + ")");
    }
}