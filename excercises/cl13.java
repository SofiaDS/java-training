package excercises;

/*
 * Initialize a string and a character. 
 * Write a static method that counts how
many times the given character appears in the string and prints the result
 */
public class cl13 {

    private static int countCharacterOccurrences(String str, char ch) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "Hello World!";
        char ch = 'o';
        System.out.println("The character '" + ch + "' appears " + countCharacterOccurrences(str, ch)
                + " times in the string \"" + str + "\".");
    }
}
