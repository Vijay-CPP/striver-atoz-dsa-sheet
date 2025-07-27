import java.util.*; 

class ReverseNumber {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n; // Preserve the original number
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append it to the reversed number
            n = n / 10; // Remove the last digit from n
        }

        System.out.println("Reversed number (using arithmetic): " + reversed);

        // Alternative method using StringBuilder
        String str = Integer.toString(original);
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println("Reversed number (using StringBuilder): " + sb.toString());

        sc.close();
    }
}
