public class CarMain {
    // Entry point for static class execution
    public static void main(String[] args) {

        // instantiate a Car object
        // Car toyota = new Car("Toyota", "Corolla", 2020, 50.0); // setting max fuel
        // level
        // toyota.setFuelLevel(100.0); // setting fuel level
        // toyota.refuel(100.0);
        // Car honda = new Car("Honda", "Civic", 2018, 80.0);
        // Car ford = new Car("Ford", "Focus", 2019, 60.0);
        ElectricCar tesla = new ElectricCar("Tesla", "Model S", 2021, 100.0);
        DieselCar audi = new DieselCar("Audi", "A6", 2020, 70.0);

        // System.out.println(toyota.displayInfo());
        // System.out.println(honda.displayInfo());
        // System.out.println(ford.displayInfo());
        System.out.println(tesla.displayInfo());
        System.out.println(audi.displayInfo());
        // toyota.startEnghine();
        // honda.startEnghine();
        tesla.startEnghine();
        tesla.recharge(50.0);

        audi.startEnghine();
        audi.refuel(30.0);

    }

}
