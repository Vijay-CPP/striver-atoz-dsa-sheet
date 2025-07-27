// Enter the value of n: 5
// *****
// *   *
// *   *
// *   *
// *****

//import java.lang.*;
import java.util.*; 

class Pattern21{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int stars = n;
        int spaces = n - 2;
        int rows = n - 2;

        for(int i=1; i<=stars; i++){
            System.out.print("*");
        }
        System.out.println();

        for(int i=1; i<=rows; i++){
            System.out.print("*");
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for(int i=1; i<=stars; i++){
            System.out.print("*");
        }

        sc.close();
    }
}