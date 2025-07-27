// Enter the val of n : 5
// 1                 1 
// 1 2             2 1
// 1 2 3         3 2 1
// 1 2 3 4     4 3 2 1
// 1 2 3 4 5 5 4 3 2 1

//import java.lang.*;
import java.util.*; 

class Pattern12{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the val of n : ");
        int n = sc.nextInt();

        int rows = n;
        int spaces = 2*n - 2;

        for(int i=1; i<=rows; i++){
            int num = 1;
            int elements = i;

            for(int j=1; j<=elements; j++){
                System.out.print(num + " ");
                num++;
            }

            for(int j=1; j<=spaces; j++){
                System.out.print("  ");
            }

            for(int j=1; j<=elements; j++){
                num--;
                System.out.print(num + " ");
            }

            System.out.println();
            spaces -= 2;
        }

        sc.close();
    }
}