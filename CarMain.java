public class CarMain {
    // Entry point for static class execution
    public static void main(String[] args) {

        // instantiate a Car object
        Car car1 = new Car("Toyota", "Corolla", 2020, 50.0); // setting max fuel level
        // car1.setFuelLevel(100.0); // setting fuel level
        car1.refuel(100.0);

        Car car2 = new Car("Honda", "Civic", 2018, 80.0);

        Car car3 = new Car("Ford", "Focus", 2019, 60.0);

        System.out.println(car1.displayInfo());
        System.out.println(car2.displayInfo());
        System.out.println(car3.displayInfo());

        car1.startEnghine();
        car2.startEnghine();
    }

}
