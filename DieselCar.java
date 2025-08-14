// encapsulation
public class DieselCar extends Car {

    public DieselCar(String brand, String model, int year, double maxFuelLevel) {
        super(brand, model, year, maxFuelLevel);
    }

    @Override
    public void startEnghine() {
        // to do check if the filter is clean
        super.startEnghine();
    }
}
