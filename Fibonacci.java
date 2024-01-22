/**
 * The Fibonacci class provides a method to calculate the nth term in the Fibonacci sequence.
 */
public class Fibonacci {

    /**
     * Recursive method to calculate the nth term in the Fibonacci sequence.
     *
     * @param n The position of the term to be calculated (non-negative integer).
     * @return The value of the nth term in the Fibonacci sequence.
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
