// Enter the number of rows: 5
// *********
//  *******
//   *****
//    ***
//     *

//import java.lang.*;
import java.util.*; 

class Pattern08{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        int stars = 2 * rows - 1;
        int spaces = 0;

        for(int i=1; i<=rows; i++){
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();
            stars -= 2;
            spaces++;
        }

        sc.close();
    }
}