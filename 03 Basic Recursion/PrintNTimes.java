
//import java.lang.*;
import java.util.*;

class PrintNTimes {
    private static void print(int n) {
        if (n == 0) {
            return;
        }

        System.out.println("Hello World! " + n);
        print(n - 1);
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        System.out.println("Printing Hello World! " + n + " times:");
        print(n);
        
        System.out.println("Done!");
        sc.close();
    }
}