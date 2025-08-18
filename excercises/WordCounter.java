package excercises;

/*
 * Implement a static method that counts and prints how many words are in
the sentence (words are separated by spaces)
 */
public class WordCounter {
    private static void WordCounter(String sentence) {
        // split sentences by spaces
        String[] words = sentence.split(" ");
        // count el of words[]
        int count = words.length;
        // print the number of words
        System.out.println("Number of words in the sentence: " + count);
    }

    public static void main(String[] args) {
        // Example usage
        String sentence = "This is an example sentence";
        WordCounter(sentence);
    }
}
