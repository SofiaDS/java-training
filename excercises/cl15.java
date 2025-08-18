package excercises;

/*
 * Initialize a string and a character. Write a static method that finds and
prints the index of the first occurrence of the character in the string. If the
character is not found, print a suitable message
 */
public class cl15 {
    public static void main(String[] args) {
        // Initialize a string and a character.
        String str = "Hello world!";
        char c = 'x';
        boolean isFound = false;
        int index = -1;
        String msg = "";
        for (char ch : str.toCharArray()) {
            index = str.indexOf(ch);
            if (ch == c) {
                isFound = true;
                msg = "character " + c + " in string " + str + " is found at index " + index;
                break;
            }
        }
        if (isFound) {
            System.out.println(msg);
        } else {
            System.out.println("character " + c + " in string " + str + " is not found!");
        }
    }
}
