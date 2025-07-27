// Enter the value of n: 4
// 4 4 4 4 4 4 4 
// 4 3 3 3 3 3 4 
// 4 3 2 2 2 3 4
// 4 3 2 1 2 3 4
// 4 3 2 2 2 3 4
// 4 3 3 3 3 3 4
// 4 4 4 4 4 4 4


//import java.lang.*;
import java.util.*;

class Pattern22 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int rows = 2 * n - 1;

        int innerStart = n;

        int innerElements = 2 * n - 1;
        int outerElements = 0;

        for (int i = 1; i <= rows; i++) {
            int outerStart = n;
            for (int j = 1; j <= outerElements; j++) {
                System.out.print(outerStart + " ");
                outerStart--;
            }

            for (int j = 1; j <= innerElements; j++) {
                System.out.print(innerStart + " ");
            }

            for (int j = 1; j <= outerElements; j++) {
                outerStart++;
                System.out.print(outerStart + " ");
            }

            if (i < n) {
                innerElements -= 2;
                outerElements++;
                outerStart--;
                innerStart--;
            } else {
                innerElements += 2;
                outerElements--;
                outerStart++;
                innerStart++;
            }

            System.out.println();
        }

        sc.close();
    }
}