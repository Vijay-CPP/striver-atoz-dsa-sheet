// Enter the number of rows: 5
//     A
//    ABB
//   ABCCB
//  ABCDDCB
// ABCDEEDCB

//import java.lang.*;
import java.util.*; 

class Pattern17{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        int spaces = rows - 1;
        
        for(int i=1; i<=rows; i++){
            char ch = 'A';

            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }

            for(int j=1; j<i; j++){
                ch--;
                System.out.print(ch);
            }
            
            System.out.println();
            spaces--;
        }

        sc.close();
    }
}