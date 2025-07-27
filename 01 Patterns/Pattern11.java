// Enter the number of rows: 5
// 1 
// 1 0 
// 1 0 1 
// 1 0 1 0 
// 1 0 1 0 1 

//import java.lang.*;
import java.util.*; 

class Pattern11{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for(int i=1; i<=rows; i++){
            int num = 1;
            int elements = i;
            for(int j=1; j<=elements; j++){
                System.out.print(num + " ");
                num = num ^ 1; // Toggle between 0 and 1
            }
            System.out.println();
        }

        sc.close();
    }
}