//import java.lang.*;
import java.util.*; 

class FibonacciNumber {
    private static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
        
        sc.close();
    }
}