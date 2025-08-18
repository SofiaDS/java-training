package excercises;

/*
 * Given three strings print the concatenation of those strings in the order
they were given and in reverse order
 */
public class StringOrfer {
    private static void reverseAndPrint(String str1, String str2, String str3) {
        // Concatenate the strings in the order they were given
        String concatenaString = str1 + str2 + str3;
        System.out.println("Concatenated String: " + concatenaString);

        // Concatenate in reverse order
        String reverseString = str3 + str2 + str1;
        System.out.println("Reversed Concatenated String: " + reverseString);
    }

    public static void main(String[] args) {
        // Example usage
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Java";
        reverseAndPrint(str1, str2, str3);
    }
}
