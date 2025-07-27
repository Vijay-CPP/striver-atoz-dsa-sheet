// Enter the val of n : 5
//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *

//import java.lang.*;
import java.util.*; 

class Pattern09{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the val of n : ");
        int n = sc.nextInt();

        int rows = 2*n - 1;
        int stars = 1;
        int spaces = n - 1;

        for(int i=1; i<=rows; i++){
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();
            
            if(i < n){
                stars += 2;
                spaces--;
            } else {
                stars -= 2;
                spaces++;
            }
        }

        sc.close();
    }
}