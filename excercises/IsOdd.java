package excercises;

//static method is a method that belongs to the class rather than to instances of the class
//so it can be called without creating an instance of the class
// write a static method isOdd that returns 0 if the number is even and 1 if the number is odd
public class IsOdd {
    public static int isOdd(int number) {
        // No need to check instanceof for primitive int
        if (number % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        // Example usage
        int number = 2;
        System.out.println("Is the number odd? " + (IsOdd.isOdd(number) == 1 ? "Yes" : "No"));
    }
}
