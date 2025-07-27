import java.util.Scanner;

class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the upper limit to find primes: ");
        int n = sc.nextInt();

        boolean[] isPrime = new boolean[n + 1];
        // Initialize all entries as true. A value in isPrime[i] will
        // finally be false if i is Not a prime, else true.
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                // Update all multiples of p as not prime
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        System.out.println("Prime numbers up to " + n + " are:");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
