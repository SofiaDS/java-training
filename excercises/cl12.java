package excercises;

public class cl12 {
    private static boolean isPalindrome(String str) {
        // remove spaces
        String stringNoSpace = str.replace(" ", "");
        // make it lowercase
        String stringLowCase = stringNoSpace.toLowerCase();
        // reverse string
        String stringReversed = new StringBuilder(stringLowCase).reverse().toString();
        return stringReversed.equals(stringLowCase);
    }

    public static void main(String[] args) {
        String str = "m u  m";
        System.out.println("is string palindrome? " + isPalindrome(str));
    }
}
