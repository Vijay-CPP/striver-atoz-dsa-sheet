import java.util.*; 

class PrintAllDivisors {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Divisors of " + n + " are:");

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(i);

                // Check if divisors are equal
                // to avoid printing the square root twice
                if (i != n / i) {
                    System.out.println(n / i);
                }
            }
        }

        sc.close();
    }
}
