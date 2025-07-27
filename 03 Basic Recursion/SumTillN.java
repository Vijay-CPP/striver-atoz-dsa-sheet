//import java.lang.*;
import java.util.*; 

class SumTillN {
    private static int sum(int n) {
        if (n == 0) {
            return 0;
        }

        return n + sum(n - 1);
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Sum of numbers from 1 to " + n + " is: " + sum(n));   
        sc.close();
    }
}