package excercises;

/*
 * Implement a static method triangleArea(double a, double b, double c) that
calculates the area of a triangle using Heron's formula
 */
public class AreaCalc {
    private static void triangleArea(double a, double b, double c) {
        double semiPerimeter = (a + b + c) / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
        System.out.println("The area of the triangle is: " + area);
    }

    public static void main(String[] args) {
        // Example usage
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;
        triangleArea(a, b, c);
    }
}
