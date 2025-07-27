import java.util.*;
import java.math.BigInteger;

class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Method 1: Using Euclidean Algorithm
        int x = a;
        int y = b;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        System.out.println("GCD (using Euclidean algorithm): " + x);

        // Method 2: Using BigInteger built-in method
        BigInteger bigA = BigInteger.valueOf(a);
        BigInteger bigB = BigInteger.valueOf(b);
        BigInteger gcd = bigA.gcd(bigB);
        System.out.println("GCD (using BigInteger.gcd()): " + gcd);

        sc.close();
    }
}
