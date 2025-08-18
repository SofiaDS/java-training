package excercises;

/*
 * Initialize a positive integer. Implement a static method that calculates and
prints its factorial
 */
public class cl16 {

    public static void main(String[] args) {
        int positiveNumInt = (int) (Math.random() * 20) + 1;

        long factorial = 1;
        for (int i = 1; i <= positiveNumInt; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of number " + positiveNumInt + " is " + factorial);
    }
}
