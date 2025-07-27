//import java.lang.*;
import java.util.*; 

class Print1ToN {
    private static void printNumbers(int n) {
        if (n == 0) {
            return;
        }

        printNumbers(n - 1);
        System.out.println(n);
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Printing numbers from 1 to " + n + ":");
        printNumbers(n);

        sc.close();
    }
}