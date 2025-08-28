package excercises;

/*
 * Write a static method that extracts and prints a substring starting from the
given index (based on the number entered
 */
public class SubstringPrint {
    private static void SubstringPrintM(String str, int i) {
        // get substring starting from index i
        // check index is valid
        if (i > 0 || i < str.length()) {
            String substring = str.substring(i);
            System.out.println("Substring starting from index " + i + ": " + substring);
        } else {
            System.err.println("Index " + i + " is out of bounds for the string length " + str.length());
        }
    }

    public static void main(String[] args) {
        // Example usage
        String str = "Hello, World!";
        int index = 22;
        SubstringPrintM(str, index);
    }
}
