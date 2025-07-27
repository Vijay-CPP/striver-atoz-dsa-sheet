import java.util.*; 

class CountDigits {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n; // Preserve original value for later use
        int count = 0;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        System.out.println("Number of digits (using loop): " + count);

        // Alternative method using String
        String str = Integer.toString(n);
        count = str.length();
        System.out.println("Number of digits (using String): " + count);

        // Alternative method using LogBase10
        if (n > 0) {
            count = (int)(Math.log10(n)) + 1;
        } else if (n == 0) {
            count = 1;
        } else {
            count = (int)(Math.log10(-n)) + 1; // handle negative numbers
        }
        System.out.println("Number of digits (using log10): " + count);

        sc.close();
    }
}
