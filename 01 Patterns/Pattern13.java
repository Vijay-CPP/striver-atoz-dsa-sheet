// Enter the number of rows: 5
// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

//import java.lang.*;
import java.util.*; 

class Pattern13{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        int num = 1;
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        sc.close();
    }
}