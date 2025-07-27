// Enter the val of n : 5
// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

//import java.lang.*;
import java.util.*; 

class Pattern10{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the val of n : ");
        int n = sc.nextInt();

        int rows = 2*n - 1;
        int stars = 1;

        for(int i=1; i<=rows; i++){
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();
            
            if(i < n){
                stars++;
            } else {
                stars--;
            }
        }

        sc.close();
    }
}