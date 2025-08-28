package excercises;

/*
 * Write a static method that prints the first n numbers in the Fibonacci
sequence, where n is a given positive integer
 */
public class cl17 {

    public static void main(String[] args) {
        int n = (int) (Math.random() * 20) + 1;
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...

        // build fibonacci serie
        for (int in = 0; in < n; in++) {
            if (in == 0) {
                System.out.print("0 ");
            } else if (in == 1) {
                System.out.print("1 ");
            } else {
                int a = 0, b = 1, c;
                for (int i = 2; i <= in; i++) {
                    c = a + b;
                    a = b;
                    b = c;
                    System.out.print(c + " ");
                }
            }
        }

    }
}
