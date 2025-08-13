//defining car class
public class Car {
    String brand;
    String model;
    int year;

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

    String displayInfo() {
        return "Car:" + this.getBrand() + " " + this.getModel() + " (" + this.getYear() + ")";
    }

    void startEnghine() {
        System.out.println(this.displayInfo() + " is starting the engine!");
    }

    // Entry point for static class execution
    public static void main(String[] args) {
        System.out.println("Hello world from a Car class");

        // instantiate a Car object
        Car car1 = new Car();
        car1.setBrand("Toyota");
        car1.setModel("Corolla");
        car1.setYear(2020);

        Car car2 = new Car();
        car2.setBrand("Honda");
        car2.setModel("Civic");
        car2.setYear(2021);

        Car car3 = new Car();
        car3.setBrand("Ford");
        car3.setModel("Focus");
        car3.setYear(2019);

        System.out.println(car1.displayInfo());
        System.out.println(car2.displayInfo());
        System.out.println(car3.displayInfo());

        car1.startEnghine();
        car2.startEnghine();
        car3.startEnghine();
    }
}