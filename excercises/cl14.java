package excercises;

/*
 * Initialize a string. Write a static method that counts and prints how many
vowels (a, e, i, o, u) are in the string (case-insensitive)
 */
public class cl14 {
    private static int countVowels(String str) {
        // Convert the string to lowercase to make the search case-insensitive
        String lowerStr = str.toLowerCase();
        int count = 0;
        // Define the vowels to search for
        String vowels = "aeiou";
        // Iterate through each character in the string
        for (char c : lowerStr.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "Hgygtfftf!";
        System.out.println("The number of vowels in the string \"" + str + "\" is: " + countVowels(str));
    }
}
