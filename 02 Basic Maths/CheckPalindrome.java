import java.util.*;

class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int reversed = 0;

        // Method 1: Using arithmetic
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }

        if (original == reversed) {
            System.out.println("Palindrome (using arithmetic): Yes");
        } else {
            System.out.println("Palindrome (using arithmetic): No");
        }

        // Method 2: Using StringBuilder
        String str = Integer.toString(original);
        StringBuilder sb = new StringBuilder(str);
        String reversedStr = sb.reverse().toString();

        if (str.equals(reversedStr)) {
            System.out.println("Palindrome (using StringBuilder): Yes");
        } else {
            System.out.println("Palindrome (using StringBuilder): No");
        }

        sc.close();
    }
}
