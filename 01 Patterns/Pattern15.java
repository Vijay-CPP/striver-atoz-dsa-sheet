// Enter the number of rows: 5
// A B C D E 
// A B C D
// A B C
// A B
// A


//import java.lang.*;
import java.util.*; 

class Pattern15{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        int elements = rows;
        for(int i=1; i<=rows; i++){
            char ch = 'A';
            for(int j=1; j<=elements; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
            elements--;
        }

        sc.close();
    }
}