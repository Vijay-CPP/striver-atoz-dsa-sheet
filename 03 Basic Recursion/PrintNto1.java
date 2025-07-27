//import java.lang.*;
import java.util.*; 

class PrintNTo1 {
    private static void printNumbers(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        printNumbers(n - 1);
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Printing numbers from " + n  + " to 1 :");
        printNumbers(n);

        sc.close();
    }
}