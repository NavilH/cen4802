
public class main {
    public static void main(String[] args) {
        // Pass in 10 as an argument
        int n = 10;

        // Calculate the nth term using the fibonacci method
        int nthTerm = Fibonacci.fibonacci(n);

        // Output the result along with descriptive text
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + nthTerm + ".");
    }
}
