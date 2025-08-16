package excercises;

public class m1 {
    public double x(float a, float b, String op) {

        switch (op) {
            case "sum":
                double sum = a + b;
                return sum;
            case "diff":
                double diff = a - b;
                return diff;
            case "prod":
                float prod = a * b;
                return prod;
            case "div":
                float div = a / b;
                return div;
            default:
                throw new IllegalArgumentException("Invalid operation: " + op);
        }

    }

    public int largestNumber(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;

        } else if (b >= a && b >= c) {
            return b;

        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        m1 calculator = new m1();
        // System.out.println(calculator.x(10, 2, "sum"));
        // System.out.println(calculator.x(10, 2, "diff"));
        // System.out.println(calculator.x(10, 2, "prod"));
        // System.out.println(calculator.x(10, 2, "div"));

        System.out.println(calculator.largestNumber(10, 20, 30));
        System.out.println(calculator.largestNumber(30, 20, 10));
    }
}