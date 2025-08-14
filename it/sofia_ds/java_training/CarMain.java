package it.sofia_ds.java_training;

import it.sofia_ds.java_training.implementations.DieselCar;
import it.sofia_ds.java_training.implementations.ElectricCar;

public class CarMain {
    // Entry point for static class execution
    public static void main(String[] args) {

        ElectricCar tesla = new ElectricCar("Tesla", "Model S", 2021, 100.0);
        DieselCar audi = new DieselCar("Audi", "A6", 2020, 70.0);

        System.out.println(tesla.displayInfo());
        System.out.println(audi.displayInfo());
        tesla.startEnghine();
        tesla.recharge(50.0);

        audi.startEnghine();
        audi.refuel(30.0);

    }

}
