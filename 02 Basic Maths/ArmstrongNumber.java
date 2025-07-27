import java.util.*;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;

        // Method 1: Arithmetic method
        int sum = 0;
        int temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp /= 10;
        }

        if (sum == original) {
            System.out.println("Armstrong (using arithmetic): Yes");
        } else {
            System.out.println("Armstrong (using arithmetic): No");
        }

        // Method 2: Using String
        String str = Integer.toString(original);
        sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int digit = Integer.parseInt(str.charAt(i) + "");
            sum += Math.pow(digit, 3);
        }

        if (sum == original) {
            System.out.println("Armstrong (using String): Yes");
        } else {
            System.out.println("Armstrong (using String): No");
        }

        sc.close();
    }
}
