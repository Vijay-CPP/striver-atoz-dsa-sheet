// Enter the value of n: 5
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *

//import java.lang.*;
import java.util.*; 

class Pattern20{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        // Input the value of n
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int stars = 1;
        int spaces = 2*n - 2;
        int row = 2*n - 1;
        
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= stars; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= stars; j++){
                System.out.print("*");
            }

            if(i < n){
                stars++;
                spaces -= 2;
            } else {
                stars--;
                spaces += 2;
            }
            System.out.println();
        }

        sc.close();
    }
}