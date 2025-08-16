package excercises;

// Implement a static method perimeterRectangle(double length, double width) that returns the perimeter of a rectangle
public class Perimeter {

    public static double perimeterRectangle(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be positive numbers.");
        }
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        // Example usage
        double length = 5.0;
        double width = 3.0;
        System.out.println("Perimeter of the rectangle: " + Perimeter.perimeterRectangle(length, width));
    }
}
