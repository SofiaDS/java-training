//defining car class
public class Car_old {
    String brand;
    String model;
    int year;

    String displayInfo() {
        return "Car:" + this.brand + " " + this.model + " (" + this.year + ")";
    }

    void startEnghine() {
        System.out.println(this.displayInfo() + " is starting the engine!");
    }

    // Entry point for static class execution
    public static void main(String[] args) {
        System.out.println("Hello world from a Car class");

        // instantiate a Car object
        Car_old car1 = new Car_old();
        car1.brand = "Toyota";
        car1.model = "Corolla";
        car1.year = 2020;

        Car_old car2 = new Car_old();
        car2.brand = "Honda";
        car2.model = "Civic";
        car2.year = 2021;

        Car_old car3 = new Car_old();
        car3.brand = "Ford";
        car3.model = "Focus";
        car3.year = 2019;

        System.out.println(car1.displayInfo());
        System.out.println(car2.displayInfo());
        System.out.println(car3.displayInfo());

        car1.startEnghine();
        car2.startEnghine();
        car3.startEnghine();
    }
}